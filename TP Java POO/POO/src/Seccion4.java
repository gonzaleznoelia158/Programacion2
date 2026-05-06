public class Seccion4 {
    
    public static void enviarAImpresion(Exportable documentoExportable) {
        System.out.println("Enviar documento a impresión.");
        documentoExportable.exportar();
    }
  public static void main(String[] args) {
    
    System.out.println("-Ejercicio 4.2-");
    
    Factura factura = new Factura();
    factura.procesar();
    factura.exportar();
    factura.registrarAuditoria();

    System.out.println("-Ejercicio 4.2-");

    enviarAImpresion(factura); //pasar factura como exportable
    
 }
}
