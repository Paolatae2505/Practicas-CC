package kass.concurrente.modelo.persona;


import kass.concurrente.modelo.producto.Comida;
import kass.concurrente.modelo.cuchillo.Cuchillo;

public class Chef extends Persona {

    private Cuchillo cuchillo;
    private Integer experiencia;

    public Chef(String nombre, Integer experiencia, Cuchillo cuchillo) {
        super(nombre);
        this.cuchillo = cuchillo;
        this.experiencia = experiencia;
    }

    public void prepararPlatillo(Comida platillo) {
        System.out.println("————————————————————————————————————————————————————————");
        System.out.println("            ☕ Preparando " + platillo.getNombre());
        System.out.println("————————————————————————————————————————————————————————");  
        System.out.println("Tiempo de cocción : " + platillo.getTiempoCoccion() + " unidades de tiempo"); 
        for (int i = 0 ; i <= platillo.getTiempoCoccion(); i = i + cuchillo.corta()){
        System.out.println("---------------------------------------------------------");
        System.out.println("            ⌚ Unidad de tiempo : " + i);
        System.out.println("---------------------------------------------------------"); 
        }
        System.out.println("————————————————————————————————————————————————————————");
        System.out.println("            🍽️ Platillo "+ platillo.getNombre() + " listo");
        System.out.println("————————————————————————————————————————————————————————");  
        
    }

    // Getter y Setter para Cuchillo
    public Cuchillo getCuchillo() {
        return this.cuchillo;
    }

    public void setCuchillo(Cuchillo cuchillo) {
        this.cuchillo = cuchillo;
    }

    // Getter y Setter para experiencia
    public Integer getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }
}
