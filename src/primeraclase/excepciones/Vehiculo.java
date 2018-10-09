package primeraclase.excepciones;

public abstract class Vehiculo { //clase abstracta

    //getter
 private int numeroLlantas;
    public int getNumeroLlantas()
    {

      return numeroLlantas;
    }

    public void setNumeroLlantas(int numeroLlantas)
    {
        this.numeroLlantas = numeroLlantas;
    }

    public abstract void lavarVehiculo(); //metodo abstracto,  sirve para para que una clase lo implemente no se le puede poner codigo
    {

    }


}
