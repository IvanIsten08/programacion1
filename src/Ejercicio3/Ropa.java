
package Ejercicio3;

import java.time.LocalDate;


public class Ropa extends Producto implements RopaTalle{

    private int talle;

    public Ropa(String nombre, double precio, LocalDate embalado, int talle) {
        super(nombre, precio, embalado);
        this.talle = talle;
    }

    public Ropa(int talle, String nombre, double precio, LocalDate embalado) {
        super(nombre, precio, embalado);
        this.talle = talle;
    }
    
    
    @Override
    public void nombre() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
    }

    @Override
    public void mostrar() {
         System.out.println("Talle: " + talle);     
    }
    
}
