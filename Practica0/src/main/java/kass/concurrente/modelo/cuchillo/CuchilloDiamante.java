package kass.concurrente.modelo.cuchillo;

/**
 * Clase que simula un cuchillo especial de diamante
 * @author Kassandra Mirael
 * @version 1.0 (01 Febrero 2024)
 * @since Computación concurrente (2024-2)
 */
public class CuchilloDiamante implements Cuchillo{

   
    /**
    * Metodo que hace que cocine mas rapido al usar el cuchillo
    * @return El tiempo que reduce al usar dicho item
    */
    public int corta (){
        return 15;
    }
}
