public class Persona {
    public String nombre ;
    public int edad;

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    public String getnombre(){
        return nombre;
    }
    public int getedad(){
        return edad;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public void setedad(int edad){
        this.edad = edad;
    }
    


}
