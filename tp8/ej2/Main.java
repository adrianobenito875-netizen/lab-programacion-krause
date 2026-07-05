package ej2.tp8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Escuela escuela = new Escuela();

        try {

            Alumno alumno1 = new Alumno("12345678", "Juan Pérez", "5° A", 5, "Regular");
            Alumno alumno2 = new Alumno("87654321", "María Gómez", "5° B", 2, "Regular");
            Alumno alumno3 = new Alumno("11223344", "Pedro López", "4° A", 21, "Regular");

            Tutor tutor1 = new Tutor("Carlos Pérez", "11-1234-5678", "Padre");
            Tutor tutor2 = new Tutor("Laura Gómez", "11-9876-5432", "Madre");

            alumno1.setTutor(tutor1);
            alumno2.setTutor(tutor2);

            escuela.agregarAlumno(alumno1);
            escuela.agregarAlumno(alumno2);
            escuela.agregarAlumno(alumno3);

            System.out.println("=== ALUMNOS REGISTRADOS ===");
            escuela.mostrarAlumnos();

            System.out.print("\nIngrese una posición para consultar: ");
            int posicion = Integer.parseInt(teclado.nextLine());

            try {

                Alumno alumno = escuela.consultarAlumno(posicion);
                System.out.println(alumno);

            } catch (IndexOutOfBoundsException e) {

                System.out.println("Error: la posición ingresada no existe.");

            }

            try {

                System.out.print("\nIngrese la posición del alumno: ");
                int pos = Integer.parseInt(teclado.nextLine());

                System.out.print("Ingrese la cantidad de inasistencias: ");
                int cantidad = Integer.parseInt(teclado.nextLine());

                escuela.registrarInasistencias(pos, cantidad);

                System.out.println("Inasistencias registradas correctamente.");

            } catch (NumberFormatException e) {

                System.out.println("Error: debe ingresar un número.");

            } catch (IndexOutOfBoundsException e) {

                System.out.println("No existe ese alumno.");

            }

            try {

                System.out.print("\nIngrese la posición del alumno: ");
                int pos = Integer.parseInt(teclado.nextLine());

                Tutor tutor = escuela.consultarTutor(pos);

                System.out.println(tutor.getNombre());
                System.out.println(tutor);

            } catch (NullPointerException e) {

                System.out.println("El alumno no tiene tutor registrado.");

            } catch (IndexOutOfBoundsException e) {

                System.out.println("La posición ingresada no existe.");

            }

            try {

                System.out.print("\nIngrese una nueva cantidad de inasistencias para Juan Pérez: ");
                int inasistencias = Integer.parseInt(teclado.nextLine());

                alumno1.setInasistencias(inasistencias);

                System.out.println("Cantidad de inasistencias actualizada.");

            } catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());

            }

            try {

                alumno3.realizarOperacionEspecial();

            } catch (AlumnoLibreException e) {

                System.out.println(e.getMessage());

            }

        } finally {

            teclado.close();
            System.out.println("\nPrograma finalizado.");

        }

    }

}