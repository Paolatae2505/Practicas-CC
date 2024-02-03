package kass.concurrente.modelo.producto;

/**
 * Clase abstracta que simula los ingredientes extras para un platillo.
 * Implementa la interfaz Comida.
 *
 * @author Vargas Bravo Paola
 * @version 1.0 (01 Febrero 2024)
 * @see Comida
 * @since Computación concurrente (2024-2)
 */
public abstract class IngredientesExtra implements Comida {
     
    //Atributos
    protected Comida platillo;

    /**
     * Constructor que inicializa la instancia de IngredientesExtra con un platillo base.
     *
     * @param platillo El platillo al que se le agregarán los ingredientes extra.
     */
    protected IngredientesExtra(Comida platillo) {
        this.platillo = platillo;
    }

    /**
     * Obtiene el nombre del platillo con los ingredientes extra.
     *
     * @return El nombre del platillo con los ingredientes extra.
     * @see Comida#getNombre()
     */
    @Override
    public String getNombre() {
        return platillo.getNombre();
    }

    /**
     * Obtiene el precio del platillo con los ingredientes extra.
     *
     * @return El precio del platillo con los ingredientes extra.
     * @see Comida#getPrecio()
     */
    @Override
    public Double getPrecio() {
        return platillo.getPrecio();
    }

    /**
     * Obtiene el tiempo de cocción del platillo con los ingredientes extra.
     *
     * @return El tiempo de cocción del platillo con los ingredientes extra.
     * @see Comida#getTiempoCoccion()
     */
    @Override
    public Integer getTiempoCoccion() {
        return platillo.getTiempoCoccion();
    }
}
