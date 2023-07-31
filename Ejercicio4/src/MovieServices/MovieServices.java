package MovieServices;

import EntitieMovie.EntitieMovie;

import java.time.LocalTime;
import java.util.*;

public class MovieServices {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    ArrayList <EntitieMovie> dataBase = new ArrayList<>();

    public void crearPeliculas(){
        EntitieMovie em = new EntitieMovie();
        System.out.println("Digita el nombre de la pelicula");
        String nombre = scanner.nextLine();
        em.setTitulo(nombre);
        System.out.println("Digita el Director de la pelicula");
        String nombreDirector = scanner.nextLine();
        em.setDirector(nombreDirector);
        System.out.println("Digita el tiempo de la pelicula");
        System.out.println("Horas");
        int horas = scanner.nextInt();
        System.out.println("Minutos");
        int minutos = scanner.nextInt();
        System.out.println("Segundos");
        int segundos = scanner.nextInt();
        em.setDuracion(LocalTime.of(horas,minutos,segundos));
        dataBase.add(em);
        scanner.nextLine();
    }
    public void mostrarPeliculas(){
        for (EntitieMovie i : dataBase
             ) {
            System.out.println(i);
        }
    }
    public void mostrarPeliculaMayorAUnaHora(){
        for (EntitieMovie i : dataBase
             ) {
            if(i.getDuracion().getHour() > 1){
                System.out.println(i);
            }
        }
    }

   public void mostrarPeliculaMenorAMayor(){
       dataBase.sort(EntitieMovie.compararTiempoMenor);
   }
   public void mostrarPeliculaMayorAMenor(){
       dataBase.sort(EntitieMovie.compararTiempoMayor);
   }
   public void mostrarPeliculaAlfabeticoTitulo(){
      Collections.sort(dataBase , (EntitieMovie a, EntitieMovie b) -> a.getTitulo().compareTo(b.getTitulo())) ;
   }
   public void mostrarPeliculaAlfabeticoDirector(){
        dataBase.sort(EntitieMovie.compararDirector);
   }
}
