package app;

import java.util.List;

public class Service {

    private final EstudianteDaoImpl dao = new EstudianteDaoImpl();

    public void Registrar(String nombre, String apellido, int dni, String curso) {
        Estudiante nuevo = new Estudiante(nombre, apellido, dni, curso);
        dao.Crear(nuevo);
    }

    public void Actualizar(int id, String nombre, String apellido, int dni, String curso) {
        Estudiante e = dao.ListarPorId(id);
        if (e != null) {
            e.setNombre(nombre);
            e.setApellido(apellido);
            e.setDni(dni);
            e.setCurso(curso);
            dao.Actualizar(e);
        } else {
            System.out.println("No se encontró el estudiante con ID: " + id);
        }
    }

    public void Eliminar(int id) {
        dao.Eliminar(id);
    }

    public Estudiante ListarPorId(int id) {
        return dao.ListarPorId(id);
    }

    public List<Estudiante> ListarTodo() {
        return dao.ListarTodo();
    }
}
