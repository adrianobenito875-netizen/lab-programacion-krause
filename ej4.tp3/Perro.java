package ej4.tp3;

class Perro extends Animal {
    public Perro(String nombre, String fechaNacimiento) {
        super(nombre, fechaNacimiento);
    }

    public void metodoLadrar() {
        System.out.println(nombre + " dice: Guau!");
    }
}