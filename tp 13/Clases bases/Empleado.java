package empleados;

public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private int dni;
    private String cargo;
    private int salario;
    private boolean activo;

    public Empleado() {}

    public Empleado(int id, String nombre, String apellido, int dni, String cargo, int salario, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cargo = cargo;
        this.salario = salario;
        this.activo = activo;
    }
    public Empleado(String nombre, String apellido, int dni, String cargo, int salario, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cargo = cargo;
        this.salario = salario;
        this.activo = activo;
    }


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getDni() { return dni; }
    public void setDni(int dni) { this.dni = dni; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    
    public int getSalario() {return salario;}
    public void setSalario(int salario) { this.salario = salario; }
    
    public boolean getActivo() {return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }

    @Override
    public String toString() {
        return "Empleado [ID=" + id + ", Nombre=" + nombre + " " + apellido + 
               ", DNI=" + dni + ", Cargo=" + cargo + ", Salario=" + salario +", Activo=" + activo +"]";
    }
}
