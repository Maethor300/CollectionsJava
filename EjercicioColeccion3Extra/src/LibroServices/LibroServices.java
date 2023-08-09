package LibroServices;

import Libro.Libro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class LibroServices {
    Scanner scanner = new Scanner(System.in);

      public void crearLibros(HashSet<Libro>dataBaseLibro){
          Libro libro = new Libro();
          System.out.println("Digita el nombre del libro");
          String name = scanner.nextLine();
          libro.setTitulo(name);
          System.out.println("Digita el autor del libro");
          String autor = scanner.nextLine();
          libro.setAutor(autor);
          System.out.println("Digita la cantidad de ejemplares");
          int ejemplares = scanner.nextInt();
          libro.setNumeroEjemplares(ejemplares);
          dataBaseLibro.add(libro);
          scanner.nextLine();
      }
      public void mostrarDataLibros(HashSet<Libro>dataBaseLibro){
          for (Libro i : dataBaseLibro
               ) {
              System.out.println(i);
          }
      }
      public void metodoPrestamo(HashSet<Libro>dataBaseLibro){
          System.out.println("Digita el libro que quieres");
          String name = scanner.nextLine();
          for (Libro i : dataBaseLibro
          ) {
              if(name.equals(i.getTitulo())){
                  if(i.getNumeroEjemplares() == 0){
                      System.out.println("No hay ejemplares disponibles");
                  }else {
                      i.setNumeroEjemplares(i.getNumeroEjemplares() - 1);
                      i.setNumeroDeEjemplaresPrestados(i.getNumeroDeEjemplaresPrestados()+1);
                  }
              }
          }
      }

      public void metodoDevolver(HashSet<Libro>dataBaseLibro){
          System.out.println("Digita el libro que quieres");
          String name = scanner.nextLine();
          for (Libro i : dataBaseLibro
          ) {
               if(name.equals(i.getTitulo())){
                   if(i.getNumeroDeEjemplaresPrestados() > 0){
                           i.setNumeroEjemplares(i.getNumeroEjemplares() + 1);
                           i.setNumeroDeEjemplaresPrestados(i.getNumeroDeEjemplaresPrestados()-1);
                   }else {
                       System.out.println("No hay mas para devolver");
                   }
               }
          }
      }
}
