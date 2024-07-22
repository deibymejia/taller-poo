public class App{
    public static void main(String[] args) {
        // Creación de objetos de ejemplo
        EmpleadoTemporal et1 = new EmpleadoTemporal(30,"juan", 1, 2000.0);
        EmpleadoPermanente ep1 = new EmpleadoPermanente( 35,"maria", 2, 3000.0);

        // Creación de gestor de empleados
        GestionEmpleados gestionEmpleados = new GestionEmpleados();

        // Agregar empleados al gestor
        gestionEmpleados.agregarEmpleado(et1);
        gestionEmpleados.agregarEmpleado(ep1);

        // Mostrar empleados
        System.out.println("Lista de empleados:");
        gestionEmpleados.mostrarEmpleados();

        // Eliminar un empleado por idEmpleado
        gestionEmpleados.eliminarEmpleado(1);

        // Mostrar empleados después de eliminar
        System.out.println("Lista de empleados después de eliminar:");
        gestionEmpleados.mostrarEmpleados();
    }
}    
        


