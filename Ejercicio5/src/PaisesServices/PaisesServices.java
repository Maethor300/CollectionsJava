package PaisesServices;

import Paises.Paises;

import java.util.*;

public class PaisesServices {
    LinkedHashSet<String> dataBasePaises = new LinkedHashSet<>();
    Paises paises = new Paises();
    Scanner scanner = new Scanner(System.in);
    public void crearPais(){
        System.out.println("Digita el nombre del pais");
        String name = scanner.nextLine();
        compararPaisesRepetidos(name);
        paises.setNameCountry(name);
        dataBasePaises.add(name);
    }
    public void mostrarPaises(){
         Iterator<String> iterar = dataBasePaises.iterator();
         while(iterar.hasNext()){
             System.out.println(iterar.next());
         }
    }
    public void compararPaisesRepetidos(String name){
        Iterator<String> iterar = dataBasePaises.iterator();
        while(iterar.hasNext()){
            if(name.equals(iterar.next())){
                System.out.println("El Pais ya existe");
            }
        }
    }
    public void eliminarPais(){
        Iterator<String> iterar = dataBasePaises.iterator();
        System.out.println("Introduce el pais que quieras eliminar");
        String nameDelete = scanner.nextLine();
        while(iterar.hasNext()){
            if(nameDelete.equals(iterar.next())){
                iterar.remove();
            }
        }
    }
    public void ordenarPaises(){
        List<String> listaPaises = new ArrayList<>(dataBasePaises);
            Collections.sort(listaPaises, ( a ,  b)-> a.compareTo(b));
            dataBasePaises = new LinkedHashSet<>(listaPaises);
    }
}
