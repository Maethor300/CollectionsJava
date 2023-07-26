package Tienda;

public class Tienda {
    private String name;
    private String category;
    private double precio;
    private int cantidadInventario;
    private boolean productoExiste;
    public Tienda(){

    }
    public Tienda(String name, String category, double precio, int cantidadInventario) {
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

    public boolean isProductoExiste() {
        return productoExiste;
    }

    public void setProductoExiste(boolean productoExiste) {
        this.productoExiste = productoExiste;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", precio=" + precio +
                ", cantidadInventario=" + cantidadInventario +
                '}';
    }
}
