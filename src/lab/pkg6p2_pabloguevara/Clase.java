package lab.pkg6p2_pabloguevara;

public class Clase {
    private String nombre;
    private String seccion;
    private String código;
    private String codigoCarrera;
    private int cantMaxAlumnos;
    private int NumeroAula; 

    public Clase(String nombre, String seccion, String código, String codigoCarrera, int cantMaxAlumnos, int NumeroAula) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.código = código;
        this.codigoCarrera = codigoCarrera;
        this.cantMaxAlumnos = cantMaxAlumnos;
        this.NumeroAula = NumeroAula;
    }

    public Clase() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }

    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public int getCantMaxAlumnos() {
        return cantMaxAlumnos;
    }

    public void setCantMaxAlumnos(int cantMaxAlumnos) {
        this.cantMaxAlumnos = cantMaxAlumnos;
    }

    public int getNumeroAula() {
        return NumeroAula;
    }

    public void setNumeroAula(int NumeroAula) {
        this.NumeroAula = NumeroAula;
    }
    
    
}
