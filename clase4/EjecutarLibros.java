package clase4;

public class EjecutarLibros {
    public static void main(String[] args) {

        // Crear un arreglo de 5 libros inicializados directamente
        Libro[] biblioteca = new Libro[] {
            new Libro("Cien años de soledad", "Gabriel García Márquez", 75000),
            new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 68000),
            new Libro("El principito", "Antoine de Saint-Exupéry", 55000),
            new Libro("Rayuela", "Julio Cortázar", 72000),
            new Libro("La metamorfosis", "Franz Kafka", 60000)
        };

        // Mostrar cada libro
        System.out.println(" Lista de libros:");
        for (Libro libro : biblioteca) {
            System.out.println(libro);
        }

        // Calcular y mostrar el precio total (CORRECTO: pasar la variable 'biblioteca')
        double total = Libro.calcularPrecioTotal(biblioteca);
        System.out.println("\n Precio total de todos los libros: " + total);
    }
}


