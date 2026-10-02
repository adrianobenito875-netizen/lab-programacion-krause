package empleados;

public class DniDuplicadoException extends Exception {
    public DniDuplicadoException() {    
	super("El DNI ingresado es duplicado");
    }
    public DniDuplicadoException (String mensaje) {
        super(mensaje);
    }
}
