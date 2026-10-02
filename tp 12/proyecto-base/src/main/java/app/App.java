package app;
import java.util.List;
public class App {
	    public static void main(String[] args) {
	        Service service = new Service();

	      
	        service.Registrar("Adriano", "Benito", 49376875, "5to 2");
	        service.Registrar("Dylan", "Atanacio", 41222333, "5to 2");
	        service.Registrar("Joey", "Morrell", 42333444, "6to 1");
	        service.Registrar("Sasha", "Cabrera", 43444555, "6to 1");
	        service.Registrar("Eric", "Quintana", 44555666, "5to 2");
	        service.Registrar("Alex", "Torres", 45666777, "5to 2");
	        service.Registrar("Junior", "Lavado", 46777888, "6to 1");
	        service.Registrar("Lisandro", "Sadañoski", 47888999, "6to 1");
	        service.Registrar("Juan", "Suares", 48999000, "5to 2");
	        service.Registrar("Facundo", "Villafañes", 49000111, "5to 2");

	        System.out.println("\n--- Lista Inicial de Estudiantes ---");
	        mostrarLista(service.ListarTodo());

	        System.out.println("\n--- Eliminando estudiante con ID = 4 ---");
	        service.Eliminar(4);

	        System.out.println("\n--- Actualizando estudiante con ID = 6 ---");
	        service.Actualizar(6, "Alice", "Torres", 45666777, "6to 1");

	        System.out.println("\n--- Actualizando estudiante con ID = 8 ---");
	        service.Actualizar(8, "Morena", "Aguilar", 47888900, "6to 1");

	        System.out.println("\n--- Lista Final de Estudiantes ---");
	        mostrarLista(service.ListarTodo());
	    }

	    private static void mostrarLista(List<Estudiante> estudiantes) {
	        for (Estudiante e : estudiantes) {
	            System.out.println(e);
	        }
	    }
	}
