package lab.pkg6p2_pabloguevara;

import java.io.Serializable;

public class Alumno extends Usuario implements Serializable{
    private String nombre;
    private String Apellido;
    private int edad;
    private int numRegistro;
    private int ID;
    private String carrera;
    private int añoCarrera;
    private float promedioGraduacion;
    private String facultad;

    public Alumno() {
        super();
    }

    public Alumno(String nombre, String Apellido, int edad, int numRegistro, int ID, String carrera, int añoCarrera, float promedioGraduacion, String facultad) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.numRegistro = numRegistro;
        this.ID = ID;
        this.carrera = carrera;
        this.añoCarrera = añoCarrera;
        this.promedioGraduacion = promedioGraduacion;
        this.facultad = facultad;
    }

    public Alumno(String nombre, String Apellido, int edad, int numRegistro, int ID, String carrera, int añoCarrera, float promedioGraduacion, String facultad, String nombreUsuario, String contraseña) {
        super(nombreUsuario, contraseña);
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.numRegistro = numRegistro;
        this.ID = ID;
        this.carrera = carrera;
        this.añoCarrera = añoCarrera;
        this.promedioGraduacion = promedioGraduacion;
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAñoCarrera() {
        return añoCarrera;
    }

    public void setAñoCarrera(int añoCarrera) {
        this.añoCarrera = añoCarrera;
    }

    public float getPromedioGraduacion() {
        return promedioGraduacion;
    }

    public void setPromedioGraduacion(float promedioGraduacion) {
        this.promedioGraduacion = promedioGraduacion;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    
}
