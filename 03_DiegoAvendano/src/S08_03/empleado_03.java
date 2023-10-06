package S08_03;

public class empleado_03 {
    // Atributos
    String nombre;
    int edad;
    String genero;
    String departamento;
    double salario;

    // Métodos
    public void trabajar() {
        System.out.println("Trabajo en un colegio secundaria");
    }

    public void mostrarInformacion() {
        System.out.println("Soy un docente");
    }

    // Sobrecarga de métodos
    public void cambiarDepartamento(String nuevoDepartamento) {
        
    }

    public void cambiarDepartamento(String nuevoDepartamento, double nuevoSalario) {
        
    }

    // Métodos con valores de retorno
    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerSalario() {
        return salario;
    }
}
