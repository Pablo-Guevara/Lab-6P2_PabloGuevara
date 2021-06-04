package lab.pkg6p2_pabloguevara;

public class Lista {
    private Nodo inicio;
    private int tamDocente = 0;
    private int tamAlumno = 0;

    public Lista() {
    }

    public Lista(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public int getTamDocente() {
        return tamDocente;
    }
    
    public int getTamAlumno() {
        return tamAlumno;
    }
       
    public void AgregarDocente(Docente docente) {
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
        tamDocente++;
    }
    
    public void AgregarAlumno(Alumno alumno) {
        Nodo nuevo = new Nodo(alumno, null);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamAlumno++;
    }
    
    public void AgregarClase(Clase clase) {
        Nodo nuevo = new Nodo(clase, null);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamAlumno++;
    }
    
    Nodo recorrer2;

    public void asignarNodo() {
        recorrer2 = inicio;
    }
    //ALUMNO
    public String nombreRetornaAlumno() {
        String nombreR;
        nombreR = recorrer2.getAlumno().getNombre();
        return nombreR;
    }
    
    public String apellidoRetornoAlumno() {
        String apellidoR;
        apellidoR = recorrer2.getAlumno().getApellido();
        return apellidoR;
    }
    //FIN ALUMNO
    //CLASE
    public String nombreRetornaClase() {
        String nombreR;
        nombreR = recorrer2.getClase().getNombre();
        return nombreR;
    }
    
    public String seccionRetornaClase() {
        String seccionR;
        seccionR = recorrer2.getClase().getSeccion();
        return seccionR;
    }
    //FIN CLASE
    
    public void siguienteEnLista() {
        recorrer2 = recorrer2.getSiguiente();
    }
}
