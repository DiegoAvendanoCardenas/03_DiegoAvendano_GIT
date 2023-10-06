package S06_03;

public class estudiante_03 {
    //Atributos
    String nombres;
    int edad;
    String genero;
    String pais;
    String curso;
    double calificacion;


    // Métodos
    public void carrera() {
        System.out.println("Estudio Analisis de sistemas");
    }

    public void mostrarInformacion() {
        
    }

    // Sobrecarga de métodos
    public void inscribirEnCurso(String nuevoCurso) {
        System.out.println("llevo el curso "+nuevoCurso);
    }

    public void inscribirEnCurso(String nuevoCurso, double nuevaCalificacion) {
  
    }
    // Métodos con valores de retorno
    public String obtenerSaludo() {
        return "hola me llamo" + nombres + "";
    }

    public double obtenerPromedio() {
        return calificacion;
    }
}
