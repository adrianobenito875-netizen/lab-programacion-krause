package tp_4_ej6;

public class Main {
    public static void main(String[] args) {

        Colectivo colectivo = new Colectivo(1, 40, 152);
        Tren tren = new Tren(2, 60, 8);

        colectivo.arrancar();
        colectivo.mostrar();
        colectivo.frenar();

        System.out.println();

        tren.arrancar();
        tren.mostrar();
        tren.frenar();
    }
}
