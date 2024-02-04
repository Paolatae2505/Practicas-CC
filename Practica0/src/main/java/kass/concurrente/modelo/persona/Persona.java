package kass.concurrente.modelo.persona;

/**
 * Clase que modela una persona
 * @author Kassandra Mirael
 * @since Computación concurrente (2024-2)
 */
public class Persona {
    // Atributos
    protected String nombre;

    /**
     * Constructor de la clase Persona que inicializa el nombre.
     *
     * @param nombre El nombre de la persona.
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para la persona.
     *
     * @param nombre El nuevo nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
}

    
}
