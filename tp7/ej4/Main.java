package tp7_ej4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[][] datos = {
            {"Emiliano Martinez", "Arquero", "33", "Aston Villa", "true"},
            {"Cristian Romero", "Defensor", "28", "Tottenham", "true"},
            {"Nicolas Otamendi", "Defensor", "38", "Benfica", "true"},
            {"Nahuel Molina", "Defensor", "28", "Atletico Madrid", "true"},
            {"Enzo Fernandez", "Mediocampista", "25", "Chelsea", "true"},
            {"Rodrigo De Paul", "Mediocampista", "32", "Inter Miami", "true"},
            {"Alexis Mac Allister", "Mediocampista", "27", "Liverpool", "true"},
            {"Lionel Messi", "Delantero", "39", "Inter Miami", "true"},
            {"Julian Alvarez", "Delantero", "26", "Atletico Madrid", "true"},
            {"Lautaro Martinez", "Delantero", "29", "Inter Milan", "true"},
            {"Paulo Dybala", "Delantero", "33", "Roma", "false"},
            {"Mike Maignan", "Arquero", "31", "Milan", "true"},
            {"William Saliba", "Defensor", "25", "Arsenal", "true"},
            {"Theo Hernandez", "Defensor", "29", "Milan", "true"},
            {"Jules Kounde", "Defensor", "28", "Barcelona", "true"},
            {"Aurelien Tchouameni", "Mediocampista", "26", "Real Madrid", "true"},
            {"Eduardo Camavinga", "Mediocampista", "24", "Real Madrid", "true"},
            {"Adrien Rabiot", "Mediocampista", "31", "Marseille", "true"},
            {"Kylian Mbappe", "Delantero", "28", "Real Madrid", "true"},
            {"Ousmane Dembele", "Delantero", "29", "PSG", "true"},
            {"Marcus Thuram", "Delantero", "29", "Inter Milan", "true"},
            {"Antoine Griezmann", "Delantero", "35", "Atletico Madrid", "false"}
        };

        Jugador[] jugadores = new Jugador[datos.length];

        for (int i = 0; i < datos.length; i++) {
            jugadores[i] = new Jugador(
                    datos[i][0],
                    datos[i][1],
                    Integer.parseInt(datos[i][2]),
                    datos[i][3],
                    Boolean.parseBoolean(datos[i][4]));
        }

        Seleccion seleccion = new Seleccion();

        for (Jugador j : jugadores) {
            seleccion.agregarJugador(j);
        }

        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== menu ===");
            System.out.println("1. Agregar jugador");
            System.out.println("2. Eliminar jugador");
            System.out.println("3. Mostrar plantel");
            System.out.println("4. Mostrar convocados");
            System.out.println("5. Mostrar no convocados");
            System.out.println("6. Mostrar jugador mas joven");
            System.out.println("7. Mostrar jugador mas veterano");
            System.out.println("8. Mostrar promedio de edad");
            System.out.println("9. Contar por posicion");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

            case 1:

                System.out.print("Nombre: ");
                String nombre = teclado.nextLine();

                System.out.print("Posicion: ");
                String posicion = teclado.nextLine();

                System.out.print("Edad: ");
                int edad = teclado.nextInt();
                teclado.nextLine();

                System.out.print("Equipo: ");
                String equipo = teclado.nextLine();

                System.out.print("Convocado (true/false): ");
                boolean convocado = teclado.nextBoolean();
                teclado.nextLine();

                Jugador nuevo = new Jugador(
                        nombre,
                        posicion,
                        edad,
                        equipo,
                        convocado);

                seleccion.agregarJugador(nuevo);

                System.out.println("Jugador agregado.");
                break;

            case 2:

                System.out.print("Nombre del jugador a eliminar: ");
                String eliminar = teclado.nextLine();

                seleccion.eliminarJugador(eliminar);

                System.out.println("Jugador eliminado.");
                break;

            case 3:

                seleccion.mostrarPlantel();
                break;

            case 4:

                seleccion.mostrarConvocados();
                break;

            case 5:

                seleccion.mostrarNoConvocados();
                break;

            case 6:

                System.out.println(seleccion.jugadorMasJoven());
                break;

            case 7:

                System.out.println(seleccion.jugadorMasVeterano());
                break;

            case 8:

                System.out.println("Promedio de edad: "
                        + seleccion.promedioEdad());
                break;

            case 9:

                seleccion.contarPorPosicion();
                break;

            case 0:

                System.out.println("Programa finalizado.");
                break;

            default:

                System.out.println("Opcion invalida.");
            }

        } while (opcion != 0);

        teclado.close();
    }
}