package classesjava;

/**
 * @author Indra Mon
 */
public final class StringAux {

    private String string;

    public StringAux(String string) {
        this.string = string;
    }

    public static String quitarEspaciosSobrantes(String string) {
//        string = string.trim();
//        while (string.contains("  ")) {
//            string = string.replace("  ", " ");
//        }
//        return string;
//        String result = "";
//        for (int i = 0; i < string.length(); i++) {
//            if (string.charAt(i) != ' ') {
//                result += string.charAt(i);
//            } else if(i < string.length()-1){
//                if(string.charAt(i + 1) != ' '){
//                    result += ' ';
//                }
//            }
//        }
//        return result;
        return string.trim().replaceAll(" +", " ");
    }

    public static int contarPalabras(String string) {
        String[] palabras = string.split(" ");
        int contadorPalabras = 0;
        for (String palabra : palabras) {
            if (!palabra.equals("")) {
                contadorPalabras++;
            }
        }
        return contadorPalabras;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String quitarEspSobrantes() {
        return quitarEspaciosSobrantes(string);
    }

    public int contarPalabras() {
        return contarPalabras(string);
    }
}
