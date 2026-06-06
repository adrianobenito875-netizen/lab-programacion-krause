package tp7_ej2;

import java.util.ArrayList;

public class Biblioteca {
	   private static ArrayList <Libro> libros;

	    public Biblioteca() {
	        libros = new ArrayList<>();
	    }

	    public void agregarLibros(Libro libro) {
	        libros.add(libro);
	    }

	    public void listarLibros() {
	        for (Libro l : libros) {
	            l.mostrar();
	        }
	    }

	    public int cantidadLibros() {
	        return libros.size();
	    }
	}
