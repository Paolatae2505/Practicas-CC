package kass.concurrente.modelo.producto;

/**
 * Clase que modela un producto
 * @author Kassandra Mirael
 */
public class Producto {

    protected Double precio;
    protected String nombre;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {
        this.nombre = "";
        this.precio = 0.0;
    }

    // Getter y Setter para precio
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
