
package S06_03;

public class Main_S06_03 {
    public static void main(String[] args) {
        estudiante_03 objEstudiante = new estudiante_03();
        
        objEstudiante.inscribirEnCurso("Programacion orientada a objetos");
        objEstudiante.carrera();
        
        
        profesor_03 objProfesor = new profesor_03();
        
        objProfesor.enseñar();
        objProfesor.asignarSalario(1600.00);
        
    }
}
