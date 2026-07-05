package ej1.tp8;

public class Seleccion {

    private String nombre;
    private String continente;
    private int puntos;
    private int jugadoresConvocados;
    private String estadoClasificacion;
    private DirectorTecnico directorTecnico;

    public Seleccion(String nombre, String continente, int puntos,
                     int jugadoresConvocados, String estadoClasificacion) {

        this.nombre = nombre;
        this.continente = continente;
        this.puntos = puntos;
        setJugadoresConvocados(jugadoresConvocados);
        this.estadoClasificacion = estadoClasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContinente() {
        return continente;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getJugadoresConvocados() {
        return jugadoresConvocados;
    }

    public String getEstadoClasificacion() {
        return estadoClasificacion;
    }

    public DirectorTecnico getDirectorTecnico() {
        return directorTecnico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setEstadoClasificacion(String estadoClasificacion) {
        this.estadoClasificacion = estadoClasificacion;
    }

    public void setDirectorTecnico(DirectorTecnico directorTecnico) {
        this.directorTecnico = directorTecnico;
    }

    public void setJugadoresConvocados(int jugadoresConvocados) {

        if (jugadoresConvocados < 1 || jugadoresConvocados > 26) {
            throw new IllegalArgumentException(
                    "La cantidad de jugadores debe estar entre 1 y 26.");
        }

        this.jugadoresConvocados = jugadoresConvocados;
    }

    public void disputarPartido() throws JugadoresInsuficientesException {

        if (jugadoresConvocados < 11) {
            throw new JugadoresInsuficientesException(
                    "La selección " + nombre +
                    " no puede disputar el partido porque posee solamente "
                    + jugadoresConvocados + " jugadores habilitados.");
        }

        System.out.println(nombre + " puede disputar el partido.");
    }

    @Override
    public String toString() {
        return "Seleccion{" +
                "nombre='" + nombre + '\'' +
                ", continente='" + continente + '\'' +
                ", puntos=" + puntos +
                ", jugadoresConvocados=" + jugadoresConvocados +
                ", estadoClasificacion='" + estadoClasificacion + '\'' +
                '}';
    }
}
