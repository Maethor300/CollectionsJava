package EntitieMovie;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;

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
    public static Comparator<EntitieMovie> compararTiempoMenor = new Comparator<EntitieMovie>() {
        @Override
        public int compare(EntitieMovie pe1, EntitieMovie pe2 ){
            return pe1.getDuracion().compareTo(pe2.getDuracion());
        }
    };
    public static Comparator<EntitieMovie> compararTiempoMayor = new Comparator<EntitieMovie>() {
        @Override
        public int compare(EntitieMovie pe1, EntitieMovie pe2 ){
            return pe2.getDuracion().compareTo(pe1.getDuracion());
        }
    };
    public static Comparator<EntitieMovie> compararTitulo = new Comparator<EntitieMovie>() {
        @Override
        public int compare(EntitieMovie pe1, EntitieMovie pe2 ){
            return pe1.getTitulo().compareTo(pe2.getTitulo());
        }
    };
    public static Comparator<EntitieMovie> compararDirector = new Comparator<EntitieMovie>() {
        @Override
        public int compare(EntitieMovie pe1, EntitieMovie pe2 ){
            return pe1.getDirector().compareTo(pe2.getDirector());
        }
    };
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String directador) {
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
