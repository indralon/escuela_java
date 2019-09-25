package threads;

import classesjava.StringAux;
import java.io.File;
import java.util.Scanner;

/**
 * @author Indra Mon
 */
public class HiloFicheroV2 extends HiloFichero {

    public HiloFicheroV2(String rutaFich) {
        super(rutaFich);
    }
    
    @Override
    public String leerLinea(String linea) {
        return StringAux.quitarEspSobrantesV2(linea);
    }
}
