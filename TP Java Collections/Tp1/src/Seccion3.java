import java.util.ArrayDeque;
import java.util.HashSet;

public class Seccion3 {
    public static void main (String[] args) {
    
        HashSet<Integer> numero = new HashSet<>();

        //add para agregar los numeros
        numero.add(16);
        numero.add(16);
        numero.add(16);

        //imprimir
        System.out.println("Numero: " + numero);
        System.out.println("Tamaño del numero: " + numero.size());
        System.out.println("Existe el numero 16?" + numero.contains(16));

        //remove para eliminar
        numero.remove(16);
        System.out.println("Sigue estando el numero 16?:" + numero);


        //Ejercicio 3.2
        System.out.println("-Ejercicio 3.2-");

        //crear arrayDeque
        ArrayDeque<Integer> filaDeque = new ArrayDeque<>();

        //addFirst para agregar al principio y addLast para agregar al final
        filaDeque.addLast(30);
        filaDeque.addFirst(25);
        filaDeque.addLast(35);
        filaDeque.addFirst(20);

        //recuperar y remover
        System.out.println("Antes de remover: " + filaDeque);
        System.out.println("Luego de remover al inicio: " + filaDeque.removeFirst());
        System.out.println("Luego de remover al final: " + filaDeque.removeLast());
        System.out.println("Fila Deque final: " + filaDeque);
    }
}
