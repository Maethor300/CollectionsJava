package Main;

import RazaPerros.RazaPerros;
import RazasServices.RazaServices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RazaPerros rp = new RazaPerros();
        RazaServices rs = new RazaServices();
        Scanner scanner = new Scanner(System.in);
        boolean desicion = true;
        do {
            System.out.println("----Menu----");
            System.out.println("1: Crear Razas");
            System.out.println("2: Mostrar Razas");
            System.out.println("3: Buscar y eliminar Razas");
            System.out.println("4: Salir");
            int desicion2 = scanner.nextInt();
            switch (desicion2){
                case 1 :
                    rs.razasAdd(rp.getRazas());
                break;
                case 2:
                    rs.showRazas(rp.getRazas());
                break;
                case 3:
                    rs.deletedRazas(rp.getRazas());
                break;
                case 4:
                      desicion = false;
                break;
                default:
                    System.out.println("Error");
            }
            if(!desicion){
                rs.showRazas(rp.getRazas());
                break;
            }
        }while(true);

    }
}