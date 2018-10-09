package primeraclase.excepciones;

public class Motocicleta extends Vehiculo {

      private String placa;
      public Motocicleta()
    {
        placa = "Desconocido";
        setNumeroLlantas(2);
    }

    public void lavarVehiculo()
    {
        System.out.println("LAVAR A MANO");
    }

    public Motocicleta(String placa) throws PlacaInvalidaException{
        placa = placa.trim(); //quita los espacios de los lados
        if (placa.length() == 7 || placa.length() == 8)  //longitud de los caracteres si no es entre 7 y 8 imprime desconocido
        {
            this.placa = placa;
        } else {
            throw new PlacaInvalidaException("PLACA INVALIDA");
            // throw new RuntimeException("");




}
      }
}