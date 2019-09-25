package threads;

import classesjava.StringAux;
import java.io.File;
import java.util.Scanner;

/**
 * @author Indra Mon
 */
public class HiloFicheroV1 extends HiloFichero {

    public HiloFicheroV1(String rutaFich) {
        super(rutaFich);
    }

    @Override
    public String leerLinea(String linea) {
        return StringAux.quitarEspSobrantesV1(linea);
    }
}
