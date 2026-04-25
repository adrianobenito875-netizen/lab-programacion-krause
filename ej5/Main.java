package tp_4_ej5;

public class Main {

    public static void main(String[] args) {

        MenuVegano vegano = new MenuVegano("Lunes", 1200, 50);
        MenuCeliaco celiaco = new MenuCeliaco("Martes", 900, true);

        Menu menuError = new Menu("Miércoles", -500);

        Cocinero cocinero = new Cocinero("Juan");

        cocinero.agregarMenu(vegano);
        cocinero.agregarMenu(celiaco);

        cocinero.mostrar();
    }
}
