package tp_4_ej5;

public class Menu {
    protected String diaSemana;
    protected double caloriasTotales;

    public Menu(String diaSemana, double caloriasTotales) {
        this.diaSemana = diaSemana;
        setCaloriasTotales(caloriasTotales); 
    }

    public void setCaloriasTotales(double caloriasTotales) {
        if (caloriasTotales >= 0) {
            this.caloriasTotales = caloriasTotales;
        } else {
            System.out.println("Error: las calorías no pueden ser negativas.");
        }
    }

    public void mostrar() {
        System.out.println("Día: " + diaSemana + " | Calorías: " + caloriasTotales);
    }
}