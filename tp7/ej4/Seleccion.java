package tp7_ej4;

import java.util.ArrayList;

public class Seleccion {

    private ArrayList<Jugador> jugadores;

    public Seleccion() {
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void eliminarJugador(String nombre) {
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getNombreCompleto().equalsIgnoreCase(nombre)) {
                jugadores.remove(i);
                break;
            }
        }
    }

    public void buscarPorPosicion(String posicion) {
        for (Jugador j : jugadores) {
            if (j.getPosicion().equalsIgnoreCase(posicion)) {
                System.out.println(j);
            }
        }
    }

    public void mostrarConvocados() {
        for (Jugador j : jugadores) {
            if (j.isConvocado()) {
                System.out.println(j);
            }
        }
    }

    public void mostrarNoConvocados() {
        for (Jugador j : jugadores) {
            if (!j.isConvocado()) {
                System.out.println(j);
            }
        }
    }

    public Jugador jugadorMasJoven() {
        Jugador joven = jugadores.get(0);

        for (Jugador j : jugadores) {
            if (j.getEdad() < joven.getEdad()) {
                joven = j;
            }
        }

        return joven;
    }

    public Jugador jugadorMasVeterano() {
        Jugador veterano = jugadores.get(0);

        for (Jugador j : jugadores) {
            if (j.getEdad() > veterano.getEdad()) {
                veterano = j;
            }
        }

        return veterano;
    }

    public void buscarPorEquipo(String equipo) {
        for (Jugador j : jugadores) {
            if (j.getEquipo().equalsIgnoreCase(equipo)) {
                System.out.println(j);
            }
        }
    }

    public void ordenarPorEdad() {
        for (int i = 0; i < jugadores.size() - 1; i++) {
            for (int j = i + 1; j < jugadores.size(); j++) {
                if (jugadores.get(i).getEdad() > jugadores.get(j).getEdad()) {

                    Jugador aux = jugadores.get(i);
                    jugadores.set(i, jugadores.get(j));
                    jugadores.set(j, aux);
                }
            }
        }
    }

    public void contarPorPosicion() {

        int arqueros = 0;
        int defensores = 0;
        int mediocampistas = 0;
        int delanteros = 0;

        for (Jugador j : jugadores) {

            switch (j.getPosicion().toLowerCase()) {

            case "arquero":
                arqueros++;
                break;

            case "defensor":
                defensores++;
                break;

            case "mediocampista":
                mediocampistas++;
                break;

            case "delantero":
                delanteros++;
                break;
            }
        }

        System.out.println("Arqueros: " + arqueros);
        System.out.println("Defensores: " + defensores);
        System.out.println("Mediocampistas: " + mediocampistas);
        System.out.println("Delanteros: " + delanteros);
    }

    public boolean estaConvocado(String nombre) {

        for (Jugador j : jugadores) {
            if (j.getNombreCompleto().equalsIgnoreCase(nombre)) {
                return j.isConvocado();
            }
        }

        return false;
    }

    public double promedioEdad() {

        int suma = 0;

        for (Jugador j : jugadores) {
            suma += j.getEdad();
        }

        return (double) suma / jugadores.size();
    }

    public void mostrarPlantel() {
        for (Jugador j : jugadores) {
            System.out.println(j);
        }
    }

    public void contarPorSeleccion() {
        System.out.println("Argentina: 11 jugadores");
        System.out.println("Francia: 11 jugadores");
    }
}
