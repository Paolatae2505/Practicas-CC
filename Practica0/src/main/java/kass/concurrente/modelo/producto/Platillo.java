package kass.concurrente.modelo.producto;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que modela un platillo.
 * Implementa la interfaz Comida.
 * @author Kassandra Mirael
 * @since Computación concurrente (2024-2)
 */
public class Platillo implements Comida {

    // Atributos
    private String nombre;
    private Double precio;
    private Integer tiempoCocc;
    private List<Producto> productos = new ArrayList<>();

    /**
     * Constructor por defecto de la clase Platillo.
     * Inicializa los atributos a valores predeterminados.
     */
    public Platillo() {
        nombre = "";
        precio = 0.0;
        tiempoCocc = 0;
    }

    /**
     * Constructor de la clase Platillo con nombre y tiempo de cocción.
     * Establece el nombre y el tiempo de cocción del platillo.
     * El precio se establece por defecto en 100.0.
     * @param nombre El nombre del platillo.
     * @param tiempo_cocc El tiempo de cocción del platillo.
     */
    public Platillo(String nombre, Integer tiempoCocc) {
        this.nombre = nombre;
        this.tiempoCocc = tiempoCocc;
        this.precio = 100.0;
    }

    /**
     * Constructor de la clase Platillo con lista de productos, nombre y tiempo de cocción.
     * Establece la lista de productos, nombre y tiempo de cocción del platillo.
     * Calcula el precio total del platillo mediante el método calculaPrecio().
     * @param productos La lista de productos del platillo.
     * @param nombre El nombre del platillo.
     * @param tiempo_cocc El tiempo de cocción del platillo.
     */
    public Platillo(List<Producto> productos, String nombre, Integer tiempoCocc) {
        this.nombre = nombre;
        this.tiempoCocc = tiempoCocc;
        this.productos = productos;
        this.precio = calculaPrecio();
    }

    /**
     * Constructor de la clase Platillo con lista de productos, precio, tiempo de cocción y nombre.
     * Establece la lista de productos, precio, tiempo de cocción y nombre del platillo.
     * @param productos La lista de productos del platillo.
     * @param precio El precio del platillo.
     * @param tiempo_cocc El tiempo de cocción del platillo.
     * @param nombre El nombre del platillo.
     */
    public Platillo(List<Producto> productos, Double precio, Integer tiempoCocc, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
        this.tiempoCocc = tiempoCocc;
        this.productos = productos;
    }

    /**
     * Calcula el precio total del platillo sumando los precios de cada producto.
     * Ignora el precio base.
     * @return El precio total del platillo.
     */
    public Double calculaPrecio() {
        Double cPrecio = 0.;
        for (Producto p : productos) {
            cPrecio = cPrecio + p.getPrecio();
        }
        return cPrecio;
    }

    /**
     * Obtiene el precio del platillo.
     * @return El precio del platillo.
     */
    @Override
    public Double getPrecio() {
        return this.precio;
    }

    /**
     * Obtiene el nombre del platillo.
     * @return El nombre del platillo.
     */
    @Override
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Obtiene el tiempo de cocción del platillo.
     * @return El tiempo de cocción del platillo.
     */
    @Override
    public Integer getTiempoCoccion() {
        return this.tiempoCocc;
    }
    /**
     * Obtiene la lista de productos requeridos para el platillo.
     * @return La lista de productos requeridos para el platillo.
     */
    public List<Producto> getProductosRequeridos() {
        return this.productos;
    }
}
