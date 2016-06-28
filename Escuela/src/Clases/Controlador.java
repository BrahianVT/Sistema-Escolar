/*
 /*
Desarrollado: Brahian Velazquez Tellez
 clase para desarrollar el controlador
 */
package Clases;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {
    //declaramos un objeto de la clase principal
    private Vprincipal vista;
    private Modelo modelo;
    //formularios hijos
    logueo formLogin = new logueo(vista , true);
    Asignaturas formProgramacion = new Asignaturas(vista , true);
    Asignaturas formImpresion= new Asignaturas(vista , false);
    AcercaDe info = new AcercaDe(vista, true);
    
    //en nuestro constructor inicializamos nuestros objetos
    public Controlador( Vprincipal vista , Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
        iniciar();
    }
    public void aparecer(){this.vista.setVisible(true);}
    
    private void iniciar(){
        //se añaden las acciones a los controles del formulario padre
        this.vista.boton_iniciar_sesion.setActionCommand("Abrir Sesion");
        this.vista.boton_salir.setActionCommand("Cerrar Sesion");
        this.vista.boton_programar.setActionCommand("Programar Asignaturas");
        this.vista.boton_imprimir.setActionCommand("Ver Programacion");
        this.vista.boton_acerca_de.setActionCommand("Acerca de"); 
        this.formLogin.boton_iniciar.setActionCommand("Ingresar");
        this.formProgramacion.boton_programar.setActionCommand("Programar");
        this.formProgramacion.boton_cancelar.setActionCommand("Cancelar");
     
        //ponemos a escuchar las accioenes del usuario
        vista.boton_iniciar_sesion.addActionListener(this);
        vista.boton_salir.addActionListener(this);
        vista.boton_programar.addActionListener(this);
        vista.boton_imprimir.addActionListener(this);
        vista.boton_acerca_de.addActionListener(this);
        formLogin.boton_iniciar.addActionListener(this);
        formProgramacion.boton_programar.addActionListener(this);
        formProgramacion.boton_cancelar.addActionListener(this);
        
        //activamos en un principio solo el boton programar y acerca de.
        this.vista.boton_imprimir.setEnabled(false);
        this.vista.boton_iniciar_sesion.setEnabled(true);
        this.vista.boton_salir.setEnabled(false);
        this.vista.Boton_administrar.setEnabled(false);  
        this.vista.boton_programar.setEnabled(false);    
    }
    
    //atendemos las peticiones del usuaio
    public void actionPerformed(ActionEvent e){
        String comando = e.getActionCommand();
        
        //acciones del comndo padre
        if(comando.equals("Abrir Sesion")){
            formLogin.setVisible(true); 
            
        }else if (comando.equals("Cerrar Sesion")){
            this.vista.boton_imprimir.setEnabled(false);
            this.vista.boton_iniciar_sesion.setEnabled(true);
            this.vista.boton_salir.setEnabled(false);
            this.vista.boton_programar.setEnabled(false);  
        }
        if(comando.equals("Programar Asignaturas")){
            //comprobar que usuario ya este programado
            if(this.modelo.estaProgramado( this.modelo.universitario.getCarnetUniversitario())){
                JOptionPane.showMessageDialog(this.vista,"Universitario programado");
            }else{
                form_programacion();
                formProgramacion.setVisible(true);
            }
        }else if(comando.equals("Ver Programacion")){
            //comprobar que usuario este programado
            if(this.modelo.estaProgramado( this.modelo.universitario.getCarnetUniversitario())){
                form_imprimir();
                formImpresion.setVisible(true);
            }else{
                 JOptionPane.showMessageDialog(this.vista,"No hay materias programadas");
            }
        }
        
        ////////////////// Acciones de respuesta al formulario del login
        if(comando.equals("Ingresar")){
            if(this.modelo.ingresar(this.formLogin.tf_usuario.getText(), this.formLogin.pf_contra.getText())){
                //si los datos son correctos cerrar la ventana de logeo
                formLogin.dispose();
                //desabilitamos y habilitamos segun corresponda
                this.vista.boton_imprimir.setEnabled(true);
                this.vista.boton_iniciar_sesion.setEnabled(false);
                this.vista.boton_salir.setEnabled(true);
                this.vista.boton_programar.setEnabled(true);  
            }else if(this.modelo.ingresarAdmi(this.formLogin.pf_contra.getText(), this.formLogin.tf_usuario.getText())){
                 //desabilitamos y habilitamos segun corresponda
                this.vista.boton_imprimir.setEnabled(false);
                this.vista.boton_iniciar_sesion.setEnabled(false);
                this.vista.boton_salir.setEnabled(true);
                this.vista.boton_programar.setEnabled(false);  
                this.vista.Boton_administrar.setEnabled(true);
                formLogin.dispose();
             }else{
                 JOptionPane.showMessageDialog(vista, "Error datos incorrectos");
             }
        
        }
        //Acciones del formulario programacion
        if(comando.equals("Programar")){
            //pedir confirmacion
            int confirmacion = JOptionPane.showConfirmDialog(this.vista,"Revise cuidadosamente las materias que se programa \n se procedera a incribirse");
            //si presiona ok
            if(confirmacion == JOptionPane.OK_OPTION){
                // se obtiene un array de las materias seleccionadas
                String []listaMaterias= this.formProgramacion.jcTablaAsignatura1.getFilasSeleccionadas();
               //se obtiene un array con los grupos de las materias
                String[]listaGrupos = this.formProgramacion.jcTablaAsignatura1.getGruposSeleccionados();
                // procedemos a la programacion de las materias
                if(this.modelo.programarMaterias(listaMaterias, listaGrupos)){
                    JOptionPane.showMessageDialog(this.vista,"Programacion Finalizada");
                    formProgramacion.dispose();
                    //mostramos la impresion
                    form_imprimir();    
                }else{
                    JOptionPane.showMessageDialog(this.vista,"Error nose pudo finalizar la programacion");
                }    
            }
        }else if (comando.equals("Salir")){formProgramacion.dispose();}
        
        //acciones para visualizar la impresion
        if(comando.equals("Ver Reporte")){
            this.modelo.imprimir(); 
        }else if (comando.equals("Salir Impresion")){
            formImpresion.dispose();
        }
    } 
    //metodo para programar materias
    private void form_programacion(){
        //se llenan datos en la tabla asignaturas
        Object datos[][] = this.modelo.getAsignaturas();
        if(datos != null){
            int limite = (datos.length >=10)?10 : datos.length;
            for (int i = 0; i<this.formProgramacion.jcTablaAsignatura1.getNumFilas(); i++){
                if(i <limite){
                    this.formProgramacion.jcTablaAsignatura1.getFila(i).setNum(String.valueOf(i+1));
                    this.formProgramacion.jcTablaAsignatura1.getFila(i).setSigla(datos[i][0].toString());
                    this.formProgramacion.jcTablaAsignatura1.getFila(i).setNombre(datos[i][1].toString());
                    this.formProgramacion.jcTablaAsignatura1.getFila(i).setCurso(datos[i][2].toString());
                    this.formProgramacion.jcTablaAsignatura1.getFila(i).setTipo(datos[i][3].toString());
                }else{
                     this.formProgramacion.jcTablaAsignatura1.getFila(i).setHabilitar(false);
                    this.formProgramacion.jcTablaAsignatura1.getFila(i).setNum("");
                    this.formProgramacion.jcTablaAsignatura1.getFila(i).setSigla("");
                    this.formProgramacion.jcTablaAsignatura1.getFila(i).setNombre("");
                    this.formProgramacion.jcTablaAsignatura1.getFila(i).setCurso("");
                    this.formProgramacion.jcTablaAsignatura1.getFila(i).setTipo("");
                }
            }
        }
    }
    private void form_imprimir(){
        Object[][] datos = this.modelo.getMateriasProgramadas(this.modelo.universitario.getCarnetUniversitario());
        if(datos!= null){
            int limite = (datos.length >=10)?10 : datos.length;
            for(int i = 0; i < this.formImpresion.jcTablaAsignatura1.getNumFilas(); i++){
                if(i < limite){System.out.println(i);
                    this.formImpresion.jcTablaAsignatura1.getFila(i).setNum(String.valueOf(i+1));
                    this.formImpresion.jcTablaAsignatura1.getFila(i).setSigla(datos[i][0].toString());
                    this.formImpresion.jcTablaAsignatura1.getFila(i).setNombre(datos[i][1].toString());
                    this.formImpresion.jcTablaAsignatura1.getFila(i).setCurso(datos[i][2].toString());
                    this.formImpresion.jcTablaAsignatura1.getFila(i).setTipo(datos[i][3].toString());
                    this.formImpresion.jcTablaAsignatura1.getFila(i).setGrupo(datos[i][4].toString());
                }else{
                    this.formImpresion.jcTablaAsignatura1.getFila(i).setHabilitar(false);
                    this.formImpresion.jcTablaAsignatura1.getFila(i).setNum("");
                    this.formImpresion.jcTablaAsignatura1.getFila(i).setSigla("");
                    this.formImpresion.jcTablaAsignatura1.getFila(i).setNombre("");
                    this.formImpresion.jcTablaAsignatura1.getFila(i).setCurso("");
                    this.formImpresion.jcTablaAsignatura1.getFila(i).setTipo("");
                }
            }
        }
        //activamos los botones que estan abajo de la tabla
        this.formImpresion.boton_programar.setText("Vista Impresion");
        this.formImpresion.boton_programar.setActionCommand("Ver Reporte");
        this.formImpresion.boton_cancelar.setText("Cerrar Ventana");
        this.formImpresion.boton_cancelar.setActionCommand("Salir Impresion");
        this.formImpresion.boton_programar.addActionListener(this);
        this.formImpresion.boton_cancelar.addActionListener(this);
}
}