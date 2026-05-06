public class Seccion3 {

  //demostrar polimorfismo, herencia y sobrecarga
  public static void main(String[] args) {
    
   System.out.println("-Ejercicio 3.1 y 3.2-");

   Documento doc1 = new Factura();
   Documento doc2 = new Recibo();

   doc1.procesar();
   doc2.procesar();

   System.out.println("-Ejercicio 3.3-");

   //acceso a la sobrecarga con el tipo Factura
   Factura fact = new Factura();

   //procesar() heredado
   fact.procesar();

   //procesar(boolean) sobrecargado
   fact.procesar(true);
   
  }
}
