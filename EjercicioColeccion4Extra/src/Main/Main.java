package Main;

import CodigoPostalServices.CodigoPostalServices;
import CodigosPostales.CodigosPostales;
import Menu.Menu;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        CodigoPostalServices cps = new CodigoPostalServices();
        CodigoPostalServices.dataBaseCodigoPostal.put(110621,new CodigosPostales(110621,"Bogota"));
        CodigoPostalServices.dataBaseCodigoPostal.put(760014,new CodigosPostales(760014,"Cali"));
        CodigoPostalServices.dataBaseCodigoPostal.put(10286,new CodigosPostales(10286,"New York"));
        CodigoPostalServices.dataBaseCodigoPostal.put(050013,new CodigosPostales(050013,"Medellin"));
        menu.menu();
    }
}