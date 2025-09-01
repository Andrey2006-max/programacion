package clase4;

import java.util.Scanner;

public class EjecutarLibros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Libro[] biblioteca = {
            new Libro("Cien años de soledad", "Gabriel García Márquez", 75000),
            new Libro("Don Quijote", "Miguel de Cervantes", 68000),
            new Libro("El principito", "Antoine de Saint-Exupéry", 55000),
            new Libro("Rayuela", "Julio Cortázar", 72000),
            new Libro("La metamorfosis", "Franz Kafka", 60000)
        };

        System.out.println(" Lista de libros:");
        for (Libro l : biblioteca) System.out.println(l);

        System.out.print("\n Ingresa un precio mínimo: ");
        double minimo = sc.nextDouble();
        System.out.println("\n Libros con precio mayor a " + minimo + ":");
        Libro.filtrarPorPrecio(biblioteca, minimo);

        Libro.ordenarPorPrecio(biblioteca);
        System.out.println("\n Libros ordenados por precio:");
        for (Libro l : biblioteca) System.out.println(l);

        sc.close();
    }
}
