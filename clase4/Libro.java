package clase4;

public class Libro {
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    // Filtrar por precio
    public static void filtrarPorPrecio(Libro[] libros, double precioMinimo) {
        for (Libro libro : libros) {
            if (libro.getPrecio() > precioMinimo) {
                System.out.println(libro);
            }
        }
    }

    // Ordenar con burbuja
    public static void ordenarPorPrecio(Libro[] libros) {
        for (int i = 0; i < libros.length - 1; i++) {
            for (int j = 0; j < libros.length - 1 - i; j++) {
                if (libros[j].getPrecio() > libros[j + 1].getPrecio()) {
                    Libro temp = libros[j];
                    libros[j] = libros[j + 1];
                    libros[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " ($" + precio + ")";
    }
}
