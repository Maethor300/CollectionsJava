package Menu;

import CantanteFamosoServices.CantanteFamosoServices;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    CantanteFamosoServices cfs = new CantanteFamosoServices();
    public void menu(){

        do {
            System.out.println("------Menu------");
            System.out.println("1: Crear Artista");
            System.out.println("2: Mostrar Data base");
            System.out.println("3: Eliminar");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    cfs.crearArtist();
                break;
                case 2:
                    cfs.showArtist();
                break;
                case 3:
                    cfs.deletedArtist();
                break;
            }
        }while (true);
    }
}
