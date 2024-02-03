package kass.concurrente.modelo.persona;

/**
 * Clase que modela una persona
 * @author Kassandra Mirael
 */
public class Persona {

    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
      this.nombre =  nombre;
    }
    
}
