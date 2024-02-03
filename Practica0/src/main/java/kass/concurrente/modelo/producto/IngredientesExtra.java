

package kass.concurrente.modelo.producto;


public abstract class IngredientesExtra implements Comida {
    
    protected Comida platillo;

    protected IngredientesExtra(Comida platillo){
        this.platillo = platillo;
    }

    public Double getPrecio(){
        return platillo.getPrecio();
    }

    public Integer getTiempoCoccion(){
        return platillo.getTiempoCoccion();
    }

}
