package ej1.tp8;

import java.util.ArrayList;

public class Mundial {

    private ArrayList<Seleccion> selecciones;

    public Mundial() {
        selecciones = new ArrayList<>();
    }

    public void agregarSeleccion(Seleccion seleccion) {
        selecciones.add(seleccion);
    }

    public void mostrarSelecciones() {

        for (Seleccion seleccion : selecciones) {
            System.out.println(seleccion);
            System.out.println("-------------------------");
        }
    }

    public Seleccion consultarSeleccion(int posicion) {

        return selecciones.get(posicion);
    }

    public void actualizarPuntos(int posicion, int puntos) {

        Seleccion seleccion = selecciones.get(posicion);
        seleccion.setPuntos(puntos);
    }

    public DirectorTecnico consultarDirectorTecnico(int posicion) {

        Seleccion seleccion = selecciones.get(posicion);
        return seleccion.getDirectorTecnico();
    }

    public Seleccion buscarSeleccion(String nombre) {

        for (Seleccion seleccion : selecciones) {

            if (seleccion.getNombre().equalsIgnoreCase(nombre)) {
                return seleccion;
            }
        }

        return null;
    }

    public int cantidadSelecciones() {
        return selecciones.size();
    }

    public ArrayList<Seleccion> getSelecciones() {
        return selecciones;
    }
}