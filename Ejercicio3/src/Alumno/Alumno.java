package Alumno;

import java.util.ArrayList;

public class Alumno {
     private String name;
     private int nota1;
     private int nota2;
     private int nota3;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "name='" + name + '\'' +
                ", nota 1=" + nota1 +
                ", nota 2=" + nota2 +
                ", nota 3=" + nota3 +
                '}';
    }
}
