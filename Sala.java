public class Sala {
    private String nombre;
    private int capacidadMaxima;
    private double dimensionMetrosCuadrados;
    private boolean accesibilidad;
    private String caracteristicasAcusticas;
    private String observaciones;

    // Constructores
    public Sala() {
        // Constructor por defecto
    }

    public Sala(String nombre, int capacidadMaxima, double dimensionMetrosCuadrados, boolean accesibilidad,
                String caracteristicasAcusticas, String observaciones) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.dimensionMetrosCuadrados = dimensionMetrosCuadrados;
        this.accesibilidad = accesibilidad;
        this.caracteristicasAcusticas = caracteristicasAcusticas;
        this.observaciones = observaciones;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getDimensionMetrosCuadrados() {
        return dimensionMetrosCuadrados;
    }

    public void setDimensionMetrosCuadrados(double dimensionMetrosCuadrados) {
        this.dimensionMetrosCuadrados = dimensionMetrosCuadrados;
    }

    public boolean isAccesibilidad() {
        return accesibilidad;
    }

    public void setAccesibilidad(boolean accesibilidad) {
        this.accesibilidad = accesibilidad;
    }

    public String getCaracteristicasAcusticas() {
        return caracteristicasAcusticas;
    }

    public void setCaracteristicasAcusticas(String caracteristicasAcusticas) {
        this.caracteristicasAcusticas = caracteristicasAcusticas;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    // Métodos
    public boolean comprobarCapacidad(int numAsistentes) {
        return numAsistentes <= capacidadMaxima;
    }
}

