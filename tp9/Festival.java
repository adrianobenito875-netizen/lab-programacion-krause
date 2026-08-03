package tp_9;

public class Festival {
	
	    public void realizarSoundcheck(Cantante cantante) throws EspectaculoCortoException {

	        if (cantante.getCanciones() < 5) {
	            throw new EspectaculoCortoException(
	                    cantante.getNombre() + " tiene menos de 5 canciones."
	            );
	        }

	        System.out.println("Soundcheck aprobado para " + cantante.getNombre());
	    }
}
