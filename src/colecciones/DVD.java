package colecciones;

public class DVD {

    private String titulo;
    private String genero;
    private String protagonista;

    public DVD(String titulo){
        this.titulo = titulo;
    }
    public DVD (String titulo, String genero){
        this(titulo);
        this.genero=genero;
    }
    public DVD (String titulo, String genero, String protagonista){
        this (genero,titulo);
        this.protagonista = protagonista;

    }
    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getProtagonista() {
        return protagonista;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }




}
