package tp7_ej4;

public class Jugador {
	private String nomC;
	private String posicion;
	private int edad;
	private String equipoAct;
	private boolean convocado;
	
	public Jugador(String nomC, String posicion, int edad, String equipoAct, boolean convocado) {
		this.nomC = nomC;
		this.posicion = posicion;
		this.edad = edad;
		this.equipoAct = equipoAct;
		this.convocado = convocado;
	}
	
	public String getNombreCompleto() {
        return nomC;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nomC = nombreCompleto;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEquipo() {
        return equipoAct;
    }

    public void setEquipo(String equipo) {
        this.equipoAct = equipo;
    }

    public boolean isConvocado() {
        return convocado;
    }

    public void setConvocado(boolean convocado) {
        this.convocado = convocado;
    }

    @Override
    public String toString() {
        return nomC + " - " + posicion + " - " + edad +
               " años - " + equipoAct + " - Convocado: " + convocado;
    }
}