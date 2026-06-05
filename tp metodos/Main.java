package tp_metodos; 

public class Main {
	public static void main(String[] args) {

	        Curso curso = new Curso("5°2°");

	        Estudiante est1 = new Estudiante("Juan", "12345678", 8.5);
	        Estudiante est2 = new Estudiante("María", "23456789", 9.2);
	        Estudiante est3 = new Estudiante("Pedro", "34567890", 7.8);

	        curso.inscribir(est1);
	        curso.inscribir(est2);
	        curso.inscribir(est3);

	        System.out.println("Cantidad de alumnos: " + curso.cantidadAlumnos());

	        curso.darDeBaja(1);

	        System.out.println("\nAlumnos restantes:");
	        curso.listarAlumnos();}
	}