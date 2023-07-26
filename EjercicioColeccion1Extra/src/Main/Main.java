package Main;
import Productos.Productos;
import ProductosServices.ProductosServices;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

         ArrayList <Productos> dataBase = new ArrayList<>();
         ProductosServices ps = new ProductosServices();
         ps.addProductos(dataBase);
    }
}