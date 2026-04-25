package tp_4_ej3;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro(1, 1000, "Autor X");
        ArticuloPapeleria art1 = new ArticuloPapeleria(2, 500, "Plástico");

        libro1.mostrar();
        System.out.println();
        art1.mostrar();
    }
}
