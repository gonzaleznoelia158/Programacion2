public class CuentaBancaria {

    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Este es su saldo actual: $" + saldo + ", monto solicitado: $" + monto);
        }
        saldo -= monto;
        System.out.println("Retiro de dinero exitoso: $" + monto + ". Saldo actual: $" + saldo);
    }
}
