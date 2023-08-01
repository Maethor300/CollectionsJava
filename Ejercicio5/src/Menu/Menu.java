package Menu;

import PaisesServices.PaisesServices;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    PaisesServices ps = new PaisesServices();
    public void menu(){
        do {
            System.out.println("-----Menu-----");
            System.out.println("1: Crear pais");
            System.out.println("2: Seleccionar pais");
            System.out.println("3: Ordenar paises");
            System.out.println("Salir");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                     ps.crearPais();
                break;
                case 2:
                     ps.eliminarPais();
                break;
                case 3:
                     ps.ordenarPaises();
                break;
                default:
                    System.out.println("Error");
                break;
            }
            System.out.println("Quieres Continuar 1 para seguir o 0 para salir");
            int opcionSalir = scanner.nextInt();
            if(opcionSalir == 0){
                ps.mostrarPaises();
                break;
            }
        }while (true);
    }
}
