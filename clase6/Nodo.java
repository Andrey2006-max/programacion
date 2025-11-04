package clase6;

public class Nodo<T extends Comparable<T>> {
    T dato;
    Nodo<T> izquierdo;
    Nodo<T> derecho;

    public Nodo(T dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }

    @Override
    public String toString() {
        return String.valueOf(dato);
    }
}
