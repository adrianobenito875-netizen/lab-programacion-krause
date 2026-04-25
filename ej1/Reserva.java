package tp4;

public class Reserva {
    private String fecha;
    private String tipoDeporte;
    private Socio socio;

    public Reserva(String fecha, String tipoDeporte) {
        this.fecha = fecha;
        this.tipoDeporte = tipoDeporte;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public void mostrar() {
        System.out.println("Fecha: " + fecha + " | Deporte: " + tipoDeporte);
    }
}
