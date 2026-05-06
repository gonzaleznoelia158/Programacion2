import java.util.Comparator;

class CompararPorNombre implements Comparator<Empleado>{

    @Override
    public int compare(Empleado em1, Empleado em2) {
        return em1.nombre.compareTo(em2.nombre);
    }

}
