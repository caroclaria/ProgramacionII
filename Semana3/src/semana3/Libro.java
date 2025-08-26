
package semana3;


public class Libro {
    //atributos
    private String titulo, autor;
    private int anioPublicacion;
    //constructor
    public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor =autor;
        this.anioPublicacion= anioPublicacion;
    }
    //metodos
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anio){
        if (anio > 2025 ) {
            System.out.println("ese año no es valido");
        } else {
            anioPublicacion = anio;
            System.out.println("año modificado correctamente, el año de publicacion es: " + anioPublicacion);
        }
    }
}
