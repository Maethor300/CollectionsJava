package CantanteFamosoServices;

import CantanteFamoso.CantanteFamoso;

import java.util.ArrayList;
import java.util.Scanner;

public class CantanteFamosoServices {
        public static ArrayList<CantanteFamoso> dataBaseArtist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        public void crearArtist(){
            System.out.println("Digita el nombre del artista");
            String name = scanner.nextLine();
            System.out.println("Disco mas Vendido");
            String disco = scanner.nextLine();
            dataBaseArtist.add(new CantanteFamoso(name, disco));
        }
        public void showArtist(){
            for (CantanteFamoso i : dataBaseArtist
                 ) {
                System.out.println(i);
            }
        }
        public void deletedArtist(){
            System.out.println("Digital el nombre del artista que deseas eliminar");
            String name = scanner.nextLine();
            for (CantanteFamoso i : dataBaseArtist
                 ) {
                   if(name.equals(i.getName())){
                       dataBaseArtist.remove(i);
                   }
            }
        }
}
