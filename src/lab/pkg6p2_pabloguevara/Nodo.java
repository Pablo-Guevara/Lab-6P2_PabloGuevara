package lab.pkg6p2_pabloguevara;

public class Nodo {
    private Docente docente;
    private Alumno alumno;
    private Clase clase;
    private Nodo siguiente;

    public Nodo() {
    }

    public Nodo(Clase clase, Nodo siguiente) {
        this.clase = clase;
        this.siguiente = siguiente;
    }

    
    
    public Nodo(Alumno alumno, Nodo siguiente) {
        this.alumno = alumno;
        this.siguiente = siguiente;
    }

    public Nodo(Docente docente, Nodo siguiente) {
        this.docente = docente;
        this.siguiente = siguiente;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }
}
