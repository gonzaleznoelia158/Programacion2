public class Usuario {

    String nombre;
    int edad;
    int telefono;
    String correo;

    //constructor vacío
    public Usuario() { }
    
    //constructor con nombre
    public Usuario(String nombre) {
        this.nombre = nombre;
        System.out.println("Usuario: " + nombre);
    }

    //constructor con edad y nombre
    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("Usuario: " + nombre + ", Edad: " + edad);
    }

    //ejercicio 2.2
    public void actualizarPerfil(String correo) {
        this.correo = correo;
        System.out.println("Perfil actualizado con éxito: Correo: " + correo);
    }
 
    public void actualizarPerfil(String correo, int telefono) {
        this.correo = correo;
        this.telefono = telefono;
        System.out.println("Perfil actualizado con éxito: \n Correo: " + correo + ", Teléfono: " + telefono);
    }
}
