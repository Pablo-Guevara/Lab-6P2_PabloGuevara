package lab.pkg6p2_pabloguevara;

import java.io.Serializable;

public class Lista implements Serializable{
    private Nodo inicio;
    private int tamDocente = 0;
    private int tamAlumno = 0;
    private int tamClase = 0;
    private int tamProyecto = 0;

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
    
    public int getTamClase() {
        return tamClase;
    }
    
    public int getTamProyecto() {
        return tamProyecto;
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
        tamClase++;
    }
    
    public void AgregarProyecto(Proyecto proyecto) {
        Nodo nuevo = new Nodo(proyecto, null);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamProyecto++;
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
    
    public String nombreUsuarioRetornaAlumno() {
        String nombreUsuarioR;
        nombreUsuarioR = recorrer2.getAlumno().getNombreUsuario();
        return nombreUsuarioR;
    }
    public String contraseñaRetornaAlumno() {
        String contraseñaR;
        contraseñaR = recorrer2.getAlumno().getContraseña();
        return contraseñaR;
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
    //DOCENTE
    public String nombreRetornaDocente() {
        String nombreR;
        nombreR = recorrer2.getDocente().getNombre();
        return nombreR;
    }
    
    public String ApellidoRetornaDocente() {
        String apellidoR;
        apellidoR = recorrer2.getDocente().getApellido();
        return apellidoR;
    }
    
    public String nombreUsuarioRetornaDocente() {
        String nombreUsuarioR;
        nombreUsuarioR = recorrer2.getDocente().getNombreUsuario();
        return nombreUsuarioR;
    }
    public String contraseñaRetornaDocente() {
        String contraseñaR;
        contraseñaR = recorrer2.getDocente().getContraseña();
        return contraseñaR;
    }
    //FIN DOCENTE
    //PROYECTO
    public String tituloRetornaProyecto() {
        String tituloR;
        tituloR = recorrer2.getProyecto().getTitulo();
        return tituloR;
    }
    
    public String descripcionRetornaProyecto() {
        String descripcionR;
        descripcionR = recorrer2.getProyecto().getDescripcion();
        return descripcionR;
    }
    //FIN PROYECTO
    
    public void siguienteEnLista() {
        recorrer2 = recorrer2.getSiguiente();
    }
}
