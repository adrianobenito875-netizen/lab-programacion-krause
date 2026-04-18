package ej4.tp3;
import java.util.*;

class Veterinario {
    private List<Animal> animales;

    public Veterinario() {
        animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal a) {
        animales.add(a);
    }

    public void mostrarAnimales() {
        System.out.println("Animales a cargo:");
        for (Animal a : animales) {
            System.out.println("  " + a.getInfo());
        }
        System.out.println();
    }
}