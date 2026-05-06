public class Seccion1{

    //método finally
    public static void dividirConFinally() {
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Limpieza final"); //se ejecuta siempre
        }
    }
    public static void main(String[] args) throws Exception {
    
       System.out.println("-Ejercicio 1.1-");
         try {
         int num = Integer.parseInt("abc"); //convierte abc en un numero
         System.out.println("Número: " + num);
         } catch (NumberFormatException e){
         System.out.println("Mensaje de error: " + e.getMessage());
         System.out.println("Tipo de excepcion: " + e.getClass().getName());
         }

        System.out.println("-Ejercicio 1.2-");
        dividirConFinally();

        System.out.println("-Ejercicio 1.3-");
        try {
            int num = Integer.parseInt("abc");
            int resultado = 100 / num;
            System.out.println("El resultado es: " + resultado);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Error de calculo o conversion: " + e.getMessage());
        }
  }
}
