package ej4.tp3;

class Gato extends Animal {
    public Gato(String nombre, String fechaNacimiento) {
        super(nombre, fechaNacimiento);
    }

    public void metodoMaullar() {
        System.out.println(nombre + " dice: Miau!");
    }
}