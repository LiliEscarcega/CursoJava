package estatic;

public class Galleta {

    private String color;
    private String tamaño;
    private String sabor;
    private String forma;
    private static  int cantidad = 0;


    public Galleta(String color, String tamaño, String sabor, String forma) {

        this.color = color;
        this.tamaño = tamaño;
        this.sabor = sabor;
        this.forma = forma;
        cantidad++;
    }

    public String getTamaño()
    {
        return tamaño;
    }

    public String getSabor() {
        return sabor;
    }

    public String getForma() {
        return forma;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }


    public void setForma(String forma) {
        this.forma = forma;
    }

    public static void setCantidad(int cantidad) {
        Galleta.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return color  + "_" + tamaño + "_" + sabor + "_" + forma + "_" + cantidad;
    }
}
