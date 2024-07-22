import java.util.ArrayList;

public class GestionEmpleados {
    private ArrayList<Empleado> listaEmpleados;

    public GestionEmpleados() {
        this.listaEmpleados = new ArrayList<>();
    }
    public void agregarEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }
     // Método para eliminar empleados por idEmpleado
     public void eliminarEmpleado(int idEmpleado) {
        // Utilizando un bucle for-each para buscar y eliminar el empleado
        listaEmpleados.removeIf(empleado -> empleado.getIdEmpleado() == idEmpleado);
    }

    // Método para mostrar todos los empleados
    public void mostrarEmpleados() {
        // Utilizando un bucle for-each para recorrer y mostrar cada empleado
        for (Empleado empleado : listaEmpleados) {
            System.out.println("Nombre: " + empleado.getnombre());
            System.out.println("Edad: " + empleado.getedad());
            System.out.println("ID Empleado: " + empleado.getIdEmpleado());
            System.out.println("Salario: " + empleado.getSalario());
            System.out.println("--------------------------------------");
        }
    }
    
        
}
