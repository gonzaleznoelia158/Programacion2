class TareaContador implements Runnable {

    private Contador contador;
    private String nombre;

    public TareaContador(Contador contador, String nombre) {
        this.contador = contador;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            contador.incrementar();
        }
        System.out.println(nombre + " terminó de incrementar.");
    }
}
