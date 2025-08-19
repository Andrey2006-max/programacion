public class EjecutarEstudiante{
    public static void main(String[] args) {
        
          //Creacion de los objetos
          Estudiante objEst1 = new Estudiante(1,1006720569,"Angelica","Ingenieria");
          Estudiante objEst2 = new  Estudiante(2,1001256512,"Andrey","Ingenieria");
          Estudiante objEst3 = new  Estudiante(3,1107842802,"Sandra","Ingenieria");

          System.out.println(objEst1);

          //creacion del arreglo de objetos (estudiantes)
          Estudiante[] e = new Estudiante[3];
          e[0] = objEst1;
          e[1] = objEst2;
          e[2] = objEst3;
          e[3] = new Estudiante(4,1008940941,"peter","ingenieria");
    }
}