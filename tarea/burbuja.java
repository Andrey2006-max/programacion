package tarea;


public class burbuja {
public static void main(String[] args) {
        int numeros[] = {4, 1, 2, 3, 5};
        int i, j, aux;

        // Algoritmo de burbuja
        for (i = 0; i < numeros.length - 1; i++) {      // recorre las pasadas
            for (j = 0; j < numeros.length - 1 - i; j++) { // recorre cada par
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        // Imprimir el arreglo ordenado
        System.out.println("Arreglo ordenado:");
        for (i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); // salto de línea final
    }
}