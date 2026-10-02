package empleados;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmpleadoService service = new EmpleadoService();

        System.out.println("=== PRUEBAS DE REGISTRO VÁLIDO ===");
        try {
            service.Registrar("Adriano", "Quintana", 40123456, "Desarrollador", 150000);
            service.Registrar("Fabricio", "Kim", 39003084, "Analista", 80000);
        } catch (Exception e) {
            System.out.println("Error al registrar: " + e.getMessage());
        }

        System.out.println("\n=== PRUEBA 1: DNI Inválido ===");
        try {
            service.Registrar("Carlitos", "Tebeez", 1234, "Desarrollador", 100000);
        } catch (Exception e) {
            System.out.println("Error capturado: " + e.getMessage());
        }

        System.out.println("\n=== PRUEBA 2: DNI Duplicado ===");
        try {
            service.Registrar("Monica", "Cagalindo", 40123456, "Soporte", 90000);
        } catch (Exception e) {
            System.out.println("Error capturado: " + e.getMessage());
        }

        System.out.println("\n=== PRUEBA 3: Salario Inválido ===");
        try {
            service.Registrar("Pablo", "Gómez", 41222333, "Guardia", -500);
        } catch (Exception e) {
            System.out.println("Error capturado: " + e.getMessage());
        }

        System.out.println("\n=== PRUEBA 4: Cargo Inválido ===");
        try {
            service.Registrar("Martin", "Díaz", 42333444, "Jerente", 90000);
        } catch (Exception e) {
            System.out.println("Error capturado: " + e.getMessage());
        }

        System.out.println("\n=== PRUEBA 5: Actualizar ID Inexistente ===");
        try {
            service.Actualizar(999, "Roberto", "García", 45666777, "Analista", 120000);
        } catch (Exception e) {
            System.out.println("Error capturado: " + e.getMessage());
        }

        System.out.println("\n=== PRUEBA 6: Eliminar dos veces al mismo empleado ===");
        try {
            service.Eliminar(1); 
            System.out.println("Primera eliminación realizada.");
            service.Eliminar(1); 
        } catch (Exception e) {
            System.out.println("Error capturado: " + e.getMessage());
        }

        System.out.println("\n=== PRUEBA 7: Listar Por ID Inexistente ===");
        try {
            Empleado e = service.ListarPorId(999);
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Error capturado: " + e.getMessage());
        }

        System.out.println("\n=== LISTA FINAL DE EMPLEADOS ACTIVOS ===");
        mostrarLista(service.ListarTodo());
    }

    private static void mostrarLista(List<Empleado> empleados) {
        for (Empleado e : empleados) {
            System.out.println(e);
        }
    }
}