package EntitieMovie;
import java.time.LocalTime;
public class EntitieMovie {
     private String titulo;
     private String director;
     private LocalTime duracion;
    public EntitieMovie(){

    }
    public EntitieMovie(String titulo, String director, LocalTime duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirectador() {
        return director;
    }

    public void setDirectador(String directador) {
        this.director = directador;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "EntitieMovie{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
