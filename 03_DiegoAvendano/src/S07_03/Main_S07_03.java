
package S07_03;

public class Main_S07_03 {
    public static void main(String[] args) {
        coche_03 objCoche = new coche_03();
        objCoche.acelerar();
        objCoche.cambiarColor("Negro");
        
        camion_03 objCamion = new camion_03();
        
        objCamion.cambiarColor("Amarillo");
        objCamion.cargarMercancía();
    }
}
