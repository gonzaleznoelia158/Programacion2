public class Seccion2 {

    //validaciones con fail-fast
    public static void registrarUsuario(String nombre, int edad) {
        
        //nombre nulo o en blanco
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar en blanco o ser nulo.");
        }

        //validacion de edad negativa
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }

        //registro de usuario
        System.out.println("Usuario registrado con éxito: " + nombre + ", Edad: " + edad);
    }

    public static void main(String[] args) {
        
        //nombre nulo
        System.out.println("-Ejercicio 2.1-");
        try {
            registrarUsuario(null, 21);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        //nombre en blanco
        try {
            registrarUsuario("   ", 18);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println( "-Ejercicio 2.2-");
        
        //edad negativa
        try {
            registrarUsuario("Bruno", -10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " +e.getMessage());
        }
      
        //registro valido
        try {
            registrarUsuario("Nicolas", 24);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
