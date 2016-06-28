/*
Desarrollado: Brahian Velazquez Tellez
 clase para realizar la conexion de la aplicación con la base 
de datos.
 */
package Clases;
import java.sql.*;
public class ConexionBaseDatos {
    //declaramos las variables para hacer la conexión
    private String bd = "db_programacion";
    private String login = "root";
    private String contra = "";
    private String url = "jdbc:mysql://localhost/" + bd;
    private Connection conn = null;
    //en el contructor de la clase realizar lo siguiente:
    public ConexionBaseDatos(){
        try{   //obtenemos el driver de mysql
            Class.forName("com.mysql.jdbc.Driver");
            //realizamos la conexion a la base de datos
            conn = DriverManager.getConnection(url,login,contra);
            if(conn != null) 
                System.out.println("Conexion  a base de dato " + bd + " realziada exitosamente");
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
    
    //creamos un metodo para obtener la conexion con la clase Connection
    public Connection getConnection(){ return this.conn;}
    
    /*
    Crearemos un metodo para realizar consulta ala base de datos
    entrada: metemos la tabla  , los campos y demas parametros para realizar la consulta de SQL
    salida: variable object[][] que regresa los datos resultantes de lo contrario null
    en ontras palabras regresa en formato de matriz de String la consulta executada.
    */
    public Object [][] select(String tabla , String campos, String where){
        int registros = 0;
        String colname[]= campos.split(",");
        //se realiza la consultas sql
        String consulta1 = "select " + campos + " from " + tabla;
        String consulta2 = "select count(*) as total from " + tabla;
        //para  buscar con alguna condicion o filtro verificamos el where
        if (where != null){
            consulta1+=" where " + where;
            consulta2+=" where " + where;
        }
         //System.out.println(consulta1);
        //System.out.println(consulta2);
        try{
            // crealizamos la consulta a mysql
            //primero preparamos la consulta y la ejecutamos
            PreparedStatement pstm = conn.prepareStatement(consulta2);
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        
        //creamos una matriz con tantas filas y columnas obtenidas en la consulta
        Object data[][] = new String[registros][campos.split(",").length];
        //llenamos la matriz en case de obtenerse datos
        try{
            PreparedStatement pstm = conn.prepareStatement(consulta1);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while(res.next()){
                for(int j = 0; j<= campos.split(",").length-1; j++ ){
                    data[i][j] = res.getString( colname[j].trim() );}
                i++;
            }
            res.close();
        }catch (SQLException e){
            System.out.println(e);
        }
        return data;
    }
    //creamos un metodo para insertar a la base de datos
    public boolean insert(String tabla, String campos, String valores){
        boolean resultado = false;
        //creamos la consulta
        String consulta = "insert into " + tabla + " ( " + campos + " ) values ( " + valores + " ) ";
        //ejecutamos la consulta
        try{
            PreparedStatement pstm = conn.prepareStatement(consulta);
            pstm.execute();
            pstm.close();
            resultado = true;
        }catch(SQLException e){
            System.out.println(e);
         }
        return resultado;
    }
    
    //creamos un metodo para actualizar en base de datos
    public void update(String tabla , String columna, String valor, String condicion){
        String sentencia = " update " + tabla + 
                " set " + columna + "=" + valor +
                " where "+ condicion;
        //ejecutamos la consulta
        try{
            PreparedStatement pstm = conn.prepareStatement(sentencia);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    //creamos un metodo para borrar de nuestra base de datos
    public void delete(String tabla, String condicion){
        String sentencia = " delete  from " + tabla+
                " where "+ condicion;
        try{
            PreparedStatement pstm = conn.prepareStatement(sentencia);
            pstm.executeUpdate();
            pstm.close();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    //metodo para cerrar conexion a la base de datos
    public void desconectar(){
        conn =null;
        System.out.println("La conexion a la base de datos" + bd + "a terminado");
    }
}
