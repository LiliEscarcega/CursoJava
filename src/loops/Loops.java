package loops;

import java.util.ArrayList;

public class Loops {
    public void iterarConFor() {

        //Iteracion con ciclo for normal
        for (int i=0; i<10; i++)
        {
            System.out.println("Dentro del ciclo con For " + i);
        }
//Iteracion con ciclo For EACH
        ArrayList<Integer> numeros =new ArrayList<>();
        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        for (Integer numero : numeros){
            System.out.println("Dentro de For Each" +numero);
        }

        //Iteracion con ciclo While
        int x = 0; //en el ciclo while la variable se declara antes
        while (x<5)
         {
             System.out.println("Dentro de While " + x++); //se puede incrementar de varias formas, dentro o fuera de esta funcion
             // x++; aqui otra forma de incrementar

         }

        //Iteracion con ciclo Do While primero ejecuta el codigo y hasta el ultimo revisa si la condicion se cumple
        do
            {
                System.out.println("Dentro de Do While " + x++);

            } while  (x == 0);
    }

}
