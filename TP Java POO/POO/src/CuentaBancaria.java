public class CuentaBancaria {

    /*SECCIÓN 1 DE JAVA POO */

    //declaración de métodos
    private String numeroCuenta;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public CuentaBancaria(String string) {
        
    }
    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("No se pueden ingresar montos negativos.");
        } else {
            saldo += monto;
            System.out.println("Monto depositado con éxito: $" + monto);
        }
    }

    public static void main(String[] args) {
     
        //crear cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria ("000-789", 3000.0);

        //imprimir
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo actual: " + cuenta.getSaldo());
        //agregar depósito negativo
        System.out.println("Depositar -$1000");
        cuenta.depositar(-1000);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
}
