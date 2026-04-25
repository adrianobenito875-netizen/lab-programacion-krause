package tp4;

public class Socio {
    private int nroSocio;
    private String nombre;
    private Reserva[] reservas;
    private int contador;

    public Socio(int nroSocio, String nombre) {
        this.nroSocio = nroSocio;
        this.nombre = nombre;
        this.reservas = new Reserva[10];
        this.contador = 0;
    }

    public void agregarReserva(Reserva reserva) {
        reservas[contador] = reserva;
        reserva.setSocio(this);
        contador++;
    }

    public void mostrarReservas() {
        for (int i = 0; i < contador; i++) {
            reservas[i].mostrar(); 
        }
    }
}