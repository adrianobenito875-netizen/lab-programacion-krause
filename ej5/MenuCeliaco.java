package tp_4_ej5;

public class MenuCeliaco extends Menu {
    private boolean certificadoSinTACC;

    public MenuCeliaco(String diaSemana, double caloriasTotales, boolean certificadoSinTACC) {
        super(diaSemana, caloriasTotales);
        this.certificadoSinTACC = certificadoSinTACC;
    }

    public void mostrar() {
        System.out.println("Menú Celíaco:");
        super.mostrar();
        System.out.println("Certificado Sin TACC: " + certificadoSinTACC);
    }}
