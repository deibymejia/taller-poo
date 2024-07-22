import  java.util.ArrayList;
public class Curso{
    public int codigo;
    public String nombre;
    private ArrayList<Estudiante> listaEstudiantes; 
    public Curso(int codigo, String nombre, ArrayList<Estudiante> listaEstudiantes) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaEstudiantes = new ArrayList<>();

    }
     public void inscribirEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    public void listarEstudiantes() {
        System.out.println("Estudiantes inscritos en el curso " + nombre + ":");
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println("ID: " + estudiante.getId() + ", Nombre: " + estudiante.getNombreEstudiante() + ", Email: " + estudiante.getEmail());
        }
    }
}

