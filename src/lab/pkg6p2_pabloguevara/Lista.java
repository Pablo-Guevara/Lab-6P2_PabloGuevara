package lab.pkg6p2_pabloguevara;

public class Lista {
    private Nodo inicio;
    private int tam = 0;

    public Lista() {
    }

    public Lista(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public int getTam() {
        return tam;
    }
       
    public void Agregar(Docente docente) {
        Nodo nuevo = new Nodo(docente, null);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tam++;
    }
}
