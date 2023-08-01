package ProductosServices;

import Productos.Productos;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class ProductosServices {
    HashMap<Integer,Productos> dataBase = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    private static int contador = 0;
    public void crearProducto(){

        System.out.println("Introduce el nombre");
        String name = scanner.next();
        System.out.println("Introduce el valor");
        int valor = scanner.nextInt();
        int id = contador++;
        //dataBase.put(id, p);
        dataBase.put(id, new Productos(name, valor));
        scanner.nextLine();
    }
    public void mostrarProducto(){

        for (Map.Entry<Integer, Productos> entry : dataBase.entrySet()) {
            System.out.println(
                   "Id: " + entry.getKey() +" "+ entry.getValue().toString()
            );
        }
    }
   public void actualizaPrecio(){
       System.out.println("Introduce el id del producto");
       int id = scanner.nextInt();
       if(dataBase.containsKey(id)){
           System.out.println("Actualizar el nombre");
           String newName = scanner.next();
           System.out.println("Actualizar precio");
           int newPrecio = scanner.nextInt();
           dataBase.put(id , new Productos(newName,newPrecio));
       }
   }
   public void deletedProductos(){
       System.out.println("Introduce el id del producto");
       int id = scanner.nextInt();
       dataBase.remove(id);
   }
}
