package ej2.tp8;

import java.util.ArrayList;

public class Escuela {

    private ArrayList<Alumno> alumnos;

    public Escuela() {
        alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void mostrarAlumnos() {

        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
            System.out.println("-------------------------");
        }

    }

    public Alumno consultarAlumno(int posicion) {

        return alumnos.get(posicion);

    }

    public void registrarInasistencias(int posicion, int cantidad) {

        Alumno alumno = alumnos.get(posicion);
        alumno.agregarInasistencias(cantidad);

    }

    public Tutor consultarTutor(int posicion) {

        Alumno alumno = alumnos.get(posicion);
        return alumno.getTutor();

    }

    public Alumno buscarAlumno(String dni) {

        for (Alumno alumno : alumnos) {

            if (alumno.getDni().equals(dni)) {
                return alumno;
            }

        }

        return null;
    }

    public int cantidadAlumnos() {
        return alumnos.size();
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

}
