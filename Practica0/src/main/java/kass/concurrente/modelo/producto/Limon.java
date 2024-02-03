package kass.concurrente.modelo.producto;


/**
 * Clase que simula el ingrediente extra Limon
 * Implementa la clase IngredientesExtra
 * @author Vargas Bravo Paola
 * @version 1.0 (01 Febrero 2024)
 * @see Comida
 * @since Computación concurrente (2024-2)
 */

public class Limon extends IngredientesExtra {

    /**
     * Constructor de la clase Limón.
     *
     * @param platillo El platillo al que se agregará el limón como ingrediente extra.
     */
    public Limon(Comida platillo) {
        super(platillo);
    }

    /**
     * Obtiene el precio del platillo con el limón como ingrediente extra.
     *
     * @return El precio del platillo con el limón.
     */
    @Override
    public Double getPrecio() {
        return super.getPrecio() + 0.50;
    }

    /**
     * Obtiene el nombre del ingrediente (en este caso, "Limón").
     *
     * @return El nombre del ingrediente.
     */
    @Override
    public String getNombre() {
        return "Limón";
    }

    /**
     * Obtiene el tiempo de cocción del limón.
     *
     * @return El tiempo de cocción del limón.
     */
    @Override
    public Integer getTiempoCoccion() {
        return 5;
    }




}
