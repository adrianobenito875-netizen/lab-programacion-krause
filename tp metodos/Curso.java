package tp_metodos;

import java.util.ArrayList;

public class Curso {
    private String nom;
    private ArrayList<Estudiante> alumnos;

    public Curso(String nombre) {
        this.nom = nombre;
        alumnos = new ArrayList<>();
    }

    public void inscribir(Estudiante est) {
        alumnos.add(est);
    }

    public void darDeBaja(int indice) {
        alumnos.remove(indice);
    }

    public void listarAlumnos() {
        for (Estudiante est : alumnos) {
            est.mostrarFicha();
        }
    }

    public int cantidadAlumnos() {
        return alumnos.size();
    }
}