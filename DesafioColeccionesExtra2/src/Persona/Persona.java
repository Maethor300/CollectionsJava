package Persona;

import java.time.LocalDate;

public class Persona {
    private String name;
    private int edad;
    private int dni;
    private String country;

    public Persona(){

    }
    public Persona(String name, int edad, int dni, String country) {
        this.name = name;
        this.edad = edad;
        this.dni = dni;
        this.country = country;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", country='" + country + '\'' +
                '}';
    }
}
