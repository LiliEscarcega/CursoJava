import loops.Loops;
import primeraclase.Auto;
import primeraclase.excepciones.Motocicleta;
import primeraclase.excepciones.PlacaInvalidaException;
import primeraclase.excepciones.Vehiculo;

/**
 * Autor_ Liliana Escarcegaa Juarez
 * Date: 27/09/2018
 */
public class HolaMundo
{
    public static void main (String[] args) throws PlacaInvalidaException
    {
        String cadena1 = "Hola mundo";
        String cadena2 = "Hola mundo";
        System.out.println(cadena1.equals(cadena2));

        System.out.println("Hola mundo");

        Loops loops = new Loops();
        loops.iterarConFor();
        //creando nueva innstancia de auto
       Auto auto = new Auto ();
        System.out.println(auto.getPlaca());

        Motocicleta moto = new Motocicleta();
        moto.setNumeroLlantas(2);
        System.out.println("Numero de llantas " + moto.getNumeroLlantas());
        moto.lavarVehiculo();

       //holahola commit
       try{
           Auto auto2 = new Auto ("1234457"); //excepcion
           System.out.println(auto2.getPlaca());
       } catch(PlacaInvalidaException e)
       {  //o catch

           System.out.println("OCURRIO UN PROBLEMA AL CREAR AUTO: " + e.getMessage());
           throw e; //lanzas nuevamente la excpcion
       } finally
       {
           //Liberar recursos, finaliza alguna ejecucion ocurra o un excepcion.
       }

        //Vehiculo vehiculo = new Vehiculo(); no es correcto por que no se puede instanciar un objecto de una clase abstracta




    }
}
