package bean;

public class Libro {
    private int idLibro;
    private Genero genero;
    private String autor;
    private int anioPublicado;

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getAnioPublicado() {
        return anioPublicado;
    }

    public void setAnioPublicado(int anioPublicado) {
        this.anioPublicado = anioPublicado;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
