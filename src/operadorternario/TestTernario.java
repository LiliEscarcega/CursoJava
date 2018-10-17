package operadorternario;

import java.util.ArrayList;

public class TestTernario {
    public static void main (String[] args) {
        validarAcceso( 1,23,50,70,18,19,17,10,7);

    }
    public static void validarAcceso(int... edades) {

       for (int edad : edades){
         //   if (edad<18)
           // System.out.println("Acceso denegado");
          //  else
            //    System.out.println("Acceso aprobadd");
        String status = (edad<18) ? "verdadero" : "falso";
        System.out.println(status);
        }


    }
    }

