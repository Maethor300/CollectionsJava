package Menu;

import MovieServices.MovieServices;

import java.util.Scanner;

public class Menu {
     MovieServices ms = new MovieServices();
    public void MenuArchives (){
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("----Menu----");
            System.out.println("1: Crear Pelicula");
            System.out.println("2: Mostrar Peliculas");
            System.out.println("3: Mostar Peliculas Mayor a una hora");
            System.out.println("4: Mostrar Peliculas de Menor a Mayor");
            System.out.println("5: Mostrar Peliculas de Mayor a Menor");
            System.out.println("6: Mostrar Pelicula orden alfabetico titulo");
            System.out.println("7: Mostrar Pelicula orden alfabetico director");
            System.out.println("8: Salir");
            int opcionesMenu = scanner.nextInt();
            switch (opcionesMenu){
                case 1:
                 ms.crearPeliculas();
                 break;
                case 2:
                  ms.mostrarPeliculas();
                 break;
                case 3:
                  ms.mostrarPeliculaMayorAUnaHora();
                 break;
                case 4 :
                    ms.mostrarPeliculaMenorAMayor();
                 break;
                case 5:
                    ms.mostrarPeliculaMayorAMenor();
                 break;
                case 6:
                    ms.mostrarPeliculaAlfabeticoTitulo();
                 break;
                case 7:
                    ms.mostrarPeliculaAlfabeticoDirector();
                 break;
                default:
                    System.out.println("Error");
                 break;
            }
            System.out.println("Quieres Continuar? 1 para si o 0 para salir");
            int opcionSalir = scanner.nextInt();
            if(opcionSalir == 0){
                break;
            }
        }while (true);
    }
}
