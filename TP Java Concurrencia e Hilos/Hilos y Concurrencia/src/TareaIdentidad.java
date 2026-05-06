public class TareaIdentidad implements Runnable {

    @Override
    public void run() {
        Thread hiloActual = Thread.currentThread();

        System.out.println("Hilo iniciado:"
                + " Nombre=" + hiloActual.getName()
                + " | Prioridad=" + hiloActual.getPriority());

        for (int i = 1; i <= 5; i++) {
            System.out.println(hiloActual.getName() + " -> paso " + i);
        }

        System.out.println(hiloActual.getName() + " terminó.");
    }
}
