public class Butaca {
    private String id;
    private boolean accesibilidad;
    private boolean disponible;

    // Constructores
    public Butaca() {
        // Constructor por defecto
    }

    public Butaca(String id, boolean accesibilidad, boolean disponible) {
        this.id = id;
        this.accesibilidad = accesibilidad;
        this.disponible = disponible;
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isAccesibilidad() {
        return accesibilidad;
    }

    public void setAccesibilidad(boolean accesibilidad) {
        this.accesibilidad = accesibilidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Métodos
    @Override
    public String toString() {
        return "Información de la Butaca: ID " + id + ", Accesibilidad: " + accesibilidad + ", Disponible: " + disponible;
    }

    public void ocuparButaca() {
        // Lógica para ocupar la butaca
    }

    public void desocuparButaca() {
        // Lógica para desocupar la butaca
    }
}

