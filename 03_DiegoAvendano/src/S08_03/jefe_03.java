package S08_03;

public class jefe_03 {

    // Atributos
    String nombre;
    int edad;
    String genero;
    String departamento;
    double salario;

    // Métodos
    public void dirigir() {
        System.out.println("Dirijo todo el colegio");
    }

    public void mostrarInformacion() {
        System.out.println("Soy el Director");
    }

    // Métodos con valores de retorno
    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerSalario() {
        return salario;
    }
}
