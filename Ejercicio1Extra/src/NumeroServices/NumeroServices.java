package NumeroServices;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class NumeroServices {
    ArrayList <Integer> dataBaseNumero = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public static int numeros;
    public static int count = 0;
    public static int suma = 0;
    public void actualizarNumeros(){

            for (int i = 0; i <= count;i++){
                System.out.println("Se puede numeros negativos o positivos");
                  int numero = scanner.nextInt();
                numeros = numero;
                if(numeros == -99){
                    System.out.println("No se puede agregar");
                    break;
                }else {
                    dataBaseNumero.add(numero);
                    count++;
                    suma = suma + numeros;
                }
            }
    }
    public void mostrarDataBase(){
        for (Integer i : dataBaseNumero
             ) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
