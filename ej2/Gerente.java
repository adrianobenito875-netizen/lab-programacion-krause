package tp_4_ej2;

	public class Gerente extends Empleado {
	    private double bonoResponsabilidad;

	    public Gerente(int legajo, double sueldoBase, double bonoResponsabilidad) {
	        super(legajo, sueldoBase);
	        this.setBonoResponsabilidad(bonoResponsabilidad);
	    }

		public double getBonoResponsabilidad() {
			return bonoResponsabilidad;
		}

		public void setBonoResponsabilidad(double bonoResponsabilidad) {
			this.bonoResponsabilidad = bonoResponsabilidad;
		}
		 public void mostrar() {
		        System.out.println("Gerente:");
		        super.mostrar();
		        System.out.println("Bono: " + bonoResponsabilidad);
		    }
	}

