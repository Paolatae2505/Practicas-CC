package kass.concurrente.modelo.producto;

/**
 * Clase que modela un producto de un inventario
 * @author Kassandra Mirael
 */
public class ProductoInventario extends Producto {

    private Integer cantidad;

    /**
     * Constructor que recibe nombre, precio y cantidad
     * @param nombre Nombre del producto
     * @param precio Precio del producto
     * @param cantidad Cantidad en inventario
     */
    public ProductoInventario(String nombre, Double precio, Integer cantidad) {
        super(nombre, precio);
        this.cantidad = cantidad;
    }

    /**
     * Constructor que recibe nombre y precio, con cantidad por default (10)
     * @param nombre Nombre del producto
     * @param precio Precio del producto
     */
    public ProductoInventario(String nombre, Double precio) {
        super(nombre, precio);
        this.cantidad = 10; // Por default
    }

    /**
     * Método para restar una cantidad específica del inventario
     * @param cantidadMenos Cantidad a restar
     * @throws InterruptedException Excepción lanzada si hay problemas con la operación de restar
     */
    public void restarCantidad(Integer cantidadMenos) throws InterruptedException {
        Integer resta = this.cantidad - cantidadMenos;
        if (resta <= 0) {
            System.out.println("————————————————————————————————————————————————————————");
            System.out.println("               ⚠️  ¡¡¡ ANUNCIO !!!  ⚠️                    ");
            System.out.println("————————————————————————————————————————————————————————");
            System.out.println(this.nombre + " ,agotado en stock");
            System.out.println("Espere un momento para traer más del ingrediente");
            Thread.sleep(5000);
            this.cantidad = 10;
        } else {
            this.cantidad = resta;
        }
    }

    // Getter y Setter para cantidad
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
