package empleados;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDaoImpl {

    public Connection ConexionBD() throws SQLException {
        return ConexionBD.Conectar();
    }

    public void Crear(Empleado e) {
        String sql = "INSERT INTO empleados (nombre, apellido, dni, cargo, salario, activo) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection con = ConexionBD();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getDni());
            ps.setString(4, e.getCargo());
            ps.setInt(5, e.getSalario());
            ps.setBoolean(6, e.getActivo());
            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    e.setId(rs.getInt(1));
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al crear empleado: " + ex.getMessage());
        }
    }

    public void Actualizar(Empleado e) {
        String sql = "UPDATE empleados SET nombre = ?, apellido = ?, dni = ?, cargo = ?, salario = ?, activo = ? WHERE id = ?";
        try (Connection con = ConexionBD();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getDni());
            ps.setString(4, e.getCargo());
            ps.setInt(5, e.getSalario());
            ps.setBoolean(6, e.getActivo());
            ps.setInt(7, e.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Error al actualizar empleado: " + ex.getMessage());
        }
    }

    public void Eliminar(int id) {
        // Baja lógica: actualiza activo = false
        String sql = "UPDATE empleados SET activo = false WHERE id = ?";
        try (Connection con = ConexionBD();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Error al eliminar empleado: " + ex.getMessage());
        }
    }

    public Empleado ListarPorId(int id) {
        String sql = "SELECT * FROM empleados WHERE id = ?";
        try (Connection con = ConexionBD();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Empleado(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("dni"),
                        rs.getString("cargo"),
                        rs.getInt("salario"),
                        rs.getBoolean("activo")
                   );
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al buscar empleado: " + ex.getMessage());
        }
        return null;
    }

    public List<Empleado> ListarTodo() {
        List<Empleado> lista = new ArrayList<>();
        // Solo empleados con activo = true
        String sql = "SELECT * FROM empleados WHERE activo = true";
        try (Connection con = ConexionBD();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            
            while (rs.next()) {
                lista.add(new Empleado(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getInt("dni"),
                    rs.getString("cargo"),
                    rs.getInt("salario"),
                    rs.getBoolean("activo")
                ));
            }
        } catch (SQLException ex) {
            System.err.println("Error al listar empleados: " + ex.getMessage());
        }
        return lista;
    }

    public Empleado BuscarPorDni(int dni) {
        String sql = "SELECT * FROM empleados WHERE dni = ?";
        try (Connection con = ConexionBD();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setInt(1, dni);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Empleado(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("dni"),
                        rs.getString("cargo"),
                        rs.getInt("salario"),
                        rs.getBoolean("activo")
                    );
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al buscar por DNI: " + ex.getMessage());
        }
        return null;
    }
}
