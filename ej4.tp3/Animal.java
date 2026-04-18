package ej4.tp3;

class Animal {
    protected String nombre;
    protected String fechaNacimiento;

    public Animal(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getInfo() {
        return nombre + " (" + fechaNacimiento + ")";
    }
}