public class Factura extends Documento implements Exportable, Auditable {

    //ejercicio 3.2

    //sobreescribir métoddo abstracto
    @Override
    public void procesar() {
        System.out.println("Procesando su factura...");
    }
    
    //ejercicio 3.3
    public void procesar(boolean esUrgente) {
        if (esUrgente) {
            System.out.println("Proceso de factura URGENTE...");
        } 
    }

    /* SECCIÓN 4 - INTERFACES Y ABSTRACCIÓN AVANZADA 
    ejercicio 4.1*/

    //implementar métodos exportar y auditable
    @Override 
    public void exportar() {
        System.out.println("Exportar factura a formato TXT.");
    }

    @Override
    public void registrarAuditoria() {
        System.out.println("Factura procesada el: " + java.time.LocalDate.now());
    }
}
