package tp_4_ej3;

public abstract class Producto {
    protected int codigo;
    private double precio;

    public Producto(int codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void mostrar() {
        System.out.println("Código: " + codigo + " | Precio: " + precio);
    }

    public abstract double calcularPrecioFinal();
}
