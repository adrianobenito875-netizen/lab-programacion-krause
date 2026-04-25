package tp_4_ej2;

public class Main {
	    public static void main(String[] args) {

	        Gerente gerente1 = new Gerente(101, 200000, 50000);

	        Operario operario1 = new Operario(102, 100000, 2000);

	        gerente1.mostrar();
	        System.out.println();
	        operario1.mostrar();
	    }
	}
