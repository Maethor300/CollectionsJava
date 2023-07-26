package Main;
import Tienda.Tienda;
import ProductosServices.ProductosServices;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         ArrayList <Tienda> dataBase = new ArrayList<>();
         ProductosServices ps = new ProductosServices();

         do{
             System.out.println("----Menu----");
             System.out.println("1: Agregar Producto");
             System.out.println("2: Mostrar Lista");
             System.out.println("3: Comprar Producto");
             System.out.println("4: Actualizar productos");
             System.out.println("5: Eliminar producto");
             System.out.println("6: Editar Producto ");
             System.out.println("7: Salir");
             int opcion = scanner.nextInt();
             switch (opcion){
                 case 1 :
                     ps.addProductos(dataBase);
                 break;
                 case 2 :
                     ps.showProducts(dataBase);
                 break;
                 case 3 :
                     ps.ventaProducto(dataBase);
                 break;
                 case 4:
                     ps.reponerProductos(dataBase);
                 break;
                 case 5:
                     ps.deleteProducts(dataBase);
                 break;
                 case 6:
                     ps.editProducts(dataBase);
                 break;
             }
             if(opcion == 7){
                 break;
             }
         }while(true);

    }
}