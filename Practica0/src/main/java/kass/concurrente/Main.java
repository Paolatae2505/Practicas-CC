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
import kass.concurrente.modelo.producto.Limón;
import kass.concurrente.modelo.producto.Platillo;
import kass.concurrente.modelo.producto.Producto;
import kass.concurrente.modelo.producto.ProductoInventario;
import kass.concurrente.modelo.producto.Sal;
import kass.concurrente.modelo.producto.Tortilla;

    

/**
 * Clase Main
 * Aqui va toda tu simulacion
 * Genera un par de clientes para que los atienda el chef
 * @author Kassandra Mirael
 * @version 1.0
 */
public class Main {

    public static Cuchillo cuchillo;

    public static void setCuchillo (Cuchillo cuchilloStrategy){
        cuchillo = cuchilloStrategy;
    }

    public static Integer convertidor (Integer tiempo_cocc){
        return tiempo_cocc * 1000;
    }
    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        Chef chefUno ;
        Chef chefDos ;
        Chef chefTres ;
        Double CF  = 0.0;
        Persona personaUno = new Persona("Victoria");
        Persona personaDos = new Persona("Iztli");
        Persona personaTres = new Persona("Britny") ;
        //Cuchillo cuchillo;
        Producto p1 = new Producto("Salmón", 500.0);
        ProductoInventario p1_1 = new ProductoInventario("Salmón", 100.0, 1);
        Producto p2 = new Producto("Esparrago", 12.50);
        ProductoInventario p2_2 = new ProductoInventario("Esparrago", 10.50, 10);
        Producto p3 = new Producto("Pechuga", 100.0);
        ProductoInventario p3_3 = new ProductoInventario("Pechuga", 100.0, 10);
        Producto p4 = new Producto("Papa", 5.0);
        ProductoInventario p4_4 = new ProductoInventario("Papa", 5.0, 10);
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
        Comida platillo = new Platillo(productos,"Salmón y Esparragos",50);
        Comida platillo2 = new Platillo(productos2,250.20,8,"Pechuga con Papas");
        System.out.println("————————————————————————————————————————————————————————");
        System.out.println("              ☕  CAFÉTERÍA DIAMOND DOGS ☕               ");
        System.out.println("————————————————————————————————————————————————————————");
        System.out.println("— Menú del día :                                        ");
        System.out.println("——1. Salmón y Esparragos ——————————————————————————————$" + platillo.getPrecio());
        System.out.println("—— ........ ——————————————————————————————");
        System.out.println("——5. Pechuga y papas —————————————————————————$" + platillo2.getPrecio());
        System.out.println("————————————————————————————————————————————————————————");
        System.out.println("");
        setCuchillo(new CuchilloDiamante());
        System.out.println("————————————————————————————————————————————————————————");
        chefUno = new Chef("Paola", 100, cuchillo);
        System.out.println("Chef " + chefUno.getNombre()+ " prepará la orden del cliente " + personaUno.getNombre());
        p1_1.restarCantidad(1);
        CF = CF + platillo.getPrecio();
        p2_2.restarCantidad(4);
        chefUno.prepararPlatillo(platillo);
        System.out.println("————————————————————————————————————————————————————————");
        System.out.println("              ☕  Cliente despachado ☕               ");
        System.out.println("————————————————————————————————————————————————————————");
        System.out.println("————————————————————————————————————————————————————————");
        setCuchillo(new CuchilloOro());
        chefDos = new Chef("Luisa", 50, cuchillo);
        System.out.println("Chef " + chefDos.getNombre()+ " prepará la orden del cliente : " + personaDos.getNombre());
        p1_1.restarCantidad(1);
        p2_2.restarCantidad(4);
        chefDos.prepararPlatillo(platillo);
        CF = CF + platillo.getPrecio();
        System.out.println("————————————————————————————————————————————————————————");
        System.out.println("              ☕  Cliente despachado ☕               ");
        System.out.println("————————————————————————————————————————————————————————");

        System.out.println("————————————————————————————————————————————————————————");
        setCuchillo(new CuchilloPlateado());
        chefTres = new Chef("Janet", 80, cuchillo);
        System.out.println("Chef " + chefTres.getNombre()+ " prepará la orden del cliente : " + personaTres.getNombre());
        p3_3.restarCantidad(1);
        p4_4.restarCantidad(4);
        chefTres.prepararPlatillo(platillo2);
        System.out.println(personaTres.getNombre() +" solicitó Limón,Sal,Tortilla y Chile extra en su platillo");
        System.out.println("————————————————————————————————————————————————————————");
        System.out.println("              ☕  Añadiendo Ingredientes extras ☕        ");
        System.out.println("————————————————————————————————————————————————————————");
        platillo2 = new Sal(platillo2);
        platillo2 = new Limón(platillo2);
        platillo2 = new Chile(platillo2);
        platillo2 = new Tortilla(platillo2);
        Thread.sleep(platillo2.getTiempoCoccion()*1000);
        Double precio = platillo2.getPrecio();
        System.out.println("————————————————————————————————————————————————————————");
        System.out.println("  Costo + Extra: "+ precio);
        System.out.println("————————————————————————————————————————————————————————");
        CF = CF + precio;
        System.out.println("————————————————————————————————————————————————————————");
        System.out.println("                   ☕  Día Finalizado ☕               ");
        System.out.println("————————————————————————————————————————————————————————");
        System.out.println(" Recaudación :" + CF );
        System.out.println("————————————————————————————————————————————————————————");
        System.out.println(" Inventario Status :");
        inventario.add(p1_1);
        inventario.add(p2_2);
        inventario.add(p3_3);
        inventario.add(p4_4);
        for (ProductoInventario pi : inventario){
            System.out.println(" Nombre :" + pi.getNombre());
            System.out.println(" Cantidad :" + pi.getCantidad());
        }
        System.out.println("————————————————————————————————————————————————————————");
    }
}