package tp_4_ej6;

public class Unidad {
    protected int idInterno;
    protected int capacidadPasajeros;

    public Unidad(int idInterno, int capacidadPasajeros) {
        this.idInterno = idInterno;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public void arrancar() {
        System.out.println("La unidad está arrancando.");
    }

    public void frenar() {
        System.out.println("La unidad está frenando.");
    }

    public void mostrar() {
        System.out.println("ID: " + idInterno + " | Capacidad: " + capacidadPasajeros);
    }
}