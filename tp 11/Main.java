package testbd;

public class Main {
    public static void main(String[] args) {
        Crud crud = new Crud();

        crud.insertarCincoDatos();
        crud.borrarIdCuatro();
        crud.actualizarIdDos("Fernández", "Calzado");
        crud.listarTodo();
    }
}