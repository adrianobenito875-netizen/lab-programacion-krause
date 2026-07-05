package ej1.tp8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Mundial mundial = new Mundial();

        try {
            Seleccion argentina = new Seleccion("Argentina", "América", 9, 26, "Clasificada");
            Seleccion brasil = new Seleccion("Brasil", "América", 6, 26, "Clasificada");
            Seleccion japon = new Seleccion("Japón", "Asia", 3, 10, "Clasificada");

            DirectorTecnico scaloni = new DirectorTecnico("Lionel Scaloni", 47, "Argentina");
            DirectorTecnico ancelotti = new DirectorTecnico("Carlo Ancelotti", 66, "Italia");

            argentina.setDirectorTecnico(scaloni);
            brasil.setDirectorTecnico(ancelotti);
            
            mundial.agregarSeleccion(argentina);
            mundial.agregarSeleccion(brasil);
            mundial.agregarSeleccion(japon);

            System.out.println("=== SELECCIONES REGISTRADAS ===");
            mundial.mostrarSelecciones();

            System.out.print("\nIngrese una posición para consultar: ");
            int posicion = Integer.parseInt(teclado.nextLine());

            try {

                Seleccion seleccion = mundial.consultarSeleccion(posicion);
                System.out.println(seleccion);

            } catch (IndexOutOfBoundsException e) {

                System.out.println("Error: la posición ingresada no existe.");

            }

            try {

                System.out.print("\nIngrese la posición de la selección: ");
                int pos = Integer.parseInt(teclado.nextLine());

                System.out.print("Ingrese los nuevos puntos: ");
                int puntos = Integer.parseInt(teclado.nextLine());

                mundial.actualizarPuntos(pos, puntos);

                System.out.println("Puntos actualizados correctamente.");

            } catch (NumberFormatException e) {

                System.out.println("Error: debe ingresar un número.");

            } catch (IndexOutOfBoundsException e) {

                System.out.println("No existe esa selección.");

            }

            try {

                System.out.print("\nIngrese la posición de la selección: ");
                int pos = Integer.parseInt(teclado.nextLine());

                DirectorTecnico dt = mundial.consultarDirectorTecnico(pos);

                System.out.println(dt.getNombre());
                System.out.println(dt);

            } catch (NullPointerException e) {

                System.out.println("La selección no tiene Director Técnico asignado.");

            } catch (IndexOutOfBoundsException e) {

                System.out.println("La posición ingresada no existe.");

            }

            try {

                System.out.print("\nIngrese cantidad de jugadores para Argentina: ");
                int jugadores = Integer.parseInt(teclado.nextLine());

                argentina.setJugadoresConvocados(jugadores);

                System.out.println("Cantidad actualizada.");

            } catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());

            }

            try {

                japon.disputarPartido();

            } catch (JugadoresInsuficientesException e) {

                System.out.println(e.getMessage());

            }

        } finally {

            teclado.close();
            System.out.println("\nPrograma finalizado.");

        }

    }

}