package tp_4_ej4;

public class Playlist {
    private String nombre;
    private String genero;
    private Cancion[] canciones;
    private int contador;

    public Playlist(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
        this.canciones = new Cancion[10];
        this.contador = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void agregarCancion(Cancion c) {
        canciones[contador] = c;
        contador++;
    }

    public void mostrar() {
        System.out.println("Playlist: " + nombre + " | Género: " + genero);
        System.out.println("Canciones:");

        for (int i = 0; i < contador; i++) {
            canciones[i].mostrar();
        }
    }
}
