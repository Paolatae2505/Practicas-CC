package kass.concurrente.modelo.producto;

/**
 * Clase que representa el ingrediente extra "Tortilla".
 * Extiende de IngredientesExtra y agrega funcionalidad específica a la tortilla.
 * @author Vargas Bravo Paola
 * @version 1.0 (01 de Febrero 2024)
 * @since Computación concurrente (2024-2)
 */
public class Tortilla extends IngredientesExtra {
    
    /**
     * Constructor de la clase Tortilla.
     * @param platillo La comida a la que se agregará la tortilla como ingrediente extra.
     */
    public Tortilla(Comida platillo){
        super(platillo);
    }

    /**
     * Obtiene el precio total del platillo con la tortilla como ingrediente extra.
     * @return El precio total del platillo con la tortilla.
     */
    @Override
    public Double getPrecio(){
        return super.getPrecio() + 5.50;
    }

    /**
     * Obtiene el nombre del ingrediente ("Tortilla").
     * @return El nombre del ingrediente.
     */
    @Override
    public String getNombre(){
        return "Tortilla";
    }

    /**
     * Obtiene el tiempo de cocción asociado a la tortilla.
     * @return El tiempo de cocción de la tortilla.
     */
    @Override
    public Integer getTiempoCoccion(){
        return 5;
    }
}
