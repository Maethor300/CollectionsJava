package CodigosPostales;

public class CodigosPostales {
    private String ciudad;
    private int codigoPostal;


    public CodigosPostales( int codigoPostal,String ciudad) {
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "CodigosPostales{" +
                "ciudad='" + ciudad + '\'' +
                ", codigoPostal=" + codigoPostal +
                '}';
    }
}
