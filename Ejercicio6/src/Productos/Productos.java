package Productos;

public class Productos {
    private String producto;
    private int precio;
    public Productos(){

    }
    public Productos(String producto, int precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return
                "producto='" + producto + '\'' +
                ", precio=" + precio + '\n'
                 ;
    }
}
