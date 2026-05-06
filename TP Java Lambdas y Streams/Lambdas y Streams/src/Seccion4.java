import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Seccion4 {
    public static void main(String[] args) {

        System.out.println("Ejercicio 4.1");

        boolean alguno = Stream.of(2, 5, 7, 3, 6, 2, 3)
                .anyMatch(n -> n > 5);
        System.out.println("número mayor a 5?: " + alguno);

        boolean todos = Stream.of(2, 5, 7, 3, 6, 2, 3)
                .allMatch(n -> n > 1);
        System.out.println("los numeros mayores a 1?: " + todos);

        boolean ninguno = Stream.of(2, 5, 7, 3, 6, 2, 3)
                .noneMatch(n -> n < 0);
        System.out.println("ningun numero negativo?: " + ninguno);


        System.out.println("Ejercicio 4.2");

        // findFirst devuelve el primer número par envuelto en Optional
        Optional<Integer> primerPar = Stream.of(3, 7, 5, 8, 2, 4)
                .filter(n -> n % 2 == 0)
                .findFirst();

        // isPresent verifica antes de extraer con get
        if (primerPar.isPresent()) {
            System.out.println("Primer número par encontrado: " + primerPar.get());
        } else {
            System.out.println("No se encontró ningún número par.");
        }

        Optional<Integer> sinResultado = Stream.of(1, 3, 5, 7)
                .filter(n -> n % 2 == 0)
                .findFirst();

        System.out.println("se encontró un par en [1,3,5,7]? " + sinResultado.isPresent());


        System.out.println("Ejercicio 4.3");

        //reduce acumula sumando todos los elementos
        Optional<Integer> suma = Stream.of(1, 2, 3, 4, 5)
                .reduce((a, b) -> a + b);

        System.out.println("Suma de [1,2,3,4,5]: " + suma.get());

        
        System.out.println("Ejercicio 4.4");

        // collectors.toList elimina duplicados y recolecta 
        List<Integer> listaLimpia = Stream.of(3, 1, 4, 1, 5, 3, 2, 4)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Lista sin duplicados: " + listaLimpia);

        // collectors.toMap genera un Map a partir de personas
        List<Persona> personas = List.of(
                new Persona("12345678A", "Anakin"),
                new Persona("87654321B", "Leia"),
                new Persona("11223344C", "Padme")
        );

        Map<String, String> mapaPersonas = personas.stream()
                .collect(Collectors.toMap(
                        p -> p.getDni(), //clave DNI
                        p -> p.getNombre() //valor nombre
                ));

        System.out.println("Mapa DNI -> Nombre:");
        mapaPersonas.forEach((dni, nombre) ->
                System.out.println("  " + dni + " -> " + nombre));
    }
}
