package ej2.tp3;

public class Libro {
		
		private int isbn;
	    private String titulo;

	    public Libro(int isbn, String titulo) {
	        this.isbn = isbn;
	        this.titulo = titulo;
	    }

	    public String getInfo() {
	        return titulo + " - " + isbn;
	    }
	}