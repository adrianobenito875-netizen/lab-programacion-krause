package ej1.tp3;

public class HerramientaElectrica extends Herramienta {
	
	private int voltaje;
	
	public HerramientaElectrica(int codigo, String marca, int voltaje) {
		super(codigo, marca);
		this.voltaje = voltaje;
	}
	public void conectar() {
		System.out.println("La herramienta de " + codigo + ". Se esta conectando a " + voltaje + "V");
	}
	
	public int getVoltaje() {
		return voltaje;
	}
	public void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}
}
