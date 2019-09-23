/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import classesjava.StringAux;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class TestStringAux {

    public TestStringAux() {

    }

    @Test
    public void probandoQuitarEspacios() {
        String texto = "En un lugar de la Mancha de cuyo nombe no quiero acordarme vivia...";
        String texto2 = "En un lugar de Madrid...";
        String texto3 = "           en       un  LUGAR  ";

        String resultadoOk = "en un LUGAR";
        StringAux text3Aux = new StringAux(texto3);
        String resultadoAux = text3Aux.quitarEspSobrantes();

        assertEquals(resultadoOk, resultadoAux);

    }

    @Test
    public void probandoContarPalabras() {

        assertEquals(6, StringAux.contarPalabras("En un lugar de la Mancha"));
        assertEquals(6, StringAux.contarPalabras("    En       un   lugar   de   la Mancha  "));
        assertEquals(0, StringAux.contarPalabras("      "));
        assertEquals(1, StringAux.contarPalabras("aaa"));

    }
}
