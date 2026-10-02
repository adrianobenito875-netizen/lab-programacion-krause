package testbd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Crud {

    public void insertarCincoDatos() {
        String sql = "INSERT INTO vendedores (nombre, apellido, dni, rubro, actual) VALUES (?, ?, ?, ?, ?)";

        String[][] datos = {
            {"Adriano", "Benito", "49376875", "Computación", "true"},
            {"Dylan", "Atanacio", "48933777", "Deporte", "true"},
            {"Valentino", "Veliz", "49509677", "Mecanica", "false"},
            {"Fabrico", "Morales", "49100188", "Gastronomía", "true"},
            {"Joseph", "Morrell", "49911505", "Gaming", "true"}
        };

        try (PreparedStatement ps = ConexionBD.Conectar().prepareStatement(sql)) {
            for (String[] persona : datos) {
                ps.setString(1, persona[0]);
                ps.setString(2, persona[1]);
                ps.setString(3, persona[2]);
                ps.setString(4, persona[3]);
                ps.setBoolean(5, Boolean.parseBoolean(persona[4]));
                ps.executeUpdate();
            }
            System.out.println("5 vendedores insertados correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void borrarIdCuatro() {
        String sql = "DELETE FROM vendedores WHERE id = ?";

        try (PreparedStatement ps = ConexionBD.Conectar().prepareStatement(sql)) {
            ps.setInt(1, 4);
            int filasAfectadas = ps.executeUpdate();
            System.out.println("Vendedor con ID=4 eliminado. Filas afectadas: " + filasAfectadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void actualizarIdDos(String nuevoApellido, String nuevoRubro) {
        String sql = "UPDATE vendedores SET apellido = ?, rubro = ? WHERE id = ?";

        try (PreparedStatement ps = ConexionBD.Conectar().prepareStatement(sql)) {
            ps.setString(1, nuevoApellido);
            ps.setString(2, nuevoRubro);
            ps.setInt(3, 2);
            int filasAfectadas = ps.executeUpdate();
            System.out.println("Vendedor con ID=2 actualizado. Filas afectadas: " + filasAfectadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void listarTodo() {
        String query = "SELECT id, nombre, apellido, dni, rubro, actual FROM vendedores";

        try (PreparedStatement ps = ConexionBD.Conectar().prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("\n--- LISTA DE VENDEDORES ---");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String dni = rs.getString("dni");
                String rubro = rs.getString("rubro");
                boolean actual = rs.getBoolean("actual");

                System.out.println("ID: " + id + " | " + nombre + " " + apellido + 
                                   " | DNI: " + dni + " | Rubro: " + rubro + 
                                   " | Activo: " + actual);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}