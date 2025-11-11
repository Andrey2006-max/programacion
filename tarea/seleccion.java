package tarea;

public class seleccion {
    public static void main(String[] args) {
        int numeros[] = {3,2,1,5,4};
        int i, j, min, aux;
        // Algoritmo de selección
        for (i = 0; i < numeros.length ; i++) {
            min = i;
            for (j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[min]) {
                    min = j;
                }
            }
            // Intercambiar el elemento actual con el mínimo encontrado
            aux = numeros[i];
            numeros[i] = numeros [min];
            numeros [min] = aux;
        }
        // Imprimir el arreglo ordenado
        System.out.println("Arreglo ordenado:");
        for (i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}