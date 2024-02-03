package kass.concurrente.modelo.persona;


import kass.concurrente.modelo.producto.Comida;
import kass.concurrente.modelo.cuchillo.Cuchillo;

/**
 * Clase que simula a un Chef que extiende de Persona
 * @author Vargas Bravo Paola
 * @version 1.0 (01 Febrero 2024)
 * @see Cuchillo
 * @since Computación concurrente (2024-2)
 */

public class Chef extends Persona {
    
    //Atributo
    private Cuchillo cuchillo;
    private Integer experiencia;


    /**
     * Crea la instancia de un Chef
     * @param nombre  Nombre del Chef
     * @param experiencia Experiencia del Chef
     * @param cuchillo  Cuchillo especial del Chef
     */
    public Chef(String nombre, Integer experiencia, Cuchillo cuchillo) {
        super(nombre);
        this.cuchillo = cuchillo;
        this.experiencia = experiencia;
    }

    /**
     * Prepara un platillo por el Chef
     * 
     * @param platillo --- Platillo a preparar
     */
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

    
    /**
     * Obtiene el cuchillo actual del chef.
     *
     * @return El cuchillo actual del chef.
     */
    public Cuchillo getCuchillo() {
        return this.cuchillo;
    }

    /**
     * Establece el cuchillo que usará el chef.
     *
     * @param cuchillo El nuevo cuchillo que usará el chef.
     */
    public void setCuchillo(Cuchillo cuchillo) {
        this.cuchillo = cuchillo;
    }

    /**
     * Obtiene la experiencia del chef.
     *
     * @return La experiencia del chef.
     */
    public Integer getExperiencia() {
        return this.experiencia;
    }

    /**
     * Establece la experiencia del chef.
     *
     * @param experiencia La nueva experiencia del chef.
     */
    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

}
