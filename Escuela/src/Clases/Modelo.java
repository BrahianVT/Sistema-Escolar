/*
Desarrollado: Brahian Velazquez Tellez
 clase para desarrollar el modelo 
 */
package Clases;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
class Modelo extends ConexionBaseDatos{
    //creamos un objeto de la clase universitario y Administrador
    public Universitario universitario = new Universitario();
    public Administrador administrador = new Administrador();
    public Modelo(){}
    
    //metodo para identificarse en el sistema
    
    public boolean ingresar(String numero_carnet, String contra){
        //utilizamos el metodo de la clase ConexionBaseDatos para auntentificarnos
        Object res[][] = this.select("universitario", "u_cu , u_ci , u_nombre ", "u_cu='"+numero_carnet+"' AND u_ci='"+contra+"' ");
        if(res.length > 0){
            universitario.setCarnetUniversitario(res[0][0].toString());
            universitario.setContra(res[0][1].toString());
            universitario.setNombre(res[0][2].toString());
            universitario.setMatricula(generarMatricula());
            return true;
        }
        else
            return false;
    }
    
    //metodo para ingresar el administrador
    public boolean ingresarAdmi(String contra , String nombre){
        Object res[][] = this.select("administradores" , " idAdmin , Contrasenia , Nombre" , " Nombre='"+nombre+"' AND Contrasenia='"+contra+"' ");
        if(res.length >0){
            administrador.setId(res[0][0].toString());
            administrador.setNombre(res[0][1].toString());
            administrador.setContra(res[0][2].toString());
            return true;
        }
        else{
            return false;
        }
    }
    
    //metodo para obtener las asignaturas de algun estudiante
    public Object[][] getAsignaturas(){
        Object[][] res = this.select("materia", "m_sigla, m_nombre , m_curso, m_tipo", null);
        if(res.length > 0)
            return res;
        else
            return null;
    }
    //metodos para obtener todos los universtarios
    public Object[][] getUniversitarios(){
        Object[][] res = this.select("universitario", "u_cu ,u_ci, u_nombre", null);
        if(res.length > 0) 
            return res;
        else
            return null;
            
    }
    //metodos para obtener todos las programaciones
    public Object[][] getProgramaciones(){
        Object[][] res = this.select("programacion", "p_matricula ,p_univ, p_materia, p_grupo", null);
        if(res.length > 0) 
            return res;
        else
            return null;
            
    }
    //metodos para obtener materias programadas de un estudiante
     public Object[][] getMateriasProgramadas(String carnet_universitario){
         //inner join ---> unir tablas
        Object[][] res = this.select("materia inner join programacion on m_sigla = p_materia ",
                                     " m_sigla, m_nombre, m_curso, m_tipo, p_grupo"
                                     ,"p_univ ='"+carnet_universitario+" '");
        if(res.length > 0) 
            return res;
        else
            return null;
            
    }
     //metodo para programar las asignaturas elegidas por los estudiantes
     public boolean programarMaterias(String[] materias , String [] grupos){
         //crea una nueva matricula de programacion , gestion 16/2
         String gestion = "16/2";
         if(this.insert("matricula"," m_id , m_gestion , m_fecha" ,
                  " '" + this.universitario.getMatricula()+"' , '" + gestion+"' , now() " ))
            System.out.println("Aqui no llega");
         for(int i = 0; i<materias.length; i++){
             if(materias[i] != null){
                 this.insert("programacion" 
                         ,"p_matricula , p_univ , p_materia , p_grupo "
                         , " '"+ this.universitario.getMatricula() + "', '" + this.universitario.getCarnetUniversitario() +"' ,'" + materias[i]+"', '" + grupos[i] + "' ");
                 System.out.println("p_univ " + this.universitario.getCarnetUniversitario());
             }
         }
        return true;
     }
     
     //metodo para saber si un estudante ya esta programado
     public boolean estaProgramado(String carnet_universitario){
         System.out.println("carnet univrsitaio " + carnet_universitario);
         Object res[][] = this.select("programacion", "p_matricula" ,"p_univ='" + carnet_universitario + "' ");
         if(res.length > 0){
             universitario.setMatricula(res[0][0].toString() );
             return true;
         }
         else return false;
     }
     
     //metodo para imprimir la programacion en ireport 
     public void imprimir(){
         new Reporte(this.getConnection()).ver_reporte(this.universitario.getCarnetUniversitario(), this.universitario.getContra(), this.universitario.getNombre(), this.universitario.getMatricula());
     }
     
     //generamos las matriculas alleatorias
     private String generarMatricula(){
         String codigo = " BVT-";
         for (int i = 0; i<2; i++){
             int num = (int)(Math.random()*9+1);
             codigo += num;
         }
         return codigo;
     }
     
     //--------------------------- administración ---------------------------------------------------------------------------
     
     //metodo para registrar a un estudiante
     
     public void insertarUniversitario(String carnet , String contra , String nombre){
         this.insert("universitario" , " u_cu, u_ci, u_nombre" , " '" + carnet + "', '" + contra + "', '" + nombre + "' ");
         JOptionPane.showMessageDialog(null , "Universitario agregado  correctamente");
     }
     
     // insertar asignatura
     public void insertarAsignatura(String sigla , String nombre , String curso , String tipo){
         this.insert("materia" , " m_sigla, m_nombre, m_curso, m_tipo" , " '" + sigla + "', '" + nombre + "', '" + curso + "', '" + tipo+ "' ");
         JOptionPane.showMessageDialog(null , "Materia Agregada  correctamente");
     }
     
     //insertar programacion
     
     public void insertarProgramacion(String matricula , String universitario , String materia , String grupo){
        this.insert("programacion" , " p_matricula, p_univ, p_materia, p_grupo" , " '" + matricula + "', '" + universitario + "', '" + materia + "', '" + grupo+ "' ");
         JOptionPane.showMessageDialog(null , "Materia programada  correctamente");
     }
     
     //eliminar estudiante
     
     public void eliminarUniversitario(String condicion){
         this.delete("universitario", "u_cu='" + condicion + "' ");
         JOptionPane.showMessageDialog(null , "Se elimino correctamente a universitario");
     }
     
     //eliminar asignatura
     public void eliminarAsignatura(String condicion){
         this.delete("materia", "m_sigla='" + condicion + "' ");
         JOptionPane.showMessageDialog(null , "Se elimino correctamente la asigntura");
     }
     //eliminar asignatura
     public void eliminarProgramacion(String condicion){
         this.delete("programacion", "p_materia='" + condicion + "' ");
         JOptionPane.showMessageDialog(null , "Se elimino correctamente la programacion");
     }
     
     //para modificar datos en la base de datos del universitario
     public void modificarUniver(String carnet , String contra , String nombre){
         try{
             PreparedStatement pstm = this.getConnection().prepareStatement("update universitario set u_cu='" + carnet + "', u_ci='" +contra+ "', u_nombre='"
                                                                                + nombre +"' "+ "where u_cu='" +carnet + "' ");
             pstm.execute();
             pstm.close();
              JOptionPane.showMessageDialog(null , "Datos de " + nombre+ " se modifico correctamente");
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null ,e);
         }
     }
     // metodo para modificar una asignatura
     public void modificarAsignatura(String sigla , String nombre , String curso , String tipo){
         try{
             PreparedStatement pstm = this.getConnection().prepareStatement("update materia set m_sigla='" + sigla + "', m_nombre='" +nombre+ "', m_curso='"
                                                                                + curso +"', m_tipo='"+tipo+"'"+ "where m_sigla='" +sigla + "' ");
             pstm.execute();
             pstm.close();
              JOptionPane.showMessageDialog(null , "asignatura " + nombre+ " se modifico correctamente");
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null ,e);
         }
     } 
     //metodo para modificar una programacion
     public void modificarProgramacion(String matricula , String universitario , String materia , String grupo){
         try{System.out.println(matricula + universitario + materia + grupo);
             PreparedStatement pstm = this.getConnection().prepareStatement("update programacion set p_matricula='" + matricula + "', p_univ='" +universitario+ "', p_materia='"
                                                                                + materia +"', p_grupo='"+grupo+"' "+ "where p_matricula='" +matricula + "' " + "and p_materia='"+materia + "' ");
             pstm.execute();
             pstm.close();
              JOptionPane.showMessageDialog(null , "La programacion del universitario " + universitario+ " se modifico correctamente");
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null ,e);
         }
     }
}
