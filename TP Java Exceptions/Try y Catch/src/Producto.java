public class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        if (precio <= 0) {
            throw new ProductoInvalidoException("El precio del producto no puede ser menor o igual a cero. Precio ingresado: " + precio);
        }

    this.nombre = nombre;
    this.precio = precio;
    System.out.println("Producto registrado: " + nombre + ", Precio: " + precio);
    }

}
