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
         Scanner scanner = new Scanner(System.in).useDelimiter("\n");
         Tienda productos = new Tienda();

         do {
             boolean outNumber = true;
             System.out.println("Digita el nombre del producto que quieres modificar");

             String name = scanner.nextLine();
             System.out.println("Que quieres modificar?");
             System.out.println("1: Nombre");
             System.out.println("2: Category");
             System.out.println("3: Precio");
             System.out.println("4: Salir");
             int numeroDesicion = scanner.nextInt();
             switch (numeroDesicion){
                 case 1:
                     for (Tienda i : dataBase
                          ) {
                         if(i.getName().equalsIgnoreCase(name)){
                             System.out.println("Introduce el nuevo nombre:");
                             scanner.nextLine();
                             String newName = scanner.nextLine();
                             i.setName(newName);

                         }else {
                             System.out.println("No esta el producto");
                         }
                     }
                 break;
                 case 2:
                     for (Tienda i : dataBase
                          ) {
                         if(i.getName().equalsIgnoreCase(name)){
                             System.out.println("Introduce la nueva categoria");
                             scanner.nextLine();
                             String newCategory = scanner.nextLine();

                             i.setCategory(newCategory);

                         }else {
                             System.out.println("No esta el producto");
                         }
                     }
                 break;
                 case 3:
                     for (Tienda i : dataBase
                     ) {
                         if(i.getName().equalsIgnoreCase(name)){
                             System.out.println("Introduce la nueva categoria");
                             scanner.nextDouble();
                             double newPrecio = scanner.nextDouble();

                             i.setPrecio(newPrecio);

                         }else {
                             System.out.println("No esta el producto");
                         }
                     }
                 break;
                 case 4:
                     System.out.println("Quieres salir? 1 para seguir actualizando o 0 para salir");
                     int salirOutDesisition = scanner.nextInt();

                     if (salirOutDesisition == 0 ) {
                         outNumber = false;
                     }
                 break;
                 default:
                     System.out.println("Error Numero no indicado");
                 break;
             }
             System.out.println("Quieres terminar 1 seguir / 0 terminar");
             int desitionFinal = scanner.nextInt();
             if(desitionFinal == 0){
                 outNumber = false;
             }
             if(!outNumber){
                 break;
             }
         }while(true);
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
