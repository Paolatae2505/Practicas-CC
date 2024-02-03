package kass.concurrente.modelo.cuchillo;


/**
 * Interfaz que simulará un cuchillo 
 * @author Kassandra Mirael
 * @version 1.0 
 * @since Computación concurrente (2024-2)
 */
public interface Cuchillo {

    /**
     * Metodo que hace que cocine mas rapido al usar el cuchillo
     * @return El tiempo que reduce al usar dicho item
     */
    public int corta();
}
