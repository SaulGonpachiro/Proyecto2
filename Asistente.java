public class Asistente {
    private String nombre;
    private String apellidos;
    private String email;
    private String dni;
    private String fechaNacimiento;  // Cambiado a String

    // Constructores
    public Asistente() {
        // Constructor por defecto
    }

    public Asistente(String nombre, String apellidos, String email, String dni, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Métodos
    @Override
    public String toString() {
        return "Información del Asistente: " + nombre + " " + apellidos + ", " + email + ", " + dni + ", Nacido el: " + fechaNacimiento;
    }

    public void infoBasica() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Email: " + email);
        System.out.println("DNI: " + dni);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
    }
}

