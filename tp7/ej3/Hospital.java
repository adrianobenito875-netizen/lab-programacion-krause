package tp7_ej3;

import java.util.ArrayList;

public class Hospital {
	private static ArrayList <Paciente> pacientes;
	
	public Hospital(){
		pacientes= new ArrayList<>();
	}
	
	public  void agregarPacientes(Paciente paciente) {
		pacientes.add(paciente);
	}
	public void listarPacientes() {
		for (Paciente p : pacientes) {
			p.mostrar();
			}
	}
	public int cantPacientes() {
		return pacientes.size();
	}
}
