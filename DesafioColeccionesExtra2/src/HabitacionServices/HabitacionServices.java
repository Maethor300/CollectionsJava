package HabitacionServices;

import Habitacion.Habitacion;
import Persona.Persona;

import java.time.LocalDate;
import java.util.*;

public class HabitacionServices {

    Scanner scanner = new Scanner(System.in);



    LinkedHashMap<Habitacion,Persona> PrincipalInfo = new LinkedHashMap<>();

    public void reservacion(){
        do {
            Persona persona  = new Persona();
            int integrantes;
            int dias;
            System.out.println("-----Reservacion-----");
            System.out.println("Habitacion 1 - 5: Entran 2 personas");
            System.out.println("Habitacion 6 - 8: Entran 3 personas");
            System.out.println("Habitacion 9 - 10: Entran 1 personas");
            int opcionHabitacion = scanner.nextInt();
            boolean salir = vereficarRepetido(opcionHabitacion);
            if(!salir){
                break;
            }
            switch (opcionHabitacion){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:

                    System.out.println("Cuantos Integrantes 1 o 2");
                      integrantes = scanner.nextInt();
                    boolean salirMiniWhile;

                      do {
                            salirMiniWhile = true;
                          if(integrantes > 2){
                              System.out.println("Es mayor a dos");
                              System.out.println("Escribe de nuevo la cantidad de integrantes");
                              integrantes = scanner.nextInt();
                          }else {
                              salirMiniWhile = false;
                          }
                      }while (salirMiniWhile);
                    for (int i = 1; i <= integrantes; i++) {
                          persona  = new Persona();
                        System.out.println("Introduce el nombre de la persona: " + i);
                        String name = scanner.next();
                        persona.setName(name);
                        System.out.println("Introduce la edad de la persona " + i);
                        int edad = scanner.nextInt();
                        persona.setEdad(edad);
                        System.out.println("Introduce el dni de la persona "+ i);
                        int dni = scanner.nextInt();
                        persona.setDni(dni);
                        System.out.println("Introduce el pais de la persona " + i);
                        String country = scanner.next();
                        persona.setCountry(country);

                        System.out.println("Cuantos dias se va a quedar:");
                        dias = scanner.nextInt();
                        PrincipalInfo.put(new Habitacion(opcionHabitacion,dias),persona );
                    }

                break;
                case 6:
                case 7:
                case 8:

                    System.out.println("Cuantos Integrantes 1 o 2");
                     int integrantes2 = scanner.nextInt();
                    boolean salirMiniWhile2;
                    do {
                        salirMiniWhile2 = true;
                        if(integrantes2 > 3){
                            System.out.println("Es mayor a tres");
                            System.out.println("Escribe de nuevo la cantidad de integrantes");
                            integrantes2 = scanner.nextInt();
                        }else {
                            salirMiniWhile2 = false;
                        }
                    }while (salirMiniWhile2);
                    for (int i = 1; i <= integrantes2; i++) {
                        persona  = new Persona();
                        System.out.println("Introduce el nombre de la persona: " + i);
                        String name = scanner.next();
                        persona.setName(name);
                        System.out.println("Introduce la edad de la persona " + i);
                        int edad = scanner.nextInt();
                        persona.setEdad(edad);
                        System.out.println("Introduce el dni de la persona "+ i);
                        int dni = scanner.nextInt();
                        persona.setDni(dni);
                        System.out.println("Introduce el pais de la persona " + i);
                        String country = scanner.next();
                        persona.setCountry(country);
                        System.out.println("Cuantos dias se va a quedar:");
                        int dias2 = scanner.nextInt();
                        PrincipalInfo.put(new Habitacion(opcionHabitacion,dias2), persona);

                    }

                break;
                case 9:
                case 10:


                    persona  = new Persona();
                    System.out.println("Introduce el nombre de la persona: "  );
                    String name = scanner.next();
                    persona.setName(name);
                    System.out.println("Introduce la edad de la persona "  );
                    int edad = scanner.nextInt();
                    persona.setEdad(edad);
                    System.out.println("Introduce el dni de la persona " );
                    int dni = scanner.nextInt();
                    persona.setDni(dni);
                    System.out.println("Introduce el pais de la persona "  );
                    String country = scanner.next();
                    persona.setCountry(country);


                    System.out.println("Cuantos dias se va a quedar:");
                    int dias3 = scanner.nextInt();
                    PrincipalInfo.put(new Habitacion(opcionHabitacion,dias3), persona);
            }
            break;
        }while (true);


    }
    public boolean vereficarRepetido(int id){
        boolean salir = true;
        for (Map.Entry<Habitacion,Persona> i : PrincipalInfo.entrySet()
             ) {
             if(id == i.getKey().getHabitacion()){
                 System.out.println("Ya esta ocupada la habitacion");
                 salir = false;
             }
        }
        return salir;
    }
    public void modificarData(){
        for (Map.Entry<Habitacion,Persona> i : PrincipalInfo.entrySet()
             ) {
            System.out.println("Digita la habitacion");
            int habitacion = scanner.nextInt();
            if(i.getKey().getHabitacion() == habitacion){
                System.out.println("Digita el dni");
                int dni = scanner.nextInt();
                if(i.getValue().getDni() == dni ){
                    System.out.println("Digita el nuevo nombre");
                    String nuevoNombre = scanner.next();
                    i.getValue().setName(nuevoNombre);
                    System.out.println("Digita la nueva edad");
                    int nuevaEdad = scanner.nextInt();
                    i.getValue().setEdad(nuevaEdad);
                    System.out.println("Digita el nuevo dni");
                    int nuevoDni = scanner.nextInt();
                    i.getValue().setDni(nuevoDni);
                    System.out.println("Digita el nuevo pais");
                    String nuevoPais = scanner.next();
                    i.getValue().setCountry(nuevoPais);
                    break;
                }
            }
        }
    }
    public void eliminar(){
        for (Map.Entry<Habitacion,Persona> i : PrincipalInfo.entrySet()) {
            System.out.println("Digita la habitacion");
            int habitacion = scanner.nextInt();
            System.out.println("Digita el dni de la persona");
            int dni = scanner.nextInt();
            if(i.getKey().getHabitacion() == habitacion && i.getValue().getDni() == dni){
                PrincipalInfo.remove(i.getKey());
            }
            break;
        }
    }
    public void mostrarData(){
        for (Map.Entry<Habitacion,Persona> i : PrincipalInfo.entrySet()) {
            System.out.println(i);
        }
    }

}
