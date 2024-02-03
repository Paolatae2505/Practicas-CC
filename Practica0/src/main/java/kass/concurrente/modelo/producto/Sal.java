package kass.concurrente.modelo.producto;

/**
 * Clase que modela el ingrediente extra Sal
 * Implementa la clase IngredientesExtra
 * @author Vargas Bravo Paola
 * @version 1.0 (01 de Febrero 2024)
 * @since Computación concurrente (2024-2)
 */
public class Sal extends IngredientesExtra {
    
    /**
     * Constructor de la clase Sal.
     * @param platillo La comida a la que se agregará la sal como ingrediente extra.
     */
    public Sal(Comida platillo){
        super(platillo);
    }

    /**
     * Obtiene el precio total del platillo con la sal como ingrediente extra.
     * @return El precio total del platillo con la sal.
     */
    @Override
    public Double getPrecio(){
        return super.getPrecio() + 0.50;
    }

    /**
     * Obtiene el nombre del ingrediente ("Sal").
     * @return El nombre del ingrediente.
     */
    @Override
    public String getNombre(){
        return "Sal";
    }

    /**
     * Obtiene el tiempo de cocción asociado a la sal.
     * @return El tiempo de cocción de la sal.
     */
    @Override
    public Integer getTiempoCoccion(){
        return 5;
    }
}
