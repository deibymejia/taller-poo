public class  Empleado extends Persona{
    private double idEmpleado;
    private double salario;
    
    public Empleado(int edad, String nombre, double idEmpleado, double salario) {
        super(edad, nombre);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
    }

    public double getIdEmpleado() {
        return idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setIdEmpleado(double idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }



    
}
