public class Seccion4 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Ejercicio 4.1");

        TareaIdentidad tarea = new TareaIdentidad();

        Thread hiloBaja = new Thread(tarea, "Hilo-BajaPrioridad");
        Thread hiloAlta = new Thread(tarea, "Hilo-AltaPrioridad");

        hiloBaja.setPriority(Thread.MIN_PRIORITY);  // prioridad 1
        hiloAlta.setPriority(Thread.MAX_PRIORITY);  // prioridad 10

        System.out.println("Prioridad asignada a " + hiloBaja.getName() + ": " + hiloBaja.getPriority());
        System.out.println("Prioridad asignada a " + hiloAlta.getName() + ": " + hiloAlta.getPriority());
        System.out.println();

        hiloBaja.start();
        hiloAlta.start();

        hiloBaja.join();
        hiloAlta.join();

        System.out.println("Ejercicio 4.2");

        Thread hiloLargo = new Thread(new TareaLarga(), "Hilo-Largo");
        hiloLargo.start();

        System.out.println("Main: hilo largo iniciado, esperando 1 segundo...");
        Thread.sleep(1000);

        System.out.println("Main: enviando señal de interrupción al hilo largo...");
        hiloLargo.interrupt();

        hiloLargo.join();
        System.out.println("Main: el hilo largo fue interrumpido y terminó.");
    }
}