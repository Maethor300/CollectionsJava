package Main;

import Libro.Libro;
import LibroServices.LibroServices;
import Menu.Menu;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Libro> dataBaseLibro = new HashSet<>();
        dataBaseLibro.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 10));
        dataBaseLibro.add(new Libro("El señor de los anillos", "J. R. R. Tolkien", 20));
        dataBaseLibro.add(new Libro("1984", "George Orwel", 15));
        dataBaseLibro.add(new Libro("Un mundo feliz", "Aldous Huxley", 10));
        dataBaseLibro.add(new Libro("Orgullo y prejuicio", "Jane Austen", 9));
        Menu menu = new Menu();
        menu.menu(dataBaseLibro);
    }
}