package poo;

/**
 * @author Indra Mon
 */
public class CocheRally extends Coche {

    private float rozamiento;

    public CocheRally(String marca, TipoCarburante carb, TipoColor color, float roz) {
        super(marca, carb, color);
        this.rozamiento = roz;
    }
    
    public CocheRally(String marca) {
        super(marca);
        this.rozamiento = 2.0f;
    }

    public CocheRally(String marca, TipoCarburante carb, String color, float roz) {
        super(marca);
        this.rozamiento = roz;
    }

    public float getRozamiento() {
        return rozamiento;
    }

    public void setRozamiento(float rozamiento) {
        this.rozamiento = rozamiento;
    }

    public void derrapar() {
        System.out.println("IIIIIGGHHH");
        explosionCilindro();
    }

    public void derrapar(float cuanto) {
        System.out.println("YIIIHAA " + cuanto + " DE A TOPE!");
        super.explosionCilindro();
    }

    @Override
    public void acelerar() {
        System.out.println("RAMMMMMRMAMMMRMAMM");
        if (isArrancado()) {
            setNivDeposito(getNivelDeposito() - .5);
        }
    }
    
    @Override
    public void aparcar() {
        System.out.println("Aparcando el rally. RAMRAMRAMRAAAAAM HIIIEIGHHHH CHOMP!");
    }
}
