package tp_4_ej2;

public class Operario extends Empleado{
    private double valorHoraExtra;

    public Operario(int legajo, double sueldoBase, double valorHoraExtra) {
        super (legajo, sueldoBase);
        this.valorHoraExtra = valorHoraExtra;
    }

		public double getValorHoraExtra() {
			return valorHoraExtra;
		}

		public void setValorHoraExtra(double valorHoraExtra) {
			this.valorHoraExtra = valorHoraExtra;
		}
	    public void mostrar() {
	        System.out.println("Operario:");
	        super.mostrar();
	        System.out.println("Valor hora extra: " + valorHoraExtra);
	    }
	}


