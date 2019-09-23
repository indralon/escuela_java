package poo;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/** @author Indra Mon
 */
public class Moto extends Vehiculo implements Rodable{
    
    int alturaFrontal;
    
    public Moto(String marca, int alturaFrontal) {
        super(marca);
        this.alturaFrontal =  alturaFrontal;
    }

    @Override
    public void abrirPuerta() {
        System.out.println("Loco, no hay puertas, no te tires");
    }

    @Override
    public void aparcar() {
        System.out.println("Ta aparcao como una moto");
    }

    @Override
    public byte getNumRuedas() {
        System.out.println("Contado las ruedas de la moto preeeemo...");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Moto.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Uuuuuunaaaaa");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Moto.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Dooooooooos");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Moto.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Y ya no hay más");
        return 2;
    }

    @Override
    public void moverse() {
        System.out.println("MOviendo motooo brom broomm");
    }
    

}
