package kass.concurrente.modelo.producto;

public class Tortilla extends IngredientesExtra {
    
    public Tortilla(Comida platillo){
        super(platillo);

    }

    @Override
    public Double getPrecio(){
        return super.getPrecio() + 5.50;
    }

    public String getNombre(){
        return "Tortilla";
    }

    public Integer getTiempoCoccion(){
        return 5;
    }
}