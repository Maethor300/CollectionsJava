package CodigoPostalServices;

import CodigosPostales.CodigosPostales;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class CodigoPostalServices {
    Scanner scanner = new Scanner(System.in);
    public static HashMap<Integer, CodigosPostales> dataBaseCodigoPostal = new HashMap<>();
    public void crearCodigoPostal(){
        System.out.println("Codigo postal");
        int codigo = scanner.nextInt();
        System.out.println("Nombre de la ciudad");
        String name = scanner.next();
        dataBaseCodigoPostal.put(codigo, new CodigosPostales(codigo,name));
    }
    public void mostrarCodigoPostal(){
        for (Map.Entry<Integer, CodigosPostales> i: dataBaseCodigoPostal.entrySet()
             ) {
            System.out.println("Key: " + i.getKey() + " " + "Ciudad: " + i.getValue());
        }
    }
    public void mostrarCiudad(){

        for (Map.Entry<Integer, CodigosPostales> i: dataBaseCodigoPostal.entrySet()
        ) {
            System.out.println("Introduce codigo postal");
            int codigo = scanner.nextInt();
             if(dataBaseCodigoPostal.containsKey(codigo)){
                 System.out.println(i.getKey()+" "+i.getValue());
                 break;
             }
        }
    }
    public void deletedCiudades(){
        int i = 0;
        do {
            System.out.println("Digita el codigo de la ciudad que quieres eliminar");
            System.out.println("Vamos a eliminar :" + (i + 1));
            int codigo = scanner.nextInt();
                    dataBaseCodigoPostal.remove(codigo);
            i++;
        }while(i < 3);
    }
}
