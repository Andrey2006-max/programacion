public class EjecutarEstudiantes {
    public static void main(String[] args) {
        // Crear cursos con cupos limitados
        Curso curso1 = new Curso("MAT101", 2); // 2 cupos
        Curso curso2 = new Curso("FIS101", 1); // 1 cupo
        Curso curso3 = new Curso("QUI101", 3); // 3 cupos

        // Crear estudiantes 
        Estudiante est1 = new Estudiante(1, "123456789", "Andrey", "Ingeniería");
        Estudiante est2 = new Estudiante(2, "987654321", "Isabel", "Ingeniería");
        Estudiante est3 = new Estudiante(3, "555555555", "Carlos", "Ingeniería");
        Estudiante est4 = new Estudiante(4, "222333444", "Laura", "Ingeniería");

        // Lista de estudiantes
        Estudiante[] estudiantes = {est1, est2, est3, est4};

        // Cursos a matricular
        Curso[] cursosParaMatricular = {curso1, curso2, curso3};

        // Matricular cada estudiante
        for (Estudiante e : estudiantes) {
            e.matricularCursos(cursosParaMatricular);
            System.out.println(); // salto de línea para claridad
        }

        // Mostrar estado final de todos los estudiantes
        System.out.println("----- ESTADO FINAL DE ESTUDIANTES -----");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }

        // Mostrar estado final de los cursos
        System.out.println("\n----- ESTADO FINAL DE CURSOS -----");
        Curso[] cursos = {curso1, curso2, curso3};
        for (Curso c : cursos) {
            System.out.println(c);
        }
    }
}



      //Actividad independiente
        //implementar el metodo matricular cursos para que cada estudiante pueda realizar dicha operación.