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

        // Constructor privado para el Builder
        private Platillo() {
        }
    
        /**
         * Clase Builder para construir un Platillo.
         */
        public static class ConstructorPlatillo {
            private String nombre;
            private Double precio = 100.0; // Valor predeterminado
            private Integer tiempoCocc;
            private List<Producto> productos = new ArrayList<>();
    
            /**
             * Constructor del Builder con nombre y tiempo de cocción requeridos.
             *
             * @param nombre    El nombre del platillo.
             * @param tiempoCocc El tiempo de cocción del platillo.
             */
            public ConstructorPlatillo (String nombre, Integer tiempoCocc) {
                this.nombre = nombre;
                this.tiempoCocc = tiempoCocc;
            }

            /**
             * Constructor del Builder sin parametros
             */
            public ConstructorPlatillo () {
                nombre = "";
                precio = 0.0;
                tiempoCocc = 0;
                productos = new ArrayList<>();
            }
    
            /**
             * Establece la lista de productos del platillo.
             *
             * @param productos La lista de productos del platillo.
             * @return El propio Builder para encadenar llamadas.
             */
            public ConstructorPlatillo  conProductos(List<Producto> productos) {
                this.productos = productos;
                return this;
            }
    
            /**
             * Establece el precio del platillo.
             *
             * @param precio El precio del platillo.
             * @return El propio Builder para encadenar llamadas.
             */
            public ConstructorPlatillo  conPrecio(Double precio) {
                this.precio = precio;
                return this;
            }
    
            /**
             * Construye un objeto Platillo utilizando los valores configurados en el Builder.
             *
             * @return El Platillo construido.
             */
            public Platillo construir() {
                Platillo platillo = new Platillo();
                platillo.nombre = this.nombre;
                platillo.tiempoCocc = this.tiempoCocc;
                platillo.productos = this.productos;
                platillo.precio = platillo.calculaPrecio(); // Calcular el precio
                return platillo;
            }

             /**
             * Construye un objeto Platillo utilizando los valores configurados en el Builder.
             *
             * @return El Platillo construido.
             */
            public Platillo construirDos() {
                Platillo platillo = new Platillo();
                platillo.nombre = this.nombre;
                platillo.tiempoCocc = this.tiempoCocc;
                platillo.productos = this.productos;
                platillo.precio = this.precio;
                return platillo;
            }
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
