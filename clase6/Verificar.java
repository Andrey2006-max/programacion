package clase6;

public class Verificar {
    public static void main(String[] args) {
        ArbolTraversal<Integer> arbol = new ArbolTraversal<>();

        // Insertar valores de ejemplo
        int[] valores = {50, 30, 70, 20, 40, 60, 80};
        for (int v : valores) arbol.insertar(v);

        System.out.println("Recorrido In-Orden (debe salir ordenado):");
        arbol.recorridoInOrden(); // 20 30 40 50 60 70 80

        System.out.println("Recorrido Pre-Orden:");
        arbol.recorridoPreOrden();

        System.out.println("Recorrido Post-Orden:");
        arbol.recorridoPostOrden();

        System.out.println("Recorrido por niveles:");
        arbol.recorridoPorNiveles();

        System.out.println("Altura del árbol: " + arbol.altura());

        System.out.println("¿Es BST válido? " + arbol.esBST());

        // Buscar
        System.out.println("Buscar 40: " + arbol.buscar(40)); // true
        System.out.println("Buscar 99: " + arbol.buscar(99)); // false

        // Eliminar raíz (50) y volver a mostrar In-Orden
        System.out.println("Eliminando 50...");
        arbol.eliminar(50);
        System.out.println("In-Orden después de eliminar 50:");
        arbol.recorridoInOrden();

        System.out.println("¿Es BST válido después de eliminar? " + arbol.esBST());
    }
}
