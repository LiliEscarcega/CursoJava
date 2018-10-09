package equals;

import java.util.Objects;

public class Personas {
    private String nombre;
    private int edad;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public  int getEdad(){
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personas personas = (Personas) o;
        return edad == personas.edad &&
                Objects.equals(nombre, personas.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }
}

