package colecciones;

import java.util.Comparator;

public class OrdenamientoPorGenero implements Comparator<DVD> {
    @Override
    public int compare (DVD uno, DVD dos){ //comparar dos elementos
        return uno.getGenero().compareTo(dos.getGenero());   //nuevo metodo de ordenameinto en una clase  que se usa en la clase EJERCICIODVD

    }
}
