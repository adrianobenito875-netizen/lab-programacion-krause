package ej3.tp3;
import java.util.*;

class Vendedor {
    public String nombre;
    public String legajo;
    private List<Vehiculo> vehiculos;

    public Vendedor(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public void mostrarVehiculos() {
        System.out.println(nombre + " (" + legajo + ")");
        for (Vehiculo v : vehiculos) {
            System.out.println("  " + v.getInfo());
        }
        System.out.println();
    }
}