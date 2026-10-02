package app;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDaoImpl {

    public Connection ConexionBD() throws SQLException {
        return ConexionBD.Conectar();
    }

    public void Crear(Estudiante e) {
        String sql = "INSERT INTO estudiantes (nombre, apellido, dni, curso) VALUES (?, ?, ?, ?)";
        try (Connection con = ConexionBD();
        		PreparedStatement ps = ConexionBD.Conectar().prepareStatement(sql)) {
            
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getDni());
            ps.setString(4, e.getCurso());
            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    e.setId(rs.getInt(1));
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al crear estudiante: " + ex.getMessage());
        }
    }

    public void Actualizar(Estudiante e) {
        String sql = "UPDATE estudiantes SET nombre = ?, apellido = ?, dni = ?, curso = ? WHERE id = ?";
        try (Connection con = ConexionBD();
        		PreparedStatement ps = ConexionBD.Conectar().prepareStatement(sql)) {
            
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getDni());
            ps.setString(4, e.getCurso());
            ps.setInt(5, e.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Error al actualizar estudiante: " + ex.getMessage());
        }
    }

    public void Eliminar(int id) {
        String sql = "DELETE FROM estudiantes WHERE id = ?";
        try (Connection con = ConexionBD();
        		PreparedStatement ps = ConexionBD.Conectar().prepareStatement(sql)) {
            
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Error al eliminar estudiante: " + ex.getMessage());
        }
    }

    public Estudiante ListarPorId(int id) {
        String sql = "SELECT * FROM estudiantes WHERE id = ?";
        try (Connection con = ConexionBD();
        		PreparedStatement ps = ConexionBD.Conectar().prepareStatement(sql)) {
            
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Estudiante(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("dni"),
                        rs.getString("curso")
                    );
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al buscar estudiante: " + ex.getMessage());
        }
        return null;
    }

    public List<Estudiante> ListarTodo() {
        List<Estudiante> lista = new ArrayList<>();
        String sql = "SELECT * FROM estudiantes";
        try (Connection con = ConexionBD();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            
            while (rs.next()) {
                lista.add(new Estudiante(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getInt("dni"),
                    rs.getString("curso")
                ));
            }
        } catch (SQLException ex) {
            System.err.println("Error al listar estudiantes: " + ex.getMessage());
        }
        return lista;
    }
}
