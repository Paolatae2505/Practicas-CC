package kass.concurrente.modelo.producto;

/**
 * Interfaz que simula una comida.
 * Define métodos para obtener el precio, nombre y tiempo de cocción de la comida.
 * Implementado por clases que representan tipos específicos de comidas.
 * @author Vargas Bravo Paola
 * @version 1.0 (01 de Febrero 2024)
 * @since Computación concurrente (2024-2)
 */
public interface Comida {

    /**
     * Obtiene el precio de la comida.
     * @return El precio de la comida.
     */
    public Double getPrecio();

    /**
     * Obtiene el nombre de la comida.
     * @return El nombre de la comida.
     */
    public String getNombre();

    /**
     * Obtiene el tiempo de cocción de la comida.
     * @return El tiempo de cocción de la comida.
     */
    public Integer getTiempoCoccion();
}
