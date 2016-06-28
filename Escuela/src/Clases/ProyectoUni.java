/*
 Clase principal
 */
package Clases;

public class ProyectoUni {
    
   public static void main(String[]args){
      Modelo modelo = new Modelo();
      Vprincipal vista = new Vprincipal();
      new Controlador(vista,modelo).aparecer(); 
    }
}
