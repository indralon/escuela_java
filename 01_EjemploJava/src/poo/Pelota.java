package poo;

/** @author Indra Mon
 */
public class Pelota implements Rodable{

    @Override
    public byte getNumRuedas() {
        return 1;
    }

    @Override
    public void moverse() {
        System.out.println("Booing bota y rueda");
    }

}
