package kass.concurrente.modelo.producto;


/**
 * Clase que simula el ingrediente extra Chile
 * Implementa la clase IngredientesExtra
 * @author Vargas Bravo Paola
 * @version 1.0 (01 Febrero 2024)
 * @see Comida
 * @since Computación concurrente (2024-2)
 */
public class Chile extends IngredientesExtra {
    
    /**
     * Constructor de la clase Chile.
     *
     * @param platillo El platillo al que se agregará el chile como ingrediente extra.
     */
    public Chile(Comida platillo) {
        super(platillo);
    }

    /**
     * Obtiene el precio del platillo con el chile como ingrediente extra.
     *
     * @return El precio del platillo con el chile.
     */
    @Override
    public Double getPrecio() {
        return super.getPrecio() + 2.50;
    }

    /**
     * Obtiene el nombre del ingrediente (en este caso, "Chile").
     *
     * @return El nombre del ingrediente.
     */
    @Override
    public String getNombre() {
        return "Chile";
    }

    /**
     * Obtiene el tiempo de cocción del chile.
     *
     * @return El tiempo de cocción del chile.
     */
    @Override
    public Integer getTiempoCoccion() {
        return 5;
    }

}
