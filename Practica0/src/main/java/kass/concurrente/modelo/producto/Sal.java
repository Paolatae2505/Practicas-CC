package kass.concurrente.modelo.producto;

public class Sal extends IngredientesExtra {
    
    public Sal(Comida platillo){
        super(platillo);

    }

    @Override
    public Double getPrecio(){
        return super.getPrecio() + 0.50;
    }

    public String getNombre(){
        return "Sal";
    }

    public Integer getTiempoCoccion(){
        return 5;
    }
}
