package empleados;

public class SalarioInvalidoException extends Exception{
	public SalarioInvalidoException() {
		super("El salario es invalido");
			
	}
	public SalarioInvalidoException (String mensaje) {
		super (mensaje);
	}
}


