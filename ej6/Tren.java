package tp_4_ej6;

public class Tren extends Unidad {
    private int cantidadVagones;

    public Tren(int idInterno, int capacidadPasajeros, int cantidadVagones) {
        super(idInterno, capacidadPasajeros);
        this.cantidadVagones = cantidadVagones;
    }

    public void mostrar() {
        System.out.println("Tren:");
        super.mostrar();
        System.out.println("Vagones: " + cantidadVagones);
    }
}
