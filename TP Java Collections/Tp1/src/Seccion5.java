import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Seccion5 {
    public static void main(String[] args) {

    //crear lista compartida
    List<Empleado> empleados = new ArrayList<>();
    empleados.add(new Empleado("Santiago", 24));
    empleados.add(new Empleado("Martin", 27));
    empleados.add(new Empleado("Francisco", 19));
    empleados.add(new Empleado("Alicia", 31));
    empleados.add(new Empleado("Renata", 29));

    //Ejercicio 5.1
    System.out.println("-Ejercicio 5.1-");
    System.out.println("Primer lista: " + empleados);

    //collections.sort para usar el compareTo de empleado
    Collections.sort(empleados);
    System.out.println("Orden de empleados por edad: " + empleados);

    //Ejercicio 5.2
    System.out.println("-Ejercicio 5.2-");

    //collectionss.sort con un comparador externo
    Collections.sort(empleados, new CompararPorNombre());
    System.out.println("Orden de empleados por nombre: " + empleados);
    
    }

}
