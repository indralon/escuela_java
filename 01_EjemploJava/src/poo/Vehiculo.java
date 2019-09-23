package poo;

/**
 * @author Indra Mon
 */
public abstract class Vehiculo {

    protected final String marca;
    protected TipoColor color;

    public Vehiculo(String marca) {
        this.marca = marca;
        this.color = TipoColor.BLANCO;
    }

    public Vehiculo(String marca, TipoColor color) {
        this.marca = marca;
        this.color = color;
    }

    public abstract void abrirPuerta();

    public abstract void aparcar();

    public String getMarca() {
        return marca;
    }

    public TipoColor getColor() {
        return color;
    }

    public void setColor(TipoColor color) {
        this.color = color;
    }
}
