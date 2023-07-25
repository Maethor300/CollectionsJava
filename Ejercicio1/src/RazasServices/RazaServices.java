package RazasServices;

import RazaPerros.RazaPerros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RazaServices {
    public void razasAdd(ArrayList <String> razas){
        RazaPerros rp = new RazaPerros();
        System.out.println("Digita una Raza");
        Scanner scanner = new Scanner(System.in);
        razas.add(scanner.nextLine());
    }
    public void showRazas(ArrayList <String> razas){
        for (String i : razas
             ) {
            System.out.println("Raza: " +  i);
        }
    }
    public void deletedRazas(ArrayList <String> razas){
        Scanner scanner = new Scanner(System.in);
        Iterator<String> it = razas.iterator();
        System.out.println("Escribe la raza que deseas eliminar");
        String raza = scanner.nextLine();
        while (it.hasNext()){
            if(it.next().equals(raza)){
                it.remove();
                break;
            }
        }
    }
}
