package threads;

import classesjava.StringAux;
import java.io.File;
import java.util.Scanner;

/**
 * @author Indra Mon
 */
public class HiloFicheroV3 extends HiloFichero {

    public HiloFicheroV3(String rutaFich) {
        super(rutaFich);
    }

    @Override
    public String leerLinea(String linea) {
        return StringAux.quitarEspSobrantesV3(linea);
    }
}
