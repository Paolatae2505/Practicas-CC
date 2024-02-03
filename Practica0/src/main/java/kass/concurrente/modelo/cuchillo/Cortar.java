package kass.concurrente.modelo.cuchillo;

public class Cortar {

    private Cuchillo cuchillo;

    public void setTipoCuchillo(Cuchillo cuchillo){
        this.cuchillo = cuchillo;
    }

    public Integer cortar(){
        return cuchillo.corta();
    }
    
}
