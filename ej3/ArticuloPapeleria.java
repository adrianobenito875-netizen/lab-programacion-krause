package tp_4_ej3;

public class ArticuloPapeleria extends Producto {
    private String tipoMaterial;

    public ArticuloPapeleria(int codigo, double precio, String tipoMaterial) {
        super(codigo, precio);
        this.tipoMaterial = tipoMaterial;
    }

    public double calcularPrecioFinal() {
        return getPrecio() * 1.05;
    }

    public void mostrar() {
        System.out.println("Artículo de papelería:");
        super.mostrar();
        System.out.println("Tipo de material: " + tipoMaterial);
        System.out.println("Precio final: " + calcularPrecioFinal());
    }
}
