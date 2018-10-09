package colecciones;

import java.util.Comparator;

public class OrdenamientoPorDirector  implements Comparator<DVD> {
    @Override
    public int compare(DVD uno, DVD dos) { //comparar dos elementos
        return uno.getDirector().compareTo(dos.getDirector());   //nuevo metodo de ordenameinto en una clase  que se usa en la clase EJERCICIODVD

    }
}
