package Productos;

public class Productos {
    private String name;
    private String category;
    private double precio;
    private int cantidadInventario;

    public Productos(String name, String category, double precio, int cantidadInventario) {
        this.name = name;
        this.category = category;
        this.precio = precio;
        this.cantidadInventario = cantidadInventario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadInventario() {
        return cantidadInventario;
    }

    public void setCantidadInventario(int cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }
}
