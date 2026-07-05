package ej2.tp8;

public class Alumno {

    private String dni;
    private String nombreApellido;
    private String curso;
    private int inasistencias;
    private String estadoAcademico;
    private Tutor tutor;

    public Alumno(String dni, String nombreApellido, String curso,
                  int inasistencias, String estadoAcademico) {

        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.curso = curso;
        setInasistencias(inasistencias);
        this.estadoAcademico = estadoAcademico;
    }

    public String getDni() {
        return dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public String getCurso() {
        return curso;
    }

    public int getInasistencias() {
        return inasistencias;
    }

    public String getEstadoAcademico() {
        return estadoAcademico;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setEstadoAcademico(String estadoAcademico) {
        this.estadoAcademico = estadoAcademico;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public void setInasistencias(int inasistencias) {

        if (inasistencias < 0) {
            throw new IllegalArgumentException(
                    "La cantidad de inasistencias no puede ser negativa.");
        }

        this.inasistencias = inasistencias;
    }

    public void agregarInasistencias(int cantidad) {

        setInasistencias(this.inasistencias + cantidad);
    }

    public void realizarOperacionEspecial() throws AlumnoLibreException {

        if (inasistencias > 20) {
            throw new AlumnoLibreException(
                    "El alumno " + nombreApellido +
                    " quedó libre por superar el límite de inasistencias.");
        }

        System.out.println(nombreApellido + " puede realizar la operación académica.");
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "dni='" + dni + '\'' +
                ", nombreApellido='" + nombreApellido + '\'' +
                ", curso='" + curso + '\'' +
                ", inasistencias=" + inasistencias +
                ", estadoAcademico='" + estadoAcademico + '\'' +
                '}';
    }
}
