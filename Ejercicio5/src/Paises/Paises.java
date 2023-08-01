package Paises;

public class Paises {
    private String nameCountry;
    private int codigoCountry;
    public Paises(){

    }
    public Paises(String nameCountry, int codigoCountry) {
        this.nameCountry = nameCountry;
        this.codigoCountry = codigoCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public int getCodigoCountry() {
        return codigoCountry;
    }

    public void setCodigoCountry(int codigoCountry) {
        this.codigoCountry = codigoCountry;
    }
}
