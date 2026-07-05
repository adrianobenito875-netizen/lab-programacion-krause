package ej1.tp8;

public class DirectorTecnico {

    private String nombre;
    private int edad;
    private String nacionalidad;

    public DirectorTecnico(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Director Tecnico" +
                "\nNombre: " + nombre +
                "\nEdad: " + edad +
                "\nNacionalidad: " + nacionalidad;
    }
}