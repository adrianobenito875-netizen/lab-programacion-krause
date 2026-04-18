package ej1.tp3;

public class Main {

	public static void main(String[] args) {

		HerramientaManual destornillador = new HerramientaManual(1, "Stanley", "Empuñadura de goma");
		HerramientaManual pala = new HerramientaManual(2, "Bellota", "Empuñadura de metal");
		HerramientaManual martillo = new HerramientaManual(3, "Bosch", "Empuñadura de goma");
		HerramientaElectrica taladro = new HerramientaElectrica(1, "DeWalt", 20);
		HerramientaElectrica soldadora = new HerramientaElectrica(2, "Miller", 120);
		
		destornillador.usar();
		destornillador.devolver();
		
		pala.usar();
		pala.devolver();
		
		martillo.usar();
		martillo.devolver();
		
		taladro.conectar();
		taladro.usar();
		taladro.devolver();
		
		soldadora.conectar();
		soldadora.usar();
		soldadora.devolver();
	}
}
