package colecciones;
import java.util.*;
import java.util.Map.Entry;

public class ListSetMapTest {
    public static void main (String[] args) {
        List<String> Lista = new ArrayList<>();
        Lista.add ("Israel");
        Lista.add ("Dann");
        Lista.add ("Serch");
        Lista.add ("Josman");
        Lista.add ("Gera");
        Lista.add ("Josman");
        Lista.add ("Gera");

        Set<String> set = new HashSet<>();
        set.add ("Israel");
        set.add ("Dann");
        set.add ("Serch");
        set.add ("Josman");
        set.add ("Gera");
        set.add ("Josman");
        set.add ("Gera");

        Map<String, String> mapa = new HashMap<>();
        mapa.put("Isra","Israel Segunfo");
        mapa.put("Dann","Dann hernandez");
        mapa.put("Serch","Sergio Rivera");
        mapa.put("Josman","Jose Manuel Moreno");
        mapa.put("Gera","Gerardo Rincon");
        mapa.put("Josman","Jose Mnauel Moreno");
        mapa.put("Gera"," Gerardo Martinez");

        System.out.println("ITERANDO LISTA");
        System.out.println("____________________________________");
        for (String nickname : Lista){
            System.out.println(nickname);
        }
        System.out.println("____________________________________");

        System.out.println("ITERANDO SET");
        System.out.println("____________________________________");
        for (String nickname :set){
            System.out.println(nickname);
        }
        System.out.println("____________________________________");

        System.out.println("ITERANDO MAPA");
        System.out.println("____________________________________");
        for (Entry<String, String > entry : mapa.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println("____________________________________");



    }
}
