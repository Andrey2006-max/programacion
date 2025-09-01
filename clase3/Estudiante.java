import java.util.ArrayList;

public class Estudiante {
    private int id;
    private String cedula;
    private String nombre;
    private String facultad;
    private ArrayList<Curso> cursosMatriculados = new ArrayList<>();


public Estudiante(int id, String cedula, String nombre, String facultad) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.facultad = facultad;
    }

    // Matricular un estudiante en un curso
    public void matricularEnCurso(Curso c) {
        if(c.matricularEstudiante()) {
            cursosMatriculados.add(c);
            System.out.println(nombre + " se matriculó exitosamente en el curso " + c.getCodigo());
        } else {
            System.out.println("No hay cupos disponibles para " + nombre + " en el curso " + c.getCodigo());
        }
    }

    // Matricular en varios cursos
    public void matricularCursos(Curso[] cursos){
        for(Curso c : cursos){
            matricularEnCurso(c);
        }
    }

    @Override
    public String toString() {
        return "Estudiante [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre +
               ", facultad=" + facultad + ", cursosMatriculados=" + cursosMatriculados + "]";
    }
}
