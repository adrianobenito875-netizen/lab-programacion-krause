package empleados;

public class EmpleadoNoEncontradoException extends Exception{
	public EmpleadoNoEncontradoException(){
		super("Empleado no encontrado");
	}
	public EmpleadoNoEncontradoException (String mensaje) {
		super(mensaje);
	}
}
