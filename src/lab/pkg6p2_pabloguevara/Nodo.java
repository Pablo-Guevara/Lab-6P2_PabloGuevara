package lab.pkg6p2_pabloguevara;

public class Nodo {
    private Docente docente;
    private Nodo siguiente;

    public Nodo() {
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
    
    
}
