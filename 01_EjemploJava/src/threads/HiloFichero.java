package threads;

import classesjava.StringAux;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Indra Mon
 */
public abstract class HiloFichero {
    
    String rutaFich;
     
    public HiloFichero(String rutaFich) {
        this.rutaFich = rutaFich;
    }
    
    public void crearFicheroEjem() /*throws IOException */ {
        String[] palabras = new String['Z' - 'A'];
        Random r = new Random(new Date().getTime());

        for (char c = 'A'; c < 'Z'; c++) {
            int repe = 2 + Math.abs(r.nextInt() % 8); // numero entre 2 y 9
            palabras[c - 'A'] = "";
            for (int i = 0; i < repe; i++) {
                palabras[c - 'A'] += "" + c;
            }
        }
        System.out.println("" + Arrays.toString(palabras));
        FileWriter fich = null;

        try {
            fich = new FileWriter(rutaFich, false);
            for (int i = 0; i < 100000; i++) {

                if (r.nextInt(3) == 0) {
                    fich.write(palabras[r.nextInt(palabras.length)]);
                }
                if (r.nextInt(2) == 0) {
                    for (int j = 0; j < 10; j++) {
                        fich.write(" ");
                    }
                }
                if (r.nextInt(12) == 0) {
                    fich.write("\n\r");
                }
            }
        } catch (IOException ex) {
            System.err.println("Error en la escritura: " + ex.getMessage());
        } catch (Exception e) {
            System.err.println("Error en otra cosa: " + e.getMessage());
        } finally {
            try {
                if (fich != null) {
                    fich.close();
                }
            } catch (IOException ex) {
                System.out.println("Error serrrrrrando fichero ay chihuahua");
            }
        }
    }

    protected abstract String leerLinea(String linea);
    
    public String leerFicheroEjem() {
        File fich = new File(rutaFich);
        Scanner escaner = null;
        String contenido = "";
        try {
            escaner = new Scanner(fich);
            while (escaner.hasNextLine()) {
                String linea = escaner.nextLine();
                System.out.println(leerLinea(linea));
            }
        } catch (Exception e) {
            System.err.println("Error en otra cosa: " + e.getMessage());
        } finally {
            try {
                if (escaner != null) {
                    escaner.close();
                }
            } catch (Exception ex) {
                System.out.println("Error serrrrrrando fichero ay chihuahua");
            }
        }
        return contenido;
    }
}
