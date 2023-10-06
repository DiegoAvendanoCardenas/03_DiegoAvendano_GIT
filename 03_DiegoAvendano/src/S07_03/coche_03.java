
package S07_03;

public class coche_03 {
    // Atributos
    String marca;
    String modelo;
    int año;
    String color;
    double precio;

    // Métodos
    public void acelerar() {  
        System.out.println("Mi coche va a una velocidad 200 km/h");
    }

    public void frenar() {  
    }

    // Sobrecarga de métodos
    public void cambiarColor(String nuevoColor) {
        System.out.println("Mi coche es de color "+nuevoColor);  
    }

    public void cambiarColor(String nuevoColor, double nuevoPrecio) {
    }

    // Métodos con valores de retorno
    public String obtenerMarcaModelo() {
        return marca + " " + modelo;
    }

    public double obtenerPrecio() {
        return precio;
    }
}
