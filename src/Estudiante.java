public class Estudiante {
    private String nombre;
    private String cedula;
    private int edad;

    // Constructor
    public Estudiante(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    // Método para imprimir información del estudiante
    public void imprimirInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cédula: " + cedula);
        System.out.println("Edad: " + edad);
    }
}
