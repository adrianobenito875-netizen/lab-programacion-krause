package tp_4_ej2;

public class Empleado {
    protected int legajo;
    protected double sueldoBase;

    public Empleado(int legajo, double sueldoBase) {
        this.legajo = legajo;
        this.sueldoBase = sueldoBase;
    }
    public void mostrar() {
        System.out.println("Legajo: " + legajo + " | Sueldo base: " + sueldoBase);
    }
}
