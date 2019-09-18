
package ejemploJava;

/**
 *
 * @author alumno
 */
public class Coche {
   
   public static final int CAPACIDAD_DEPOSITO = 50;
   
   private final byte numRuedas;
   private String marca;
   private int capacidadDeposito;
   private boolean esGasolina;
   private boolean arrancado;
   private double nivelDeposito;
   
   public Coche(String marca) {
       this.numRuedas = 4;
       this.marca = marca;
   }
    
    public double getNivelDep () {
         return nivelDeposito;
    }
    
    public void echarCarburante(double cantidad) {
        if(cantidad > 0) {
            this.nivelDeposito += cantidad;
        }
        if(nivelDeposito > capacidadDeposito) {
            nivelDeposito = capacidadDeposito;
        }
    }
    
    public void vaciaDeposito() {
        this.nivelDeposito = 3;
        System.out.println("Deposito vaciado de " + this.toString());
    }
    
    @Override
    public String toString() {
        return "Coche " + marca + " nivel: "+nivelDeposito;
    }

    public int getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public void setCapacidadDeposito(int capacidadDeposito) {
        this.capacidadDeposito = capacidadDeposito;
    }

    public boolean isEsGasolina() {
        return esGasolina;
    }

    public void setEsGasolina(boolean esGasolina) {
        this.esGasolina = esGasolina;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }

    public double getNivelDeposito() {
        return nivelDeposito;
    }

    public void setNivelDeposito(double nivelDeposito) {
        this.nivelDeposito = nivelDeposito;
    }
    
    public void acelerar() {
        if(arrancado){
            nivelDeposito -=0.1;
        }
    }
    public void mostrar() {
        System.out.println(this.toString());
    }

    public String getMarca() {
        return marca;
    }
}
