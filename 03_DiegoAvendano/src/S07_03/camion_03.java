
package S07_03;

public class camion_03 {
    // Atributos
    String marca;
    String modelo;
    int año;
    String color;
    double capacidadCarga;

    // Métodos
    public void cargarMercancía() {
        System.out.println("llevo cosas de la ferreteria");
    }

    public void descargarMercancía() {
        
    }

    // Sobrecarga de métodos
    public void cambiarColor(String nuevoColor) {
        System.out.println("el camion lo compre de color "+nuevoColor);
    }

    public void cambiarColor(String nuevoColor, double nuevaCapacidad) {
        
    }

    // Métodos con valores de retorno
    public String obtenerMarcaModelo() {
        return marca + " " + modelo;
    }

    public double obtenerCapacidadCarga() {
        return capacidadCarga;
    }
}
