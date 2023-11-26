
package Servicios;

import Entidad.rectangulo;
import java.util.Scanner;

    //Donde se hace todas las operaciones y peticiones del usuario.
public class servicio {
    Scanner leer = new Scanner (System.in);
    rectangulo recta = new  rectangulo();
    
    //Petición de valores
    public rectangulo crearRectangulo(){
        System.out.println("Ingresar la base");
        recta.setBase(leer.nextInt());
        System.out.println("");
        System.out.println("Ingresar la altura");
        recta.setAltura(leer.nextInt());
        return null;
    }///
    
    //Metodos que hacen las operaciones con los datos.
    public void superficie(){
    int base = recta.getBase();
    int altura = recta.getAltura();
    int superficie = base * altura;
        System.out.println("La superficie es:"+superficie);
    }//Fin void
    
    public void perimetro(){
    int base = recta.getBase();
    int altura = recta.getAltura();
    int perimetro = base + altura *2;
        System.out.println("El perimetro es:"+perimetro);
    }//Fin void
    
    public void dibujarRectangulo(){
    int altura = recta.getAltura();
    int base = recta.getBase();
    
        //Ciclo donde se crea el rectangulo con i y j,
        //son como el x and y de un plano carteciano.
        for (int i = 0; i<altura; i++) {
            for (int j = 0; j<base; j++) {
                System.out.print("*");
            } 
            System.out.println();
        }
    }//Fin void
}
