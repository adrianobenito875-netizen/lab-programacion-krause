package tp_4_ej6;

public class Colectivo extends Unidad {
    private int numeroLinea;

    public Colectivo(int idInterno, int capacidadPasajeros, int numeroLinea) {
        super(idInterno, capacidadPasajeros);
        this.numeroLinea = numeroLinea;
    }

    public void mostrar() {
        System.out.println("Colectivo:");
        super.mostrar();
        System.out.println("Línea: " + numeroLinea);
    }
}
