package com.sinensia.modelo.logica;

import com.sinensia.modelo.Persona;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Singleton-ton-ton ya que solo queremos un servicio por aplicacion/servidor
 *
 * @author Indra Mon
 */
public class ServicioPersona {

    // <editor-fold defaultstate="collapsed" desc="Codigo patron Singleton">
    private static ServicioPersona instancia;

    private ServicioPersona() {
        personas = new ArrayList<>();
    }

    public static ServicioPersona getInstancia() {
        if (instancia == null) {
            instancia = new ServicioPersona();
        }
        return instancia;

    } //</editor-fold>

    private ArrayList<Persona> personas;

    public Persona addPersonas(String nombre, String edad)
            throws NumberFormatException, IOException, IllegalArgumentException {

        if (nombre.equals("")) {
            throw new IllegalArgumentException("El nombre apesta");
        } else if (nombre.length() < 2) {
            throw new IllegalArgumentException("El nombre apesta y es muy corto");
        } else if (edad.equals("")) {
            throw new NumberFormatException("La eda esta vasia");
        } else {
            int intEdad = Integer.parseInt(edad);
            if (intEdad <= 12) {
                throw new IllegalArgumentException("La edad debe ser mayor de 12");
            } else {
                Persona p = new Persona(nombre, intEdad);
                personas.add(p);
                return p;
            }
        }
    }

    public Persona getPersona(String nombre) {
        for (Persona p : personas) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }
    
    public ArrayList<Persona> getPersonas(String cont) {
        ArrayList<Persona> personasEncontradas = new ArrayList<>();
        personas.stream().filter((p) -> (p.getNombre().contains(cont))).forEachOrdered((p) -> {
            personasEncontradas.add(p);
        });
        return personasEncontradas;
    }
}
