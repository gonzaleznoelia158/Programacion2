import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Seccion2 {
    public static void main (String[] args) {

    //Ejercicio 2.1

    ArrayList<String> mascotas = new ArrayList<>();

    //add para agregar elementos
    mascotas.add("Bruno");
    mascotas.add("Amelia");
    mascotas.add("Cleo");
    System.out.println("Listado de mis mascotas: " + mascotas);

    //set para actualizar
    mascotas.set(1, "Lía");

    //get para recuperar elementos
    String primero = mascotas.get(0);

    //remove para eliminar 
    mascotas.remove(mascotas.size() - 1);

    //Ejercicio 2.2

    //List.of para crear lista inmutable
    List<String> mascotasLista = List.of("Bruno", "Cleo", "Lía");
    
    
    //crear LinkedList 
    LinkedList<String> mascotasList = new LinkedList<>(mascotasLista);
    
    //agregar nombre
    mascotasList.add(2,"Noah");
    
    //imprimir
    System.out.println("-Ejercicio 2.1-");
    System.out.println("Listado de mascotas actualizada: " + mascotas); //lista actualizada con set()
    System.out.println("Nombre de la primer mascota: " + primero); //nombre recuperado con get()
    System.out.println("Listado de mascotas nuevo: " + mascotas); //nombre eliminado con remove()
    System.out.println("-Ejercicio 2.2-");
    System.out.println("Listado inmutable de mis mascotas: " + mascotasLista); //listado no modificable
    //excepcion al intentar agregar elementos
    try {
        mascotasLista.add("Amelia");
    } catch (UnsupportedOperationException e) {
        System.out.println("Error al intentar modificar Listado de mascotas: UnsupportedOperationException");
    } //fin lista inmutable
    System.out.println("Listado de mascotas inicial: " + mascotasList); //listado de mascotas de linkedList creado a partir de lista inmutable
    System.out.println("Listado mutable (LinkedList) de mascotas ampliado: " + mascotasList); //nombre agregado con add() en la linkedList 
}

}
