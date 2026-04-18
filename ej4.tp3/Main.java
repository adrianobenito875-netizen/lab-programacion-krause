package ej4.tp3;

public class Main {
    public static void main(String[] args) {

        Animal a1 = new Perro("Firulais", "01/01/2020");
        Animal a2 = new Gato("Michi", "02/02/2021");
        Animal a3 = new Perro("Rex", "03/03/2019");
        Animal a4 = new Gato("Luna", "04/04/2022");
        Animal a5 = new Perro("Max", "05/05/2020");
        Animal a6 = new Gato("Nina", "06/06/2021");
        Animal a7 = new Perro("Rocky", "07/07/2018");

        Veterinario v1 = new Veterinario();
        Veterinario v2 = new Veterinario();
        Veterinario v3 = new Veterinario();

        v1.agregarAnimal(a1);
        v1.agregarAnimal(a2);
        v1.agregarAnimal(a3);

        v2.agregarAnimal(a1);
        v2.agregarAnimal(a4);
        v2.agregarAnimal(a5);

        v3.agregarAnimal(a1);
        v3.agregarAnimal(a6);
        v3.agregarAnimal(a7);

        System.out.println("Veterinario 1:");
        v1.mostrarAnimales();

        System.out.println("Veterinario 2:");
        v2.mostrarAnimales();
        
        System.out.println("Veterinario 3:");
        v3.mostrarAnimales();
    }
}