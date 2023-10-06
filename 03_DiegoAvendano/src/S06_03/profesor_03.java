package S06_03;

public class profesor_03 {

    // Atributos
    String nombres;
    int edad;
    String genero;
    String pais;
    String especialidad;
    double salario;

    
    // Métodos
    public void enseñar() {
        System.out.println("Enseño POO");
    }

    public void mostrarInformacion() {
        // Mostrar información del profesor
    }

    // Sobrecarga de métodos
    public void asignarSalario(double nuevoSalario) {
        System.out.println("tengo un salario de "+nuevoSalario+" soles");
    }

    public void asignarSalario(double nuevoSalario, boolean aumento) {
       
    }

    // Métodos con valores de retorno
    public String obtenerSaludo() {
        return "hola soy el profesor " + nombres;
    }

    public double obtenerSalario() {
        return salario;
    }
}
