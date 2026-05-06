class Empleado implements Comparable<Empleado> {

    String nombre;
    int edad;
    
    Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //sobreescribir el metodo compareTo
    @Override
    public int compareTo(Empleado otro) {
        return this.edad - otro.edad;
    }

    @Override
    public String toString() {
        return nombre + " (Edad: " + edad + ")";
    }

}
