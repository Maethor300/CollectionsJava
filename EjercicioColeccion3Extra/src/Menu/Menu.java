package Menu;

import Libro.Libro;
import LibroServices.LibroServices;

import java.util.HashSet;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    LibroServices ls = new LibroServices();
     public void menu(HashSet<Libro>dataBaseLibro){
         do {
             System.out.println("-----Menu-----");
             System.out.println("1: Crear libro");
             System.out.println("2: mostrar libros");
             System.out.println("3: Prestar Libro");
             System.out.println("4: Devolver libro");
             int opcion = scanner.nextInt();
             switch (opcion){
                 case 1:
                     ls.crearLibros(dataBaseLibro);
                 break;
                 case 2:
                     ls.mostrarDataLibros(dataBaseLibro);
                 break;
                 case 3:
                     ls.metodoPrestamo(dataBaseLibro);
                 break;
                 case 4:
                     ls.metodoDevolver(dataBaseLibro);
             }
             System.out.println("Quieres Continuar? 1 para si o 0 para no:");
             int opcionSalir = scanner.nextInt();
             if(opcionSalir == 0){
                 break;
             }
         }while(true);
     }
}
