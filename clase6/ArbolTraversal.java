package clase6;

public class ArbolTraversal<T extends Comparable<T>> {
    private Nodo<T> raiz;

    public ArbolTraversal() {
        raiz = null;
    }

    // Inserción recursiva
    public void insertar(T valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo<T> insertarRec(Nodo<T> nodo, T valor) {
        if (nodo == null) return new Nodo<>(valor);
        int cmp = valor.compareTo(nodo.dato);
        if (cmp < 0) nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        else if (cmp > 0) nodo.derecho = insertarRec(nodo.derecho, valor);
        // si es igual: no insertamos duplicados (cambia si quieres permitirlos)
        return nodo;
    }

    // Búsqueda
    public boolean buscar(T valor) {
        Nodo<T> cur = raiz;
        while (cur != null) {
            int cmp = valor.compareTo(cur.dato);
            if (cmp == 0) return true;
            cur = (cmp < 0) ? cur.izquierdo : cur.derecho;
        }
        return false;
    }

    // Eliminación
    public void eliminar(T valor) {
        raiz = eliminarRec(raiz, valor);
    }

    private Nodo<T> eliminarRec(Nodo<T> nodo, T valor) {
        if (nodo == null) return null;
        int cmp = valor.compareTo(nodo.dato);
        if (cmp < 0) nodo.izquierdo = eliminarRec(nodo.izquierdo, valor);
        else if (cmp > 0) nodo.derecho = eliminarRec(nodo.derecho, valor);
        else {
            // encontrado
            if (nodo.izquierdo == null) return nodo.derecho;
            if (nodo.derecho == null) return nodo.izquierdo;
            // dos hijos: reemplazar por sucesor (min del subárbol derecho)
            Nodo<T> sucesor = encontrarMin(nodo.derecho);
            nodo.dato = sucesor.dato;
            nodo.derecho = eliminarRec(nodo.derecho, sucesor.dato);
        }
        return nodo;
    }

    private Nodo<T> encontrarMin(Nodo<T> nodo) {
        while (nodo.izquierdo != null) nodo = nodo.izquierdo;
        return nodo;
    }

    // Recorridos: InOrden, PreOrden, PostOrden (recursivos)
    public void recorridoInOrden() {
        recorridoInOrdenRec(raiz);
        System.out.println();
    }

    private void recorridoInOrdenRec(Nodo<T> nodo) {
        if (nodo == null) return;
        recorridoInOrdenRec(nodo.izquierdo);
        System.out.print(nodo.dato + " ");
        recorridoInOrdenRec(nodo.derecho);
    }

    public void recorridoPreOrden() {
        recorridoPreOrdenRec(raiz);
        System.out.println();
    }

    private void recorridoPreOrdenRec(Nodo<T> nodo) {
        if (nodo == null) return;
        System.out.print(nodo.dato + " ");
        recorridoPreOrdenRec(nodo.izquierdo);
        recorridoPreOrdenRec(nodo.derecho);
    }

    public void recorridoPostOrden() {
        recorridoPostOrdenRec(raiz);
        System.out.println();
    }

    private void recorridoPostOrdenRec(Nodo<T> nodo) {
        if (nodo == null) return;
        recorridoPostOrdenRec(nodo.izquierdo);
        recorridoPostOrdenRec(nodo.derecho);
        System.out.print(nodo.dato + " ");
    }

    // Recorrido por niveles (BFS)
    public void recorridoPorNiveles() {
        if (raiz == null) {
            System.out.println("Árbol vacío");
            return;
        }
        java.util.Queue<Nodo<T>> cola = new java.util.LinkedList<>();
        cola.add(raiz);
        while (!cola.isEmpty()) {
            Nodo<T> nodo = cola.poll();
            System.out.print(nodo.dato + " ");
            if (nodo.izquierdo != null) cola.add(nodo.izquierdo);
            if (nodo.derecho != null) cola.add(nodo.derecho);
        }
        System.out.println();
    }

    // Altura
    public int altura() {
        return alturaRec(raiz);
    }

    private int alturaRec(Nodo<T> nodo) {
        if (nodo == null) return 0;
        int izq = alturaRec(nodo.izquierdo);
        int der = alturaRec(nodo.derecho);
        return Math.max(izq, der) + 1;
    }

    // Verificar si es un BST válido (propiedad de orden) - utilidad de verificación
    public boolean esBST() {
        return esBSTRec(raiz, null, null);
    }

    private boolean esBSTRec(Nodo<T> nodo, T min, T max) {
        if (nodo == null) return true;
        if (min != null && nodo.dato.compareTo(min) <= 0) return false;
        if (max != null && nodo.dato.compareTo(max) >= 0) return false;
        return esBSTRec(nodo.izquierdo, min, nodo.dato) && esBSTRec(nodo.derecho, nodo.dato, max);
    }

    // Método para obtener la raíz (debug)
    public T raizValor() {
        return (raiz == null) ? null : raiz.dato;
    }
}
