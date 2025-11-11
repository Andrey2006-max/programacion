package tarea;

public class insercion {
    public static void main(String[] args) {
        int numeros[] = {4, 1, 2, 3, 5};
        int i, j, aux;

        // Algoritmo de inserción
        for (i = 1; i < numeros.length; i++) {  // Comienza desde el segundo elemento
            aux = numeros[i];
            j = i - 1;

            // Mover los elementos que son mayores que aux una posición adelante
            while (j >= 0 && numeros[j] > aux) {
                numeros[j + 1] = numeros[j];
                j--;
            }

            // Insertar el elemento en su posición correcta
            numeros[j + 1] = aux;
        }

        // Imprimir el arreglo ordenado
        System.out.println("Arreglo ordenado:");
        for (i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); // salto de línea final
    }
}

