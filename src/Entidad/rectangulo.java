
package Entidad;

//Definir
public class rectangulo {
    private int altura;
    private int base;

    //Iniciar y dar valor.
    public rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public rectangulo() {
    }

    //Obtener y almacenar datos
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    
    
}

