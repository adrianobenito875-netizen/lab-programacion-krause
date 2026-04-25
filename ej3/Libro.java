package tp_4_ej3;

public class Libro extends Producto {
    private String autor;

    public Libro(int codigo, double precio, String autor) {
        super(codigo, precio);
        this.autor = autor;
    }

    public double calcularPrecioFinal() {
        return getPrecio() * 1.10;
    }

    public void mostrar() {
        System.out.println("Libro:");
        super.mostrar();
        System.out.println("Autor: " + autor);
        System.out.println("Precio final: " + calcularPrecioFinal());
    }
}
