import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Seccion4 {
 
    public static void main(String[] args) {
        
       System.out.println("-Ejercicio 4.1");

       try (BufferedReader br = new BufferedReader(new FileReader("personas.txt"))) {

        System.out.println("Contenido de personas.txt: ");
        System.out.println("---");

        String linea;

        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }

        System.out.println("---");
        System.out.println("Archivo leido con exito.");

       } catch (IOException e) {
        System.out.println("Hubo un error al procesar el archivo: " + e.getMessage());
        
       }

    }






}
