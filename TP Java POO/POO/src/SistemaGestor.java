/**
 * EJERCICIO 1.1
 * Esta clase va a representar un sistema de gestor de conexiones
 * el cual se encargará de administrar y limitar la cantidad de 
 * conexiones permitidas dentro del sistema.
 */
public class SistemaGestor {

    //Creamos una constante para definir el máximo de conexiones
    //satic para indicar que el método pertenece a la clase y no a una instancia
    //final para indicar que el valor, una vez inicializado, no se puede reasignar
    public static final int MAX_CONEXIONES = 10;
    
    /* crear el método para imprimir el valor máximo de la variable
    que al ser "static", puede llamarse sin tener que crar una instancia de clase */

    public static void maxConexiones() {
        System.out.println("Mostrar el máximo de conexiones: " + MAX_CONEXIONES);
    } 

    public static void main(String[] args) {

        maxConexiones(); //llama al método sin crear un objeto

         //acceso directo a la constante desde la clase
        System.out.println("Acceso directo: " + SistemaGestor.MAX_CONEXIONES);
    }

}
