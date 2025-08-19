public class Estudiante
// atributos
private int id;
private int cedula
private String nombre;
private String faculta

// CONSTRUTOR
public Estudiante(int id, int cedula, String nombre, String facultad){
    this.id = id;
    this.cedula = cedula;
    this.nombre = nombre;
    this.facultad = facultad;

   }

    // Metodo toString
    public String toString(){
        return" Estudiante: [id: "+ id +" cedula:" + cedula + " nombre: " + nombre + " facultad: " + facultad + "]" ]
    }