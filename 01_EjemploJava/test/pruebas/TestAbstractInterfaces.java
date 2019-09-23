/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import poo.Coche;
import poo.CocheRally;
import poo.Moto;
import poo.Rodable;
import poo.Vehiculo;

/**
 *
 * @author alumno
 */
public class TestAbstractInterfaces {

//    @Test
    public void abstractos() {

        Vehiculo miMoto = new Moto("Yasawaki", 25);
        miMoto.abrirPuerta();
        miMoto.aparcar();
        Coche elCoche = new Coche("Peugeto");
        Vehiculo elRally = new CocheRally("Zusuki");
        elCoche.abrirPuerta();
        elCoche.aparcar();
        elRally.aparcar();
        assertEquals(elCoche, this);
    }

    @Test
    public void interfaces() {
        Moto laMoto = new Moto("Yakawaka", 22);
        
        ArrayList<Rodable> rodables = new ArrayList<>();
        rodables.add(laMoto);
        
        for(Rodable rodable : rodables) {
            System.out.println("Rodando "+ rodable.toString());
            System.out.println("Ruedas: " +rodable.getNumRuedas());
            rodable.moverse();
        }
    }
}
