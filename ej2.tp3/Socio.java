package ej2.tp3;
import java.util.*;

public class Socio {

		private int num_socio;
	    private String nombre;
	    private List<Libro> libros;

	    public Socio(int num_socio, String nombre) {
	    	this.num_socio = num_socio;
	        this.nombre = nombre;
	        this.libros = new ArrayList<>();
	    }

	    public void agregarLibro(Libro libro) {
	        libros.add(libro);
	    }

	    public void mostrarLibros() {
	        System.out.println(num_socio + ". " + nombre);
	        for (Libro l : libros) {
	            System.out.println("  " + l.getInfo());
	        }
	    }
	}