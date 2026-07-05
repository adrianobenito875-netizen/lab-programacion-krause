package ej2.tp8;

public class Tutor {

    private String nombre;
    private String telefono;
    private String parentesco;

    public Tutor(String nombre, String telefono, String parentesco) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.parentesco = parentesco;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public String toString() {
        return "Tutor" +
                "\nNombre: " + nombre +
                "\nTeléfono: " + telefono +
                "\nParentesco: " + parentesco;
    }
}
