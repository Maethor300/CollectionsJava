package RazaPerros;
import java.util.ArrayList;
public class RazaPerros {
    private String raza;
    private ArrayList<String> razas = new ArrayList<>();

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public ArrayList<String> getRazas() {
        return razas;
    }

    public void setRazas(ArrayList<String> razas) {
        this.razas = razas;
    }
}
