package Menu;

import HabitacionServices.HabitacionServices;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    HabitacionServices hs = new HabitacionServices();
    public void menu(){

        do {
            System.out.println("-----Menu-----");
            System.out.println("1: Reserva");
            System.out.println("2: Mostrar data");
            System.out.println("3: modificar Data");
            System.out.println("4: Eliminar");
            System.out.println("Ingresa una opcion");
            int opcionMenu = scanner.nextInt();
            switch (opcionMenu){
                case 1:
                   hs.reservacion();
                break;
                case 2:
                    hs.mostrarData();
                break;
                case 3:
                    hs.modificarData();
                break;
                case 4:
                    hs.eliminar();
                break;
            }
        }while(true);
    }
}
