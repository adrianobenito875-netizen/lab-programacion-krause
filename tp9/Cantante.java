package tp_9;

public class Cantante implements Contratable{

	    private String nombre;
	    private String genero;
	    private int cachet;
	    private int canciones;
	    private String manager;
	    private String escenario;

	    public Cantante(String nombre, String genero, int cachet, int canciones, String manager) {
	        this.nombre = nombre;
	        this.setGenero(genero);
	        this.cachet = cachet;
	        this.canciones = canciones;
	        this.manager = manager;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getCanciones() {
	        return canciones;
	    }

	    public String getManager() {
	        return manager;
	    }

	    @Override
	    public void liquidHonorarios(double impuestos) {

	        if (impuestos < 0 || impuestos > 100) {
	            throw new IllegalArgumentException("Porcentaje de impuestos inválido.");
	        }

	        double neto = cachet - (cachet * impuestos / 100);

	        System.out.println("Honorarios de " + nombre + ": $" + neto);
	    }

	    @Override
	    public void asignarEscenarios(String nomEscenario) {

	        if (nomEscenario == null) {
	            throw new NullPointerException("El escenario no puede ser nulo.");
	        }

	        escenario = nomEscenario;

	        System.out.println(nombre + " fue asignado al escenario " + escenario);
	    }

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

	}
