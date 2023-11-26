
package tallerj;

import Servicios.servicio;


public class TAllerj {

    //Vista donde el usuario ve lo que pide.
    //Con el fin de que el usuario nunca acceda a los datos.
    public static void main(String[] args) {
        servicio ser = new servicio();
        ser.crearRectangulo();
        ser.perimetro();
        ser.superficie();
        ser.crearRectangulo();
    }
}
