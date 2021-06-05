package lab.pkg6p2_pabloguevara;

import java.io.Serializable;

public class Docente extends Usuario implements Serializable {

    private String nombre;
    private String apellido;
    private int numeroRegistro;
    private String tituloUniversitario;
    private String tituloPostgrado;
    private int cantVecesImpartClase;
    private String facultad;

    public Docente() {
        super();
    }

    public Docente(String nombre, String apellido, int numeroRegistro, String tituloUniversitario, String tituloPostgrado, int cantVecesImpartClase, String facultad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroRegistro = numeroRegistro;
        this.tituloUniversitario = tituloUniversitario;
        this.tituloPostgrado = tituloPostgrado;
        this.cantVecesImpartClase = cantVecesImpartClase;
        this.facultad = facultad;
    }

    public Docente(String nombreUsuario, String contraseña) {
        super(nombreUsuario, contraseña);
    }

    public Docente(String nombre, String apellido, int numeroRegistro, String tituloUniversitario, String tituloPostgrado, int cantVecesImpartClase, String facultad, String nombreUsuario, String contraseña) {
        super(nombreUsuario, contraseña);
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroRegistro = numeroRegistro;
        this.tituloUniversitario = tituloUniversitario;
        this.tituloPostgrado = tituloPostgrado;
        this.cantVecesImpartClase = cantVecesImpartClase;
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getTituloUniversitario() {
        return tituloUniversitario;
    }

    public void setTituloUniversitario(String tituloUniversitario) {
        this.tituloUniversitario = tituloUniversitario;
    }

    public String getTituloPostgrado() {
        return tituloPostgrado;
    }

    public void setTituloPostgrado(String tituloPostgrado) {
        this.tituloPostgrado = tituloPostgrado;
    }

    public int getCantVecesImpartClase() {
        return cantVecesImpartClase;
    }

    public void setCantVecesImpartClase(int cantVecesImpartClase) {
        this.cantVecesImpartClase = cantVecesImpartClase;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

}
