public class Estudiante {
    public int id;
    public String nombreEstudiante;
    public String Email;
    public Estudiante(int id, String nombreEstudiante, String email) {
        this.id = id;
        this.nombreEstudiante = nombreEstudiante;
        this.Email = email;
    }
    public int getId() {
        return id;
    }
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }
    public String getEmail() {
        return Email;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }
    public void setEmail(String email) {
        this.Email = email;
    }
    
    

    
}
