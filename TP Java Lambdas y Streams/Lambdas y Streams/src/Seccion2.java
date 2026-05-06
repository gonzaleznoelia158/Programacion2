import java.util.stream.Stream;

public class Seccion2 {
    public static void main(String[] args) {

        System.out.println("Ejercicio 2.1");

        long total = Stream.of(2, 5, 3, 3, 6, 2, 4)
                .distinct()  //elimina duplicados
                .skip(1)     //descarta el primero
                .limit(3) //se queda con los primeros 3
                .count();    //operación terminal desencadena el pipeline

        System.out.println("Total de resultantes: " + total);


      
        System.out.println("Ejercicio 2.2");

        System.out.println("Elementos mayores a 3 en el pipeline:");

        long cantidad = Stream.of(2, 5, 3, 3, 6, 2, 4)
                .filter(n -> n > 3)//conserva el 5, 6, 4
                .peek(n -> System.out.println("  peek -> " + n)) //espía sin modificar
                .count();// desencadena el pipeline

        System.out.println("Total de elementos mayores a 3: " + cantidad);

        
        System.out.println("Demostración lazy evaluation");
        System.out.println("Creando pipeline sin operacion terminal...");

        Stream<Integer> pipeline = Stream.of(2, 5, 3, 6, 4)
                .filter(n -> n > 3)
                .peek(n -> System.out.println("  esto nunca se imprime"));

        System.out.println("Pipeline creado Sin count() o collect(), nada se ejecutó.");
        System.out.println("Ejecutar con count():");
        pipeline.count();
    }
}