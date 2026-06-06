package tp7_ej2;

public class Libro {
	private String titulo;
	private String isbn;
	private int cantPag;
	
	public Libro (String titulo, String isbn, int cantPag) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.cantPag = cantPag;
	}
	
	public void mostrar() {
		System.out.println("Título:" + titulo);
		System.out.println("indentificador unico: " + isbn);
		System.out.println("cantidad de paginas: " + cantPag);
		System.out.println("--------------------");
	}

	public void add(Libro libro) {
		
	}
}
