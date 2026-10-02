package empleados;

public class CargoInvalidoException extends Exception  {
	public CargoInvalidoException(){
		super("Cargo invalido");
	}
	public CargoInvalidoException (String mensaje) {
		super (mensaje);
	}
}
