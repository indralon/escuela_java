package classesjava;

import java.util.ArrayList;

/**
 * @author Indra Mon
 */
public class ProbandoString {

    public static void tratarCadenas() {
        String texto = "En un lugar de la casa de la abuela, existe...";
        System.out.println(texto);
        System.out.println("cuarta letra " + texto.charAt(4));

        // Comparaciones
        String texto2 = "En un lugar de Madrid...";
        System.out.println("Comparacion: " + texto.compareTo(texto2));

        texto2 = texto2.substring(0, 10);
        System.out.println("texto2 ahora es " + texto2);

        if (texto.contains(texto2)) {
            System.out.println("texto contiene texto 2");
        } else {
            System.out.println("texto no contiene texto 2");
        }
        System.out.println("abuela esta en " + texto.indexOf("abuela"));

        texto = texto.replace("lugar", "bar");
        System.out.println(texto);

        String texto3 = "             en        un   LUGAR  ";
        texto3 = texto3.toUpperCase().trim();
        System.out.println(texto3);

        
        String[] palabras = texto3.split(" ");
        ArrayList<String> palabris = new ArrayList<>();

        for (String palabra : palabras) {
            if (!palabra.trim().equals("")) {
                palabris.add(palabra.trim());
            }
        }

        palabris.forEach(a -> {
            System.out.print(a + " ");
        });
        
        System.out.println("");
        System.out.println("numero de palabras: " + palabris.size());
        
        StringAux texto4 = new StringAux("Tengo        una  idea para    una      pelicula  ");
        System.out.println(texto4.quitarEspSobrantes());
        System.out.println(texto4.contarPalabras());
    }
}
