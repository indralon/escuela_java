package pruebas;

import poo.Coche;
import poo.CocheRally;
import poo.TipoCarburante;
import poo.TipoColor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import org.junit.Test;
import static org.junit.Assert.*;
import poo.Pelota;

/**
 *
 * @author alumno
 */
public class TestColecciones {

    // @Test
    public void arrays() {
        Coche coches[] = new Coche[3];
        coches[0] = new Coche("Fiat", TipoCarburante.ELECTRICO, TipoColor.AZUL);
        coches[1] = new Coche("Audi", TipoCarburante.DIESEL, TipoColor.ROJO);
        coches[2] = new Coche("Kia", TipoCarburante.JAMON, TipoColor.MORAO);

        Coche[] cochesBis = {coches[2],
            coches[1],
            new Coche("Kia", TipoCarburante.JAMON, TipoColor.MORAO)
        };

        Coche elMio = new Coche("Kia", TipoCarburante.JAMON, TipoColor.NEGRO);
        elMio = coches[2];
        elMio.setArrancado(true);
        elMio.acelerar();
        ///////////////////
        coches[2].mostrar();
        ArrayList arrayListObj = new ArrayList();
        arrayListObj.add(42);
        arrayListObj.add("adodas");
        arrayListObj.add(elMio);
        arrayListObj.forEach((ob) -> {
            System.out.println(ob);
        });

        ArrayList<Integer> ventasAnuales = new ArrayList<>();
        ventasAnuales.add(27);
        ventasAnuales.add(30000);

        ArrayList<Coche> cochesParaVender = new ArrayList<>();
        cochesParaVender.add(new Coche("Sinca", TipoCarburante.GASOFA, TipoColor.MORAO));
        cochesParaVender.add(coches[0]);
        cochesParaVender.add(new CocheRally("Esperia"));
        if (cochesParaVender.contains(coches[0])) {
            System.out.println("OHH YEAH");
        }
    }

    // @Test
    public void sets() {
        HashSet<Pelota> pelotas = new HashSet<>();
        Pelota p1 = new Pelota();
        pelotas.add(p1);
        Pelota p2 = new Pelota();
        pelotas.add(p2);
        Pelota p3 = new Pelota();
        pelotas.add(p3);

        pelotas.add(p1);
        pelotas.add(p3);

        System.out.println("Set pelotas " + pelotas);
        assertEquals(3, pelotas.size());
        pelotas.forEach((pa) -> {
            System.out.println(pa);
        });
    }

    @Test
    public void maps() {
        HashMap<String, Boolean> coloresCalidos = new HashMap<>();
        coloresCalidos.put("Blanco", false);
        coloresCalidos.put("Rojo", true);
        coloresCalidos.put("Azul", false);
        coloresCalidos.put("Verde", Boolean.FALSE);
        coloresCalidos.put("Amarillo", true);

        if (coloresCalidos.get("Rojo")) {
            System.out.println("Rojo es calidou");
        }
        if (coloresCalidos.get("Azul")) {
            System.out.println("Azul es calidou");
        }
        System.out.println("Verde es " + coloresCalidos.get("Verde"));

//        for(Map.Entry<String,Boolean> par : coloresCalidos.entrySet()) {
//            System.out.println("Clave: " + par.getKey());
//            System.out.println("Valor: " + par.getValue());
//        }
        coloresCalidos.forEach((clave, valor) -> {
            System.out.println("Clave: " + clave);
            System.out.println("Valor: " + valor);
        });

        TreeMap<String, Coche> cochesMatriculados = new TreeMap<>();
        Coche coche1 = new Coche("Sudaki", TipoCarburante.JAMON, TipoColor.ROJO, "22423");
        Coche coche2 = new Coche("Tomoki", TipoCarburante.DIESEL, TipoColor.AZUL, "22346");
        Coche coche3 = new Coche("Fordo", TipoCarburante.ELECTRICO, TipoColor.MORAO, "24564");
        Coche coche4 = new Coche("Temekan", TipoCarburante.GASOFA, TipoColor.BLANCO, "67433");
        Coche coche5 = new Coche("Yondai", TipoCarburante.DIESEL, TipoColor.NEGRO, "79903");

        cochesMatriculados.put(coche1.getMatricula(), coche1);
        cochesMatriculados.put(coche2.getMatricula(), coche2);
        cochesMatriculados.put(coche3.getMatricula(), coche3);
        cochesMatriculados.put(coche4.getMatricula(), coche4);
        cochesMatriculados.put(coche5.getMatricula(), coche5);
        
        cochesMatriculados.forEach((matricula, coche) -> {
            System.out.println("Coche: " + coche.toString());
            System.out.println("Matricula: " + matricula);
        });

    }
}
