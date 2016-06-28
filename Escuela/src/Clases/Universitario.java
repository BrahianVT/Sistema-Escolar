/*
Desarrollado: Brahian Velazquez Tellez
 clase para obtener los datos de los universitarios
 */
package Clases;
public class Universitario {
    private String carnet_universitario, nombre,contra,matricula;
    
    //realizaremos los get's y set't para dar y obtener los datos de el universitario
    public void setCarnetUniversitario(String carnet_universitario){
        this.carnet_universitario = carnet_universitario;
        //System.out.println("Se a asignado carnet " + carnet_universitario);
    }
    public String getCarnetUniversitario(){ return carnet_universitario;}
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){return nombre;}
    
    public void setContra(String contra){
        this.contra = contra;
    }
    public String getContra(){return contra;}
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
        //System.out.println("Se a asignado matricula");
    }
    public String getMatricula(){return matricula;}
}
