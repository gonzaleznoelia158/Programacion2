public class Reporte {

    //Ehercicio 2.1        
    public void generarEncabezado() {
        System.out.println("ENCABEZADO");
    }
    public String obtenerCuerpo() {
        return "Cuerpo del reporte.";
    }
    //Ejercicio 2.3
    public void agregarSecciones(String... secciones) {
        if (secciones.length == 0) {
            System.out.println("No se han ingresado secciones.");
        } else {
            System.out.println("Seciones: ");
            //for each
            for (String seccion : secciones) {
                System.out.println(" ~ " + seccion);
            }
        }
    }
}
