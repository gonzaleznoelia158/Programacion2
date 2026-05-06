public class TareaLarga implements Runnable {

    @Override
    public void run() {
        System.out.println("TareaLarga: iniciando tarea que tarda mucho...");

        try {
            Thread.sleep(5000);
            System.out.println("TareaLarga: tarea completada sin interrupciones.");

        } catch (InterruptedException e) {
            System.out.println("TareaLarga: hilo interrumpido durante sleep().");
            System.out.println("TareaLarga: motivo -> " + e.getMessage());
        }
    }
}