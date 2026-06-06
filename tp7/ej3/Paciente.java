package tp7_ej3;

public class Paciente {
	private String nom;
	private String dni;
	private int edad;
	private double peso;
	private boolean estHospi;
	
	public Paciente (String nom, String dni, int edad, double peso, boolean estHospi) {
		this.nom = nom;
		this.dni = dni;
		this.edad = edad;
		this.peso = peso ;
		this.estHospi = estHospi;
	}
	
    public void mostrar() {
        System.out.println("Nombre: " + nom);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Hospitalizado: " + estHospi);
        System.out.println("------------------------");
    } 
}
