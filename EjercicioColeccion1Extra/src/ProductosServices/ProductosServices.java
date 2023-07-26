package ProductosServices;

import Tienda.Tienda;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProductosServices {

     public void addProductos(ArrayList <Tienda> dataBase){
         Scanner scanner = new Scanner(System.in);
         Tienda productos = new Tienda();
         System.out.println("Ingresa el nombre del producto");
         productos.setName(scanner.nextLine());
         System.out.println("Ingresa la categoria");
         productos.setCategory(scanner.nextLine());
         System.out.println("Ingresa el precio");
         productos.setPrecio(scanner.nextInt());
         System.out.println("Ingresa la cantidad en el invetario del producto");
         productos.setCantidadInventario(scanner.nextInt());
         scanner.nextLine();
         dataBase.add(productos);
     }
     public void ventaProducto(ArrayList <Tienda> dataBase){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Ingresa el nombre del producto");
         String name = scanner.nextLine();
         for (Tienda i : dataBase
              ) {
             if(i.getName().equalsIgnoreCase(name)&& i.getCantidadInventario() > 0){
                 i.setCantidadInventario(i.getCantidadInventario()-1);
                 showProducts(dataBase);
             }else {
                 System.out.println("No hay suficientes productos en el inventario");
             }
         }
     }
     public void reponerProductos(ArrayList <Tienda> dataBase){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Ingresa el nombre del producto");
         String name = scanner.nextLine();
         for (Tienda i : dataBase
              ) {
             if(i.getName().equalsIgnoreCase(name)){
                 i.setCantidadInventario(i.getCantidadInventario() + 1);
             }else {
                 System.out.println("No existe el producto");
             }
         }
     }
     public void showProducts(ArrayList <Tienda> dataBase){
         for (Tienda i : dataBase
              ) {
             System.out.println(i);
         }
     }
     public void editProducts(ArrayList <Tienda> dataBase){
         Scanner scanner = new Scanner(System.in);
         Tienda productos = new Tienda();
         System.out.println("Digita el nombre del producto que quieres modificar");
         String name = scanner.nextLine();
         for (Tienda i : dataBase
              ) {
             if(i.getName().equalsIgnoreCase(name)){
                 System.out.println("Ingresa el nuevo nombre del producto");
                 i.setName(scanner.nextLine());
                 System.out.println("Ingresa la nueva categoria");
                 i.setCategory(scanner.nextLine());
                 System.out.println("Ingresa el nuevo precio");
                 i.setPrecio(scanner.nextInt());
             }else {
                 System.out.println("No esta el producto");
             }
         }
     }
     public void deleteProducts(ArrayList <Tienda> dataBase){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Ingresa el nombre del producto");
         String name = scanner.nextLine();
         for (Tienda i : dataBase
              ) {
             if(i.getName().equalsIgnoreCase(name)){
                 dataBase.remove(i);
                 System.out.println("Producto eliminado exitosamente");
             }else {
                 System.out.println("No existe el producto");
             }
         }
     }
}
