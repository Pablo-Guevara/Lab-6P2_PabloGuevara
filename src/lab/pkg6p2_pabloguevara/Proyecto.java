package lab.pkg6p2_pabloguevara;

public class Proyecto {

    private String titulo;
    private String descripcion;
    private float puntuacion;
    private String tiempoDuracion;
    private int cantMaxParticipantes;
    private String FechaEntrega;

    public Proyecto() {
    }

    public Proyecto(String titulo, String descripcion, float puntuacion, String tiempoDuracion, int cantMaxParticipantes, String FechaEntrega) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.puntuacion = puntuacion;
        this.tiempoDuracion = tiempoDuracion;
        this.cantMaxParticipantes = cantMaxParticipantes;
        this.FechaEntrega = FechaEntrega;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getTiempoDuracion() {
        return tiempoDuracion;
    }

    public void setTiempoDuracion(String tiempoDuracion) {
        this.tiempoDuracion = tiempoDuracion;
    }

    public int getCantMaxParticipantes() {
        return cantMaxParticipantes;
    }

    public void setCantMaxParticipantes(int cantMaxParticipantes) {
        this.cantMaxParticipantes = cantMaxParticipantes;
    }

    public String getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(String FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }

    
}
