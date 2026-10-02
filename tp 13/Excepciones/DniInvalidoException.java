package empleados;
	public class DniInvalidoException extends Exception {
	    public DniInvalidoException() {
	        super("El DNI ingresado es inválido");
	    }

	   
	    public DniInvalidoException(String mensaje) {
	        super(mensaje);
	    }
	}

