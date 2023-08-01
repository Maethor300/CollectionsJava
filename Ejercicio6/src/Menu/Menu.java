package Menu;

import ProductosServices.ProductosServices;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    ProductosServices ps = new ProductosServices();
    public void menu(){
        do {
            System.out.println("-----Menu----");
            System.out.println("1: Crear Productos");
            System.out.println("2: Mostrar Productos");
            System.out.println("3: Actualizar Productos");
            System.out.println("4: Eliminar Productos");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                ps.crearProducto();
                break;
                case 2:
                ps.mostrarProducto();
                break;
                case 3:
                ps.actualizaPrecio();
                break;
                case 4:
                ps.deletedProductos();
                break;
            }
            System.out.println("Quieres agregar otro? 1 para si o 0 para salir");
            if(opcion == 0){
                break;
            }
        }while(true);

    }
}
