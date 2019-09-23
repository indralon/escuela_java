package ejemploJava;

import poo.CocheRally;
import poo.Coche;
import poo.TipoCarburante;
import classesjava.ProbandoString;
import poo.Moto;

/**
 *
 * @author alumno
 */
public class Main {

    public static void main(String args[]) {
        ProbandoString.tratarCadenas();
        Moto laMoto = new Moto("Yakawaka", 22);
        laMoto.getNumRuedas();
        laMoto.moverse();
    }

    /**
     * @param args the command line arguments
     */
    public static void mainCoches(String[] args) {
        System.out.println("Entrenando POO");
        Coche miCoche, otroCoche;

        miCoche = new Coche("Toyowa"); // Las instancias se hacen con New
        miCoche.setCapacidadDeposito(15);
        miCoche.setArrancado(true);
        miCoche.echarCarburante(5);

        System.out.println("Coche creado:capacidad " + miCoche.getCapacidadDeposito()
                + " marca " + miCoche.getMarca());

        System.out.println("Nivel deposito: " + miCoche.getNivelDeposito());
        miCoche.vaciaDeposito();
        miCoche.acelerar();
        miCoche.mostrar();

        CocheRally elSupra = new CocheRally("Yepetus", TipoCarburante.JAMON, "BLANCO", 2.3F);
        elSupra.mostrar();
        elSupra.acelerar();
        elSupra.acelerar();
        elSupra.derrapar();
        elSupra.acelerar();

        Coche supraNormal = elSupra; // conversion implicita
        supraNormal.acelerar();
        supraNormal.acelerar();
        supraNormal.acelerar();

        CocheRally cr = (CocheRally) supraNormal; // casteo guapo
        System.out.println("Y el rosamiento?? " + cr.getRozamiento());

        cr = (CocheRally) miCoche;
        System.out.println("Y el rosamiento?? " + cr.getRozamiento());

    }
}
