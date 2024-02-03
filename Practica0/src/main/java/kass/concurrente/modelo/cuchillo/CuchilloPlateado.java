package kass.concurrente.modelo.cuchillo;

/**
 * Clase que simula un cuchillo especial Plateado
 * @author Vargas Bravo Paola
 * @version 1.0 (01 Febrero 2024)
 * @since Computación concurrente (2024-2)
 */
public class CuchilloPlateado implements Cuchillo {


    /**
     * Metodo que hace que cocine mas rapido al usar el cuchillo
     * @return El tiempo que reduce al usar dicho item
     */
    public int corta(){
        return 2;
    }

}
