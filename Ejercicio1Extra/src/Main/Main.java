package Main;

import NumeroServices.NumeroServices;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumeroServices ns = new NumeroServices();

          do {
              ns.actualizarNumeros();
              if(NumeroServices.numeros == -99){
                  ns.mostrarDataBase();
                  System.out.println("Count: "+ NumeroServices.count);
                  System.out.println("Suma: " + NumeroServices.suma);
                  System.out.println("Promedio: " + (double) NumeroServices.suma / NumeroServices.count);
                  break;
              }
          }while (true);
    }
}