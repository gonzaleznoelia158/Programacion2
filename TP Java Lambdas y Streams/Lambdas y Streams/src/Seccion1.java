import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Seccion1 {
    public static void main(String[] args) {

        System.out.println("-Ejercicio 1.1-");

        //devuelve true si el número es par
        Predicate<Integer> esPar = numero -> numero % 2 == 0;
        System.out.println("¿8 es par? " + esPar.test(8));
        System.out.println("¿7 es par? " + esPar.test(7));

        //recibe un String y devuelve la longitud
        Function<String, Integer> longitud = texto -> texto.length();
        System.out.println("Longitud de 'Holi': " + longitud.apply("Holi"));

        //imprimir el número recibido
        Consumer<Integer> imprimir = numero -> System.out.println("Número recibido: " + numero);
        imprimir.accept(42);

        // supplier para devolver un número aleatorio
        Supplier<Double> aleatorio = () -> Math.random();
        System.out.println("Número aleatorio: " + aleatorio.get());


        System.out.println("-Ejercicio 1.2-");

        List<String> textos = Arrays.asList("Banana", "Kiwi", "Manzana", "Pera", "Mandarina");
        System.out.println("Antes de ordenar: " + textos);

        //ordenar por longitud del texto
        textos.sort((a, b) -> a.length() - b.length());
        System.out.println("Ordenar por longitud: " + textos);


        System.out.println("-Ejercicio 1.3-");

        // ToIntFunction: reemplaza Function<String, Integer> evitando autoboxing
        ToIntFunction<String> longitudPrimitiva = texto -> texto.length();
        System.out.println("Longitud de 'Holi' (ToIntFunction): " + longitudPrimitiva.applyAsInt("Hola"));

        
        IntPredicate esParPrimitivo = numero -> numero % 2 == 0;
        System.out.println("8 es par? (IntPredicate): " + esParPrimitivo.test(8));
        System.out.println("7 es par? (IntPredicate): " + esParPrimitivo.test(7));
    }
}
