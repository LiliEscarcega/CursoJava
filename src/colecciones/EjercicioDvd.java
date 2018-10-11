package colecciones;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class EjercicioDvd {
    public static void main (String[] args) {
        List<DVD> lista = llenarListas();

        System.out.println("ITERANDO LISTA");
            System.out.println("___________________________________________________________");
        for (DVD dvd : lista){
            System.out.println(dvd.toString());
            System.out.println("____________________________________________________________");
        }

        Collections.sort(lista);  //ORDENAMOS LA LISTA DE LAS PELICULAS
            System.out.println("ITERANDO LISTA CON COMPARABLE");
            System.out.println("____________________________________________________________");
        for (DVD dvd : lista){
            System.out.println(dvd.toString());
            System.out.println("____________________________________________________________");
        }
        OrdenamientoPorGenero ordenamientoporgenero = new OrdenamientoPorGenero();
        Collections.sort(lista, ordenamientoporgenero);
        System.out.println("ITERANDO LISTA CON ORDENAMIENTO POR GENERO");
            System.out.println("____________________________________________________________");
        for (DVD dvd : lista){
            System.out.println(dvd);
            System.out.println("____________________________________________________________");
        }
        OrdenamientoPorProtagonista ordenamientoporprotagonista = new OrdenamientoPorProtagonista();
        Collections.sort(lista, ordenamientoporprotagonista);
        System.out.println("ITERANDO LISTA CON ORDENAMIENTO POR PROTAGONISTA");
            System.out.println("____________________________________________________________");
        for (DVD dvd : lista){
            System.out.println(dvd);
            System.out.println("____________________________________________________________");
        }
        OrdenamientoPorDirector ordenamientopordirector = new OrdenamientoPorDirector();
        Collections.sort(lista, ordenamientopordirector);
        System.out.println("ITERANDO LISTA CON ORDENAMIENTO POR DIRECTOR");
            System.out.println("____________________________________________________________");
        for (DVD dvd : lista){
            System.out.println(dvd);
            System.out.println("____________________________________________________________");
        }


    }

    private static List<DVD> llenarListas() {
        List<DVD> listaDVD = new ArrayList<>();
        DVD dvd0 = new DVD("El conjuro","Terror", "Vera Farmiga","James Wan");
        DVD dvd1 = new DVD("Martyrs","Terror", "Troian Bellisario","Pascal Laugier");
        DVD dvd2 = new DVD("Cannibal Holocaust","Terror", "Teresa Palmer", "Ruggero Deodato");
        DVD dvd3 = new DVD("Cuando las luces se apagan","Terror", "Gabriel Bateman", "David F. Sandberg");
        DVD dvd4 = new DVD("La bruja de Blair","Terror", "Heather Donahue", "Eduardo Sanchez");
        DVD dvd5 = new DVD("Yo antes de ti","Romantica", "Louisa Clark", "Thea Sharrock");
        DVD dvd6 = new DVD("No se aceptan devoluciones","Comedia", " Eugenio Derbez", "Eugenio Derbez");
        DVD dvd7 = new DVD("Antes del atardecer","Romantica", "Ethan Hawke", "Richard Linklater");
        DVD dvd8 = new DVD("Que culpa tiene el niño","Comedia", "Karla Souza","Gustavo Loza");
        DVD dvd9 = new DVD("La masacre de Texas","Terror", "jessica Biel", "Tobe Hooper");
        listaDVD.add(dvd0);
        listaDVD.add(dvd1);
        listaDVD.add(dvd2);
        listaDVD.add(dvd3);
        listaDVD.add(dvd4);
        listaDVD.add(dvd5);
        listaDVD.add(dvd6);
        listaDVD.add(dvd7);
        listaDVD.add(dvd8);
        listaDVD.add(dvd9);
    
        return listaDVD;
    }
    



}
