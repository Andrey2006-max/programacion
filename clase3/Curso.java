public class Curso {
    private String codigo;
    private int cuposDisponibles;

    public Curso(String codigo, int cuposDisponibles) {
        this.codigo = codigo;
        this.cuposDisponibles = cuposDisponibles;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean hayCupos() {
        return cuposDisponibles > 0;
    }

    public boolean matricularEstudiante() {
        if(hayCupos()) {
            cuposDisponibles--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Curso [codigo=" + codigo + ", cuposDisponibles=" + cuposDisponibles + "]";
    }
}

