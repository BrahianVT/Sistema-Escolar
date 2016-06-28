/*
Desarrollado: Brahian Velazquez Tellez
 clase para obtener los datos de el administrador
 */
package Clases;
 //realizaremos los get's y set't para dar y obtener los datos de el administrador
public class Administrador {
    public Administrador(){}
    private String id,contra,nombre;

    public String getId() {return id;}

    public String getContra() {return contra;}

    public String getNombre() {  return nombre;}

    public void setId(String id) { this.id = id; }

    public void setContra(String contra) {this.contra = contra; }

    public void setNombre(String nombre) {this.nombre = nombre;}
    
}
