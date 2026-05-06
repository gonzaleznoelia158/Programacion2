// ===== Clase Contador compartida entre hil
public class Seccion2 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("=== Ejercicio 2.1 ===");
        System.out.println("Cada hilo incrementa 10.000 veces.");
        System.out.println("Resultado esperado: 20.000");

        // Ambos hilos comparten la MISMA instancia de Contador
        Contador contador = new Contador();

        Thread hilo1 = new Thread(new TareaContador(contador, "Hilo-1"));
        Thread hilo2 = new Thread(new TareaContador(contador, "Hilo-2"));

        hilo1.start();
        hilo2.start();

        hilo1.join();
        hilo2.join();

        System.out.println("Resultado final del contador: " + contador.getValor());
        System.out.println("es correcto? " + (contador.getValor() == 20000 ? "Sí" : "No, hubo condición de carrera"));
    }
}
