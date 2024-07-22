import java.util.ArrayList;
public class App {
    public static void main(String[] args) {
        
        GestionCursos gestionCursos = new GestionCursos();

        
        Estudiante estudiante1 = new Estudiante(1, "Juan Pérez", "juan@example.com");
        Estudiante estudiante2 = new Estudiante(2, "María López", "maria@example.com");

        ArrayList<Estudiante> estudiantesCurso1 = new ArrayList<>();
        estudiantesCurso1.add(estudiante1);
        estudiantesCurso1.add(estudiante2);

        
        Curso curso1 = new Curso(1, "Programación Java", estudiantesCurso1);

        gestionCursos.agregarCurso(curso1);

        gestionCursos.inscribirEstudianteEnCurso(estudiante1, curso1);
        gestionCursos.inscribirEstudianteEnCurso(estudiante2, curso1);

        gestionCursos.listarEstudiantesEnCurso(curso1);
    }
}
