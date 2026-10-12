public class Videojuegos {
    // Atributos public
    public String nombre;
    public String genero;

    // Atributos con acceso por defecto
    String version;
    boolean activo;

    public void mostrarInformacion() {
        System.out.println("Videojuego: " + nombre + " Género: " + genero + " Versión: " + version + " Activo: " + activo);
    }

    public void iniciar() {
        activo = true;
        System.out.println("El videojuego " + nombre + " se ha iniciado.");
    }

    void cerrar() {
        activo = false;
        System.out.println("El videojuego " + nombre + " se ha cerrado.");
    }

    void mostrarVersion() {
        System.out.println("Versión de " + nombre + ": " + version);
    }
}

