
package S08_03;

public class Main_S08_03 {
    public static void main(String[] args) {
        empleado_03 objEmpleado  = new empleado_03();
        objEmpleado.mostrarInformacion();
        objEmpleado.trabajar();
        
        jefe_03 objJefe  = new jefe_03();
        objJefe.dirigir();
        objJefe.mostrarInformacion();
    }
}
