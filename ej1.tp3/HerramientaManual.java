package ej1.tp3;

public class HerramientaManual extends Herramienta{

	private String tipoEmpuñadura;
	
	public HerramientaManual(int codigo, String marca, String tipoEmpuñadura) {
		super(codigo, marca);
		this.tipoEmpuñadura = tipoEmpuñadura;
	}
	public String getTipoEmpuñadura() {
		return tipoEmpuñadura;
	}
	public void setTipoEmpuñadura(String tipoEmpuñadura) {
		this.tipoEmpuñadura = tipoEmpuñadura;
	}
}
