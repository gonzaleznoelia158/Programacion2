import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Seccion3 {
    public static void main(String[] args) {

        System.out.println("Ejercicio 3.1");

        // map transforma String a mayúsculas
        Stream.of("Matias", "Santiago", "Noemi")
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));


        System.out.println("Ejercicio 3.2");

        //mapToInt transforma el Stream<String> en IntStream con las longitudes
        int sumaLetras = Stream.of("Noemi", "Nicolas", "Bruno")
                .mapToInt(s -> s.length())
                .sum(); //operación de IntStream

        System.out.println("Longitudes: Noemi=5, Bruno=5, Nicolas=7");
        System.out.println("Suma total de letras: " + sumaLetras);


        System.out.println("Ejercicio 3.3");

        //lista de sublistas
        List<List<String>> datos = Arrays.asList(
                Arrays.asList("Matias", "Noelia", "Rocio"),
                Arrays.asList("Ciro", "Bruno"),
                Arrays.asList("Santiago", "Micaela", "Alicia")
        );

        System.out.println("Sublistas: " + datos);

        // flatMap aplana las sublistas en un stream continuo
        long cantidad = datos.stream()
                .flatMap(l -> l.stream()) 
                .filter(nombre -> nombre.length() > 4)
                .count();

        System.out.println("Nombres con mas de 4 caracteres: " + cantidad);

        // Para visualizar cuáles son esos nombres
        System.out.println("Los nombres son:");
        datos.stream()
                .flatMap(l -> l.stream())
                .filter(nombre -> nombre.length() > 4)
                .forEach(nombre -> System.out.println("  - " + nombre));


        System.out.println("Ejercicio 3.4");

        // sorted ordena alfabéticamente
        System.out.println("Orden alfabético:");
        Stream.of("Notebook", "Mouse", "Teclado", "Placa", "CPU")
                .sorted()
                .forEach(s -> System.out.println("  " + s));

        // sorted ordena por longitud con lambda
        System.out.println("Orden por longitud:");
        Stream.of("Notebook", "Mouse", "Teclado", "Placa", "CPU")
                .sorted((a, b) -> a.length() - b.length())
                .forEach(s -> System.out.println("  " + s));
    }
}
