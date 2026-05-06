import java.util.HashMap;
import java.util.TreeMap;

public class Seccion4 {
    public static void main(String[] args) { 
    
        System.out.println("-Ejercicio 4.1-");

        //crear el hashMap
        HashMap<Integer, String> mascotas = new HashMap<>();

        //put para agregar elementos
        mascotas.put(0, " Kinoa");
        mascotas.put(1, " Apolo");
        mascotas.put(2, " Bruno");
        mascotas.put(3, " Paprika");
        mascotas.put(4, " Ciro");
        
        //get para llamar al nombre desde su id
        System.out.println("Llamar nombre por id: " + mascotas.get(0));
        
        //replace para actualizar 
        System.out.println("Actualizar nombre con id: 1 " + mascotas.replace(1, "Kala"));
        System.out.println("Listado de mascotas actualizado: " + mascotas);
        
        //remove para eliminar
        System.out.println("Eliminar nombre con id: 3 " + mascotas.remove(3));
        System.out.println("Nombre con id: 3 eliminado correctamente... " + mascotas);
        
        //Ejercicio 4.2
        System.out.println("-Ejercicio 4.2-");
        
        //crear el treeMap
        TreeMap<Integer, String> Mascotas = new TreeMap<>();
        
        //agregar de manera desordenada
        Mascotas.put(2, "Bruno");
        Mascotas.put(4, " Ciro");
        Mascotas.put(1, " Apolo");
        Mascotas.put(3, " Paprika");
        Mascotas.put(0, " Kinoa");
 
        //treeMap ordenado automaticamente
        System.out.println("Listado de mascotas con TreeMap: ");
        for (Integer id : Mascotas.keySet()) {
            System.out.println("ID: " + id + "->" + Mascotas.get(id));
        }

    }

}
