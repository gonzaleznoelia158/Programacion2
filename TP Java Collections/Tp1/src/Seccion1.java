import java.util.Arrays;

public class Seccion1 {

    public static void main (String[] args) {
        
     int[] numeros = new int[5];

     numeros[0] = 5;
     numeros[1] = 10;
     numeros[2] = 15;
     numeros[3] = 20;
     numeros[4] = 25;

     //actualizar el valor del indice 2
     numeros[2] = 21;

     
     System.out.println("-Ejercicio 1.1-");
     System.out.println("Numeros: " + Arrays.toString(numeros));
     
     //recuperar segundo elemento
     int ultimo = numeros[numeros.length - 1];
     System.out.println("Ultimo elemento: " + ultimo);

    System.out.println("-Ejercicio 1.2-");

    //array desordenado
    String[] nombres = {"Noelia", "Noemi", "Santiago", "Martin"};

    System.out.println("Nombres desordenados: " + Arrays.toString(nombres));

    //array ordenado de manera ascendente 
    Arrays.sort(nombres);

    System.out.println("Nombres ordenados: " + Arrays.toString(nombres));

    //busqueda binaria
    int posicion = Arrays.binarySearch(nombres, "Noemi");

    System.out.println("Posición de 'Noemí': " + posicion);

    }
}



