public class Seccion3 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Ejercicio 3.1");
        System.out.println("Cada hilo incrementa 10.000 veces.");
        System.out.println("Resultado esperado: 20.000");

        ContadorSincronizado contadorSync = new ContadorSincronizado();

        Thread hilo1 = new Thread(new TareaSincronizada(contadorSync, "Hilo-1"));
        Thread hilo2 = new Thread(new TareaSincronizada(contadorSync, "Hilo-2"));

        hilo1.start();
        hilo2.start();

        hilo1.join();
        hilo2.join();

        System.out.println("Resultado final: " + contadorSync.getValor());
        System.out.println("Es correcto? " + (contadorSync.getValor() == 20000 ? "Sí, sincronización exitosa" : "No"));


        
        System.out.println("Ejercicio 3.2");
        System.out.println("Cada hilo incrementa 10.000 veces.");
        System.out.println("Resultado esperado: 20.000");

        ContadorBloque contadorBloque = new ContadorBloque();

        Thread hilo3 = new Thread(new TareaSincronizada(contadorBloque, "Hilo-3"));
        Thread hilo4 = new Thread(new TareaSincronizada(contadorBloque, "Hilo-4"));

        hilo3.start();
        hilo4.start();

        hilo3.join();
        hilo4.join();

        System.out.println("Resultado final: " + contadorBloque.getValor());
        System.out.println("Es correcto? " + (contadorBloque.getValor() == 20000 ? "Sí, sincronización exitosa" : "No"));
    }
}