package tarea;

public class QuickSort {

    public static void main(String[] args) {
        int[] numeros = {10, 7, 8, 9, 1, 5};
        System.out.println("Arreglo original:");
        imprimirArreglo(numeros);

        quickSort(numeros, 0, numeros.length - 1);

        System.out.println("\nArreglo ordenado con Quick Sort:");
        imprimirArreglo(numeros);
    }

    // 🔹 MÉTODO QUICK SORT (divide el arreglo usando un pivote)
    public static void quickSort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            // Encuentra el índice del pivote
            int indicePivote = particion(arreglo, inicio, fin);

            // Ordena los elementos antes y después del pivote
            quickSort(arreglo, inicio, indicePivote - 1);
            quickSort(arreglo, indicePivote + 1, fin);
        }
    }

    // 🔹 MÉTODO PARTICIÓN (coloca el pivote en su lugar correcto)
    public static int particion(int[] arreglo, int inicio, int fin) {
        int pivote = arreglo[fin]; // tomamos el último elemento como pivote
        int i = (inicio - 1);      // índice del elemento más pequeño

        for (int j = inicio; j < fin; j++) {
            // Si el elemento actual es menor o igual al pivote
            if (arreglo[j] <= pivote) {
                i++;
                // intercambiamos arreglo[i] con arreglo[j]
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }

        // Colocamos el pivote en su posición final
        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[fin];
        arreglo[fin] = temp;

        return i + 1; // devolvemos el índice del pivote
    }

    // Método auxiliar para imprimir el arreglo
    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
