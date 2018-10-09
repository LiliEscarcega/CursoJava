package colecciones;

import java.util.Comparator;

public class OrdenamientoPorProtagonista  implements Comparator<DVD> {
    @Override
    public int compare(DVD uno, DVD dos) { //comparar dos elementos
        return uno.getProtagonista().compareTo(dos.getProtagonista());   //nuevo metodo de ordenameinto en una clase  que se usa en la clase EJERCICIODVD

    }
}