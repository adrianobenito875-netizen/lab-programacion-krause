package ej1.tp3;

public abstract class Herramienta {
	
	protected int codigo;
	protected String marca;
	
	public Herramienta(int codigo, String marca) {
		this.codigo = codigo;
		this.marca = marca;
	}
	public void usar() {
		System.out.println("Herramienta en uso");
	}
	public void devolver() {
		System.out.println("Devolviendo herramienta...");
	}
}
