package equals;

public class EqualsTest {
    public static void main (String [] args){
        Personas p1 = new Personas ();
        Personas p2 = new Personas ();
        p1.setNombre("Pedro");
        p1.setEdad(26);

        p2.setNombre("Pedro");
        p2.setEdad(26);


        System.out.println(p1.equals(p2));
        System.out.println(p1==p2);


    }
}
