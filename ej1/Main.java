package tp4;

public class Main {
	
    public static void main(String[] args) {

        Socio socio1 = new Socio(1, "Juan Pérez");

        Reserva r1 = new Reserva("2026-04-25", "Fútbol");
        Reserva r2 = new Reserva("2026-04-26", "Tenis");

        socio1.agregarReserva(r1);
        socio1.agregarReserva(r2);

        System.out.println("Reservas del socio:");
        socio1.mostrarReservas();
    }
}
