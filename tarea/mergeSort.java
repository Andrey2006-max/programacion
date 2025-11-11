package tarea;

public class mergeSort {

    // Método principal para probar el algoritmo
    public static void main(String[] args) {
        int[] numeros = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Arreglo original:");
        imprimirArreglo(numeros);

        mergeSort(numeros, 0, numeros.length - 1);

        System.out.println("\nArreglo ordenado con Merge Sort:");
        imprimirArreglo(numeros);
    }

    // 🔹 MÉTODO MERGE SORT (divide el arreglo en mitades)
    public static void mergeSort(int[] arreglo, int izquierda, int derecha) {
        if (izquierda < derecha) { // condición de recursión
            int medio = (izquierda + derecha) / 2; // punto medio

            // Llamadas recursivas para cada mitad
            mergeSort(arreglo, izquierda, medio);
            mergeSort(arreglo, medio + 1, derecha);

            // Luego de dividir, mezclamos las dos mitades ordenadas
            merge(arreglo, izquierda, medio, derecha);
        }
    }

    // 🔹 MÉTODO MERGE (mezcla dos subarreglos ordenados)
    public static void merge(int[] arreglo, int izquierda, int medio, int derecha) {
        int n1 = medio - izquierda + 1; // tamaño de la mitad izquierda
        int n2 = derecha - medio;       // tamaño de la mitad derecha

        // Arreglos temporales para guardar los datos
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copiamos los datos a los arreglos temporales
        for (int i = 0; i < n1; i++)
            L[i] = arreglo[izquierda + i];
        for (int j = 0; j < n2; j++)
            R[j] = arreglo[medio + 1 + j];

        // Mezclamos los dos arreglos en orden
        int i = 0, j = 0;
        int k = izquierda;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arreglo[k] = L[i];
                i++;
            } else {
                arreglo[k] = R[j];
                j++;
            }
            k++;
        }

        // Copiamos los elementos restantes (si hay)
        while (i < n1) {
            arreglo[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arreglo[k] = R[j];
            j++;
            k++;
        }
    }

    // Método auxiliar para imprimir el arreglo
    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

    