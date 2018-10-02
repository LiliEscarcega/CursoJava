package primeraclase;

import primeraclase.excepciones.PlacaInvalidaException;
import primeraclase.excepciones.Vehiculo;

public class Auto extends Vehiculo {

    private String placa;

    //constructor sin paramentros (default)
    public Auto() {
        placa = "Desconocido";
        setNumeroLlantas(4);
    }

    //contructor que recibe num de placa
    public Auto(String placa) throws PlacaInvalidaException {
        placa = placa.trim(); //quita los espacios de los lados
        if (placa.length() == 7 || placa.length() == 8)  //longitud de los caracteres si no es entre 7 y 8 imprime desconocido
        {
            this.placa = placa;
        } else {
            throw new PlacaInvalidaException("PLACA INVALIDA");
            // throw new RuntimeException("");

        }

    }

    public void lavarVehiculo() //se implementa la clase abstracta Vehiculo con el metodo lavarvehiculo para poderla usar
    {
        System.out.println("Entrando al car wash");

    }



    //Getter
        public String getPlaca(){
            return placa;
        }



     // Setter
    public void setPlaca(String placa){

        this.placa = placa;
    }




}
