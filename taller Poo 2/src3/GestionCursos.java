import java.util.ArrayList;
import java.util.List;

public class GestionCursos {
    private List<Curso> cursos;

    public GestionCursos() {
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void inscribirEstudianteEnCurso(Estudiante estudiante, Curso curso) {
        curso.inscribirEstudiante(estudiante);
    }

    public void listarEstudiantesEnCurso(Curso curso) {
        curso.listarEstudiantes();
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    
}
