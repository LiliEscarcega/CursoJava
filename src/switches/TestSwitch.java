package switches;

public class TestSwitch {
    public static void main (String[] args) {
        int x =4;
        switch (x){
            case 1:
                System.out.println("x es igual a 1");
                break;
            case 2:
                System.out.println("x es igual a 2");
                break;

            case 3:
                System.out.println("x es igual a 3");
                break;

            case 4:
                System.out.println("x es igual a 4");
                break;

            case 5:
                System.out.println("x es igual a 5");
                break;

            default:
                System.out.println("no se sabe el valor de x");
        }

        Color negro = Color.NEGRO;
        switch (negro){
            case NEGRO:
                System.out.println("El color es negro");
                break;
            case ROJO:
                System.out.println("El color es rojo");
                break;
            case VERDE:
                System.out.println("El color es verde");
                break;
            case AZUL:
                System.out.println("El color es azul");
                break;
            case CAFE:
                System.out.println("El color es cafe");
                break;



        }

    }

}
