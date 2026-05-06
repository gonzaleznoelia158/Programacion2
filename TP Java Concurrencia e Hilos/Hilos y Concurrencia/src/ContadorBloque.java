public class ContadorBloque {
    private int valor = 0;

    // Sin synchronized en el método
    public void incrementar() {
        synchronized (this) {
            valor++;
        }
    }

    public int getValor() {
        return valor;
    }
}
