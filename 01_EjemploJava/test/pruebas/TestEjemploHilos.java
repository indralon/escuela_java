/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class TestEjemploHilos {

    private class ProcesoA extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 200; i++) {
                System.out.println("Proceso A" + i);
            }
        }
    }

    @Test
    public void probandoClasesConNombre() {
        ProcesoA procA = new ProcesoA();
        Thread procB = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    System.out.println("Proceso B" + i);
                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TestEjemploHilos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };

        procA.start();
        procB.start();

        try {
            procB.join();
            procA.join();

        } catch (InterruptedException ex) {
            Logger.getLogger(TestEjemploHilos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
