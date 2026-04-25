package tp_4_ej4;

public class Main {
    public static void main(String[] args) {

        Cancion c1 = new Cancion("Bohemian Rhapsody", 5.55);
        Cancion c2 = new Cancion("Imagine", 3.05);
        Cancion c3 = new Cancion("Hotel California", 6.30);

        Playlist playlist = new Playlist("Éxitos", "Rock");

        playlist.agregarCancion(c1);
        playlist.agregarCancion(c2);
        playlist.agregarCancion(c3);

        playlist.mostrar();

        System.out.println("\nEliminando la playlist...");
        playlist = null;

        System.out.println("Las canciones siguen existiendo:");
        c1.mostrar();
        c2.mostrar();
        c3.mostrar();
    }
}
