package tarea;

public class Dijkstra {

    // Método que implementa el algoritmo de Dijkstra
    public static void dijkstra(int[][] grafo, int origen) {
        int n = grafo.length;                // Número de nodos en el grafo
        int[] distancia = new int[n];        // Guarda la distancia mínima desde el origen a cada nodo
        boolean[] visitado = new boolean[n]; // Indica si el nodo ya fue visitado

        // 1️⃣ Inicializamos las distancias a infinito y los visitados a falso
        for (int i = 0; i < n; i++) {
            distancia[i] = Integer.MAX_VALUE; // Representa "infinito"
            visitado[i] = false;
        }

        // 2️⃣ La distancia desde el origen a sí mismo siempre es 0
        distancia[origen] = 0;

        // 3️⃣ Repetimos el proceso para todos los nodos
        for (int contador = 0; contador < n - 1; contador++) {

            // 🔍 Buscar el nodo con la distancia mínima que aún no ha sido visitado
            int u = nodoMinimo(distancia, visitado, n);

            // Marcamos ese nodo como visitado
            visitado[u] = true;

            // 🔄 Actualizamos las distancias de los nodos vecinos
            for (int v = 0; v < n; v++) {
                // Verificamos tres condiciones:
                // 1️⃣ El nodo v no ha sido visitado
                // 2️⃣ Existe un camino desde u hasta v (peso > 0)
                // 3️⃣ La distancia actual puede mejorar pasando por u
                if (!visitado[v] && grafo[u][v] != 0 && distancia[u] != Integer.MAX_VALUE
                        && distancia[u] + grafo[u][v] < distancia[v]) {

                    // Si se cumple, actualizamos la distancia
                    distancia[v] = distancia[u] + grafo[u][v];
                }
            }
        }

        // 4️⃣ Mostramos el resultado final
        imprimirDistancias(distancia, origen);
    }

    // Método auxiliar para encontrar el nodo con menor distancia provisional
    public static int nodoMinimo(int[] distancia, boolean[] visitado, int n) {
        int min = Integer.MAX_VALUE;
        int indiceMin = -1;

        for (int i = 0; i < n; i++) {
            if (!visitado[i] && distancia[i] <= min) {
                min = distancia[i];
                indiceMin = i;
            }
        }
        return indiceMin;
    }

    // Método para imprimir las distancias desde el origen
    public static void imprimirDistancias(int[] distancia, int origen) {
        System.out.println("Distancias mínimas desde el nodo " + origen + ":");
        for (int i = 0; i < distancia.length; i++) {
            System.out.println("→ Nodo " + i + " = " + distancia[i]);
        }
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        // 🧱 Grafo representado como matriz de adyacencia
        // Si no hay conexión, el valor es 0
        int[][] grafo = {
            {0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        // Elegimos el nodo de inicio (por ejemplo, 0)
        dijkstra(grafo, 0);
    }
}
