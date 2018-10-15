package estatic;
import colecciones.DVD;
import java.util.ArrayList;
import java.util.List;

public class GalletasTest {
    public static void main (String[] args) {
        //  DVD dvd = new DVD();
        List<Galleta> lista = llenarGalleta();
        System.out.println("ITERANDO GALLETAS y GANANDO COMO SIEMPRE!!!");
            System.out.println("___________________________________________________________");
        for (Galleta galleta : lista){
            System.out.println(galleta.toString());
            System.out.println("____________________________________________________________");
        }

    }
    private static List<Galleta> llenarGalleta() {
        List<Galleta> listaGalleta = new ArrayList<>();

        Galleta galleta0 = new Galleta ("cafe", "grande", "chocolate","cirular");
        Galleta galleta1 = new Galleta ("amarilla", "grande", "vainilla","grande");
        Galleta galleta2 = new Galleta ("rosa", "mediana", "fresa", "circular");
        Galleta galleta3 = new Galleta ("naranja","chica", "frutos", "cuadrada");
        Galleta galleta4 = new Galleta ("cafe", "grande", "chocolate", "rectangular");
        Galleta galleta5 = new Galleta ("cafe", "mediana", "moca", "triangular");
        Galleta galleta6 = new Galleta ("rosa", "mediana", "fresa", "circular");
        Galleta galleta7 = new Galleta ("amarilla", "grande", "vainilla", "cuadrada");
        Galleta galleta9 = new Galleta ("verde", "chica", "fresa", "circular");
        Galleta galleta10 = new Galleta ("cafe", "chica", "cocoa", "rectangular");
        listaGalleta.add(galleta0);
        listaGalleta.add(galleta1);
        listaGalleta.add(galleta2);
        listaGalleta.add(galleta3);
        listaGalleta.add(galleta4);
        listaGalleta.add(galleta5);
        listaGalleta.add(galleta6);
        listaGalleta.add(galleta7);
        listaGalleta.add(galleta9);
        listaGalleta.add(galleta10);

        return listaGalleta;

    }
}
