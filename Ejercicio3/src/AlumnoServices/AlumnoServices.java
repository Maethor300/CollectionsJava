package AlumnoServices;

import Alumno.Alumno;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class AlumnoServices {
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    public void add(){
        Scanner scanner = new Scanner(System.in);

        do {
            Alumno alumno = new Alumno();
            System.out.println("Digita el nombre del alumno");
            alumno.setName(scanner.nextLine());
            System.out.println("Digita la nota 1");
            alumno.setNota1(scanner.nextInt());
            System.out.println("Digita la nota 2");
            alumno.setNota2(scanner.nextInt());
            System.out.println("Digita la nota 3");
            alumno.setNota3(scanner.nextInt());
            alumnos.add(alumno);

            System.out.println("Quieres continuar 1 si o 0 para no");
            int desicion = scanner.nextInt();
            if(desicion == 0){
                break;
            }
            scanner.nextLine();
        }while (true);
    }
    public void showAlumnos(){
        for (Alumno i : alumnos
             ) {
            System.out.println(i);
        }
    }
    public int sumaNotas(){
        Iterator<Alumno> it = alumnos.iterator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre del alumno");
        String name = scanner.nextLine();
        int suma = 0;
        while(it.hasNext()){
            if(it.next().getName().equals(name)){
                   Alumno alumno = it.next();
                   suma = alumno.getNota1() + alumno.getNota2() + alumno.getNota3();
            }
        }
        return suma;
    }
}
