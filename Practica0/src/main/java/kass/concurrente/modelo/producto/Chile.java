package kass.concurrente.modelo.producto;

import kass.concurrente.modelo.producto.Comida;

public class Chile extends IngredientesExtra {
    
    public Chile(Comida platillo){
        super(platillo);
    }

    @Override
    public Double getPrecio(){
        return super.getPrecio() + 2.50;
    }

    public String getNombre(){
        return "Chile";
    }

    public Integer getTiempoCoccion(){
        return 5;
    }
}
