package empleados;

public class EmpleadoYaInactivoException extends Exception{
	public EmpleadoYaInactivoException() {
		super("El empleado no se encuentra activo");
	}
	
	public EmpleadoYaInactivoException(String mensaje) {
		super(mensaje);
	}

}
