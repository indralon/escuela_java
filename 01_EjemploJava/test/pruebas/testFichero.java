/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import org.junit.Test;
import static org.junit.Assert.*;
import threads.HiloFichero;
import threads.HiloFicheroV1;
import threads.HiloFicheroV2;
import threads.HiloFicheroV3;

/**
 *
 * @author alumno
 */
public class testFichero {

    public testFichero() {
    }

//    @Test
//    public void generacionFicheroAleatorio() {
//        HiloFichero.crearFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\texto.txts");
//    }
  //  @Test
    public void lecturaFicheroV1() {
        HiloFicheroV1 hiloFichV1 = new HiloFicheroV1("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\texto.txts");
        hiloFichV1.leerFicheroEjem();
    }
    //@Test
    public void lecturaFicheroV2() {
        HiloFicheroV2 hiloFichV2 = new HiloFicheroV2("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\texto.txts");
        hiloFichV2.leerFicheroEjem();
    }
    @Test
    public void lecturaFicheroV3() {
        HiloFicheroV3 hiloFichV3 = new HiloFicheroV3("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\texto.txts");
        hiloFichV3.leerFicheroEjem();
    }
}
