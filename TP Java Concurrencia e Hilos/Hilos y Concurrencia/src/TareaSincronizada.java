public class TareaSincronizada implements Runnable {

    private Object contador;
    private String nombre;

    public TareaSincronizada(Object contador, String nombre) {
        this.contador = contador;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            if (contador instanceof ContadorSincronizado) {
                ((ContadorSincronizado) contador).incrementar();
            } else if (contador instanceof ContadorBloque) {
                ((ContadorBloque) contador).incrementar();
            }
        }
        System.out.println(nombre + " terminó de incrementar.");
    }
}
