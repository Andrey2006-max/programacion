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

   public static double calcularPrecioTotal(Libro[] libros) {
    double total = 0; 
    if (libros == null) return 0;
    
    for (int i = 0; i < libros.length; i++) {
        if (libros[i] != null) {
            total += libros[i].getPrecio(); 
        }
    }
    return total; 
}      

    @Override
    public String toString() {
        return "Libro [titulo = " + titulo + ", autor = " + autor + ", precio = " + precio + "]";
    }
}

