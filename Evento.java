public class Evento {
    private String nombre;
    private String invitado;
    private Sala sala;
    private String fecha;
    private String hora;
    private double precio;
    private String tipoEvento;
    private int numAsistentesMaximo;
    private java.util.List<String> asistentes;  // Usando el nombre completo

    // Constructores
    public Evento() {
        // Constructor por defecto
    }

    public Evento(String nombre, String invitado, Sala sala, String fecha, String hora, double precio,
                  String tipoEvento, int numAsistentesMaximo, java.util.List<String> asistentes) {
        this.nombre = nombre;
        this.invitado = invitado;
        this.sala = sala;
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
        this.tipoEvento = tipoEvento;
        this.numAsistentesMaximo = numAsistentesMaximo;
        this.asistentes = asistentes;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInvitado() {
        return invitado;
    }

    public void setInvitado(String invitado) {
        this.invitado = invitado;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNumAsistentesMaximo() {
        return numAsistentesMaximo;
    }

    public void setNumAsistentesMaximo(int numAsistentesMaximo) {
        this.numAsistentesMaximo = numAsistentesMaximo;
    }

    public java.util.List<String> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(java.util.List<String> asistentes) {
        this.asistentes = asistentes;
    }

    // Otros métodos
    public void agregarAsistente(String asistente) {
        if (asistentes == null) {
            asistentes = new java.util.ArrayList<>();
        }
        asistentes.add(asistente);
    }

    public boolean estaLleno() {
        return asistentes != null && asistentes.size() >= numAsistentesMaximo;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nombre='" + nombre + '\'' +
                ", invitado='" + invitado + '\'' +
                ", sala=" + sala +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", precio=" + precio +
                ", tipoEvento='" + tipoEvento + '\'' +
                ", numAsistentesMaximo=" + numAsistentesMaximo +
                ", asistentes=" + asistentes +
                '}';
    }
}
