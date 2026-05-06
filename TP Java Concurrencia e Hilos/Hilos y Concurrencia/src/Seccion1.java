public class Seccion1 {
    public static void main(String[] args) {

        
        System.out.println("Ejercicio 1.1");

        
        TareaHilo hilo1 = new TareaHilo("Hilo-1");
        TareaHilo hilo2 = new TareaHilo("Hilo-2");
        TareaHilo hilo3 = new TareaHilo("Hilo-3");

        
        // NUNCA llamar a run directamente
        hilo1.start();
        hilo2.start();
        hilo3.start();


        try { Thread.sleep(100); } catch (InterruptedException e) {}

        System.out.println("\n=== Ejercicio 1.2 ===");

        TareaRunnable tarea = new TareaRunnable("Runnable");

        Thread threadA = new Thread(tarea, "Thread-A");
        Thread threadB = new Thread(tarea, "Thread-B");

        threadA.start();
        threadB.start();
    }
}
