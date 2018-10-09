package colecciones;

public class DVD {

    private String titulo;
    private String genero;
    private String protagonista;
    private String director;

    public DVD(String titulo){
        this.titulo = titulo;
    }
    public DVD (String titulo, String genero){
        this(titulo);
        this.genero=genero;
    }
    public DVD (String titulo, String genero, String protagonista, String director){
        this (titulo,genero);
        this.protagonista = protagonista;
        this.director=director; //se agrega al constructor l variable director.

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
