package Main;

import AlumnoServices.AlumnoServices;

public class Main {
    public static void main(String[] args) {
        AlumnoServices as = new AlumnoServices();
        as.add();
        as.showAlumnos();
        System.out.println(as.sumaNotas());
    }
}