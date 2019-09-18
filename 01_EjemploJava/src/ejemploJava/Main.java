
package ejemploJava;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Entrenando POO");
        Coche miCoche;
        
        miCoche = new Coche("Toyowa"); // Las instancias se hacen con New
        miCoche.setCapacidadDeposito(15);
        miCoche.setEsGasolina(true);
        miCoche.setArrancado(true);
        miCoche.echarCarburante(5);
        
     
        System.out.println("Coche creado:capacidad " + miCoche.getCapacidadDeposito()
                                + " marca " +miCoche.getMarca());
        
        System.out.println("Nivel deposito: " + miCoche.getNivelDeposito());
        miCoche.vaciaDeposito();
        miCoche.acelerar();
        miCoche.mostrar();
    }
}
