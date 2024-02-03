package kass.concurrente.modelo.producto;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que modela un platillo
 * @author Kassandra Mirael
 */
public class Platillo implements Comida {

    private String nombre;
    private Double precio;
    private Integer tiempo_cocc;
    private List <Producto> productos = new ArrayList<>();

    public Platillo(){
        nombre = "";
        precio = 0.0;
        tiempo_cocc = 0;
    }

    public Platillo(String nombre,Integer tiempo_cocc) {
        this.nombre = nombre;
        this.tiempo_cocc = tiempo_cocc;
        this.precio = 100.0;
    }

    public Platillo(List<Producto> productos, String nombre,Integer tiempo_cocc){
        this.nombre  = nombre;
        this.tiempo_cocc = tiempo_cocc;
        this.productos = productos;
        this.precio = calculaPrecio();
     }

    public Platillo(List<Producto> productos, Double precio,Integer tiempo_cocc, String nombre){
       this.precio = precio;
       this.nombre  = nombre;
       this.tiempo_cocc = tiempo_cocc;
       this.productos = productos;
    }
    
    /**
     * Este metodo calcula el precio sobre el precio de los items, se ignora
     * el precio base.
     * @return El precio de la suma de cada item utilizado
     */
    public Double calculaPrecio(){
        Double cPrecio = 0.;
        for(Producto p : productos){
          
            cPrecio = cPrecio + p.getPrecio();
        }
        return cPrecio;
    }

    public Double getPrecio(){
           return this.precio;
    }

    public String getNombre(){
       return this.nombre;
    }

    public Integer getTiempoCoccion(){
        return this.tiempo_cocc;
    }

    public List<Producto> getProductosRequeridos(){
        return this.productos;
    }
}
