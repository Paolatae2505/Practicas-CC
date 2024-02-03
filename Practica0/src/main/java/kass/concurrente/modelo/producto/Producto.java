package kass.concurrente.modelo.producto;

/**
 * Clase que modela un producto.
 * Representa un artículo genérico con un nombre y un precio.
 * @author Kassandra Mirael
 * @since Computación concurrente (2024-2)
 */
public class Producto {

    // Atributos
    protected Double precio;
    protected String nombre;

    /**
     * Constructor de la clase Producto con nombre y precio.
     * @param nombre El nombre del producto.
     * @param precio El precio del producto.
     */
    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Constructor por defecto de la clase Producto.
     * Inicializa el nombre a una cadena vacía y el precio a 0.0.
     */
    public Producto() {
        this.nombre = "";
        this.precio = 0.0;
    }

    /**
     * Obtiene el precio del producto.
     * @return El precio del producto.
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     * @param precio El nuevo precio del producto.
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el nombre del producto.
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     * @param nombre El nuevo nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
