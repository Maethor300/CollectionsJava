package Menu;

import CodigoPostalServices.CodigoPostalServices;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    CodigoPostalServices cps = new CodigoPostalServices();
    public void menu(){
        do {
            System.out.println("-----Menu-----");
            System.out.println("1: Agregar Codigo postal");
            System.out.println("2: Mostrar Codigos Postales");
            System.out.println("3: Mostrar Ciudad");
            System.out.println("4: Eliminar Ciudad");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                   cps.crearCodigoPostal();
                break;
                case 2:
                    cps.mostrarCodigoPostal();
                break;
                case 3:
                    cps.mostrarCiudad();
                break;
                case 4:
                    cps.deletedCiudades();
                break;
            }
        }while (true);
    }
}
