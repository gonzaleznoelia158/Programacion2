public class Seccion3 {
  
    public static void main(String[] args) {
        
        System.out.println("-Ejercicio 3.1-");
        
        CuentaBancaria cuenta = new CuentaBancaria(10000.0);

        //retiro invalido
        try {
            cuenta.retirar(200.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //saldo insuficiente
        try {
            cuenta.retirar(15000.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Ejercicio 3.2");

        //producto valido
        Producto prod1 = new Producto("Notebook Bangho Max", 1200.0);

        //producto negativo
        try {
            Producto prod2 = new Producto("Mouse ergonomico", -700.0);
        } catch (ProductoInvalidoException e) {
            System.out.println("Error (unchecked): " + e.getMessage());
        }
    }
}
