package kass.concurrente;

import java.util.ArrayList;
import java.util.List;


import kass.concurrente.modelo.cuchillo.Cuchillo;
import kass.concurrente.modelo.cuchillo.CuchilloDiamante;
import kass.concurrente.modelo.cuchillo.CuchilloOro;
import kass.concurrente.modelo.cuchillo.CuchilloPlateado;
import kass.concurrente.modelo.persona.Chef;
import kass.concurrente.modelo.persona.Persona;
import kass.concurrente.modelo.producto.Chile;
import kass.concurrente.modelo.producto.Comida;
import kass.concurrente.modelo.producto.Limon;
import kass.concurrente.modelo.producto.Platillo;
import kass.concurrente.modelo.producto.Producto;
import kass.concurrente.modelo.producto.ProductoInventario;
import kass.concurrente.modelo.producto.Sal;
import kass.concurrente.modelo.producto.Tortilla;

    
/**
 * Clase main que simula las operaciones en la cafetería
 * @author Vargas Bravo Paola
 * @version 1.0  (03 de Febrero del 2024)
 * @since Computación concurrente (2024-2)
 */

 public class Main {
    // Atributos
    private static Cuchillo cuchillo;
    /**
     * Método estático que establece el cuchillo utilizado en la cocina.
     *
     * @param cuchilloStrategy El objeto que implementa la interfaz Cuchillo y define el tipo de cuchillo.
     */
    public static void setCuchillo (Cuchillo cuchilloStrategy){
        cuchillo = cuchilloStrategy;
    }
    /**
     * Método estático que regresa el cuchillo de cocina
     *
     * @return  El objeto Cuchillo a usar.
     */
    public static Cuchillo getCuchillo(){
        return cuchillo;
    }
     /**
     * Método estático que convierte el tiempo de cocción de segundos a milisegundos.
     *
     * @param tiempoCocc El tiempo de cocción en segundos.
     * @return El tiempo de cocción convertido a milisegundos.
     */
    public static Integer convertidor (Integer tiempoCocc){
        return tiempoCocc * 1000;
    }
    public static void main(String[] args) throws InterruptedException {

        Chef chefUno ;
        Chef chefDos ;
        Chef chefTres ;
        Double cantidadFinal  = 0.0;
        Persona personaUno = new Persona("Victoria");
        Persona personaDos = new Persona("Iztli");
        Persona personaTres = new Persona("Britny") ;
        Producto p1 = new Producto("Salmón", 500.0);
        ProductoInventario pUno = new ProductoInventario("Salmón", 100.0, 1);
        Producto p2 = new Producto("Esparrago", 12.50);
        ProductoInventario pDos = new ProductoInventario("Esparrago", 10.50, 10);
        Producto p3 = new Producto("Pechuga", 100.0);
        ProductoInventario pTres = new ProductoInventario("Pechuga", 100.0, 10);
        Producto p4 = new Producto("Papa", 5.0);
        ProductoInventario pCuatro = new ProductoInventario("Papa", 5.0, 10);
        List<Producto> productos = new ArrayList<>();
        productos.add(p1);
        productos.add(p2);
        productos.add(p2);
        productos.add(p2);
        List<Producto> productos2 = new ArrayList<>();
        productos.add(p3);
        productos.add(p4);
        productos.add(p4);
        productos.add(p4);
        productos.add(p4);
        List<ProductoInventario> inventario = new ArrayList<>();
        Comida platillo = new Platillo.ConstructorPlatillo ("Salmón y Espárragos", 50)
        .conProductos(productos)
        .construir();
        Comida platillo2 = new Platillo.ConstructorPlatillo ("Pechuga con Papas", 8)
        .conProductos(productos2)
        .conPrecio(250.20)
        .construirDos();
        String linea = "————————————————————————————————————————————————————————";
        String chef = "Chef ";
        System.out.println(linea);
        System.out.println("              ☕  CAFÉTERÍA DIAMOND DOGS ☕               ");
        System.out.println(linea);
        System.out.println("— Menú del día :                                        ");
        System.out.println("——1. Salmón y Esparragos ——————————————————————————————$" + platillo.getPrecio());
        System.out.println("—— ........ ——————————————————————————————");
        System.out.println("——5. Pechuga y papas —————————————————————————$" + platillo2.getPrecio());
        System.out.println(linea);
        System.out.println("");
        setCuchillo(new CuchilloDiamante());
        System.out.println(linea);
        chefUno = new Chef("Paola", 100, getCuchillo());
        System.out.println(chef + chefUno.getNombre()+ " prepará la orden del cliente " + personaUno.getNombre());
        pUno.restarCantidad(1);
        cantidadFinal = cantidadFinal + platillo.getPrecio();
        pDos.restarCantidad(4);
        chefUno.prepararPlatillo(platillo);
        System.out.println(linea);
        System.out.println("              ☕  Cliente despachado ☕               ");
        System.out.println(linea);
        System.out.println(linea);
        setCuchillo(new CuchilloOro());
        chefDos = new Chef("Luisa", 50, getCuchillo());
        System.out.println(chef + chefDos.getNombre()+ " prepará la orden del cliente : " + personaDos.getNombre());
        pUno.restarCantidad(1);
        pDos.restarCantidad(4);
        chefDos.prepararPlatillo(platillo);
        cantidadFinal = cantidadFinal + platillo.getPrecio();
        System.out.println(linea);
        System.out.println("              ☕  Cliente despachado ☕               ");
        System.out.println(linea);

        System.out.println(linea);
        setCuchillo(new CuchilloPlateado());
        chefTres = new Chef("Janet", 80, getCuchillo());
        System.out.println(chef + chefTres.getNombre()+ " prepará la orden del cliente : " + personaTres.getNombre());
        pTres.restarCantidad(1);
        pCuatro.restarCantidad(4);
        chefTres.prepararPlatillo(platillo2);
        System.out.println(personaTres.getNombre() +" solicitó Limón,Sal,Tortilla y Chile extra en su platillo");
        System.out.println(linea);
        System.out.println("              ☕  Añadiendo Ingredientes extras ☕        ");
        System.out.println(linea);
        platillo2 = new Sal(platillo2);
        platillo2 = new Limon(platillo2);
        platillo2 = new Chile(platillo2);
        platillo2 = new Tortilla(platillo2);
        Thread.sleep((long)platillo2.getTiempoCoccion()*1000);
        Double precio = platillo2.getPrecio();
        System.out.println(linea);
        System.out.println("  Costo + Extra: "+ precio);
        System.out.println(linea);
        cantidadFinal = cantidadFinal + precio;
        System.out.println(linea);
        System.out.println("               ☕ Compra de productos ☕        ");
        System.out.println(linea);
        System.out.println(personaUno.getNombre() + " compró " + p1.getNombre() + " y " + p3.getNombre());
        pUno.restarCantidad(1);
        pTres.restarCantidad(1);
        cantidadFinal = cantidadFinal + p1.getPrecio() + p3.getPrecio();
        System.out.println(linea);
        System.out.println("                   ☕  Día Finalizado ☕               ");
        System.out.println(linea);
        System.out.println(" Recaudación :" + cantidadFinal );
        System.out.println(linea);
        System.out.println(" Inventario Status :");
        inventario.add(pUno);
        inventario.add(pDos);
        inventario.add(pTres);
        inventario.add(pCuatro);
        for (ProductoInventario pi : inventario){
            System.out.println(" Nombre :" + pi.getNombre());
            System.out.println(" Cantidad :" + pi.getCantidad());
        }
        System.out.println(linea);
    }
}