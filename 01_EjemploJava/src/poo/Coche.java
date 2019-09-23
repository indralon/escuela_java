package poo;

/**
 *
 * @author alumno
 */
public class Coche extends Vehiculo implements Rodable{

    public static final int CAPACIDAD_DEPOSITO = 50;

    private int capacidadDeposito;
    private boolean arrancado;
    private double nivelDeposito;
    private TipoCarburante carburante;
    protected final byte numRuedas;
    protected String matricula;

    public Coche(String marca, TipoCarburante carb, TipoColor color) {
        super(marca, color);
        this.carburante = carb;
        this.numRuedas = 4;
    }

    public Coche(String marca, TipoCarburante carb, TipoColor color, String matricula) {
        super(marca, color);
        this.carburante = carb;
        this.numRuedas = 4;
        this.matricula = matricula;
    }

    public Coche(String marca) {
        super(marca);
        this.carburante = TipoCarburante.DIESEL;
        this.color = TipoColor.BLANCO;
        this.numRuedas = 4;

    }

    public double getNivelDep() {
        return nivelDeposito;
    }

    public void echarCarburante(double cantidad) {
        if (cantidad > 0) {
            this.nivelDeposito += cantidad;
        }
        if (nivelDeposito > capacidadDeposito) {
            nivelDeposito = capacidadDeposito;
        }
    }

    protected void explosionCilindro() {
        System.out.println("BRUMBA BRUMBA");
    }

    public void vaciaDeposito() {
        this.nivelDeposito = 3;
        System.out.println("Deposito vaciado de " + this.toString());
    }

    @Override
    public String toString() {
        return "Coche " + marca + " nivel: " + nivelDeposito + " color: "
                + color + " carcubrante: " + carburante;
    }

    public int getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public void setCapacidadDeposito(int capacidadDeposito) {
        this.capacidadDeposito = capacidadDeposito;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
        System.out.println("bum bum");
        if (arrancado) {
            nivelDeposito -= 0.1;
            explosionCilindro();
        }
    }

    public void mostrar() {
        System.out.println(this.toString());
    }

    public TipoCarburante getCarburante() {
        return carburante;
    }

    protected void setNivDeposito(double nuevoNivel) {
        nivelDeposito = nuevoNivel;
    }

    @Override
    public void abrirPuerta() {
        System.out.println("Abriendo puerta del coche.PLAC");
    }

    @Override
    public void aparcar() {
        System.out.println("Ta aparcao como un coche");
    }

    @Override
    public byte getNumRuedas() {
        return numRuedas;
    }

    @Override
    public void moverse() {
    }
}
