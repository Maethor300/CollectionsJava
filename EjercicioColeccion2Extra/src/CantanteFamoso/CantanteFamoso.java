package CantanteFamoso;

public class CantanteFamoso {
    private String name;
    private String discoMasVendido;
    public CantanteFamoso(){

    }
    public CantanteFamoso(String name, String discoMasVendido) {
        this.name = name;
        this.discoMasVendido = discoMasVendido;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscoMasVendido() {
        return discoMasVendido;
    }

    public void setDiscoMasVendido(String discoMasVendido) {
        this.discoMasVendido = discoMasVendido;
    }

    @Override
    public String toString() {
        return "CantanteFamoso{" +
                "name='" + name + '\'' +
                ", discoMasVendido='" + discoMasVendido + '\'' +
                '}';
    }
}
