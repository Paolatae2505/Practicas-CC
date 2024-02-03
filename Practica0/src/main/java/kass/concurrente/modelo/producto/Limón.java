package kass.concurrente.modelo.producto;

public class Limón extends IngredientesExtra {

    
    public Limón(Comida platillo){
        super(platillo);

    }

    @Override
    public Double getPrecio(){
        return super.getPrecio() + 0.50;
    }

    public String getNombre(){
        return "Limón";
    }

    public Integer getTiempoCoccion(){
        return 5;
    }



}
