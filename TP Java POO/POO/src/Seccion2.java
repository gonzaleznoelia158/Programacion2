public class Seccion2 {

   public static void main(String[] args) {
    
       System.out.println("-Ejercicio 2.1");
       Reporte report = new Reporte();

       //método void
       report.generarEncabezado();

       //método return
       String cuerpo = report.obtenerCuerpo();
       System.out.println(cuerpo);

       System.out.println("-Ejercicio 2.2-");

       //sobrecargar constructores
       Usuario usu1 = new Usuario("Brunito");
       Usuario usu2 = new Usuario("Santiago", 24);

       //sobrecargar métodos
       usu1.actualizarPerfil("brunito123@gmail.com");
       usu2.actualizarPerfil("santiago16@gmail.com", 26542120);

       System.out.println("-Ejercicio 2.3-");
       //llamado con 3 argumentos diferentes
       report.agregarSecciones("Introducción", "Desarrollo", "Conclusión");
       
       //llamado vacío
       report.agregarSecciones();
   }

}
