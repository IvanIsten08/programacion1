
package Ejercicio3;

import java.time.LocalDate;
import java.time.Period;


public class Electronicos extends Producto implements Garantia{

    private int garantias;
    private LocalDate fechaLimite;

    public Electronicos(String nombre, double precio, LocalDate embalado) {
        super(nombre, precio, embalado);
    }
    
    

    public Electronicos(String nombre, double precio, LocalDate embalado, int garantias) {
        super(nombre, precio, embalado);
        this.garantias = garantias;
    }

    
    public Electronicos( LocalDate fechaLimite, String nombre, double precio, LocalDate embalado) {
        super(nombre, precio, embalado);
       
        this.fechaLimite = fechaLimite;
    }
    
    
    
    
    
    @Override
    public void nombre() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
          }

    @Override
    public void caducidad() {
      LocalDate fechaHoy = LocalDate.now();
      fechaLimite = fechaHoy.plusMonths(garantias);
      
        System.out.println("Usted tiene una garantia de 6 Meses. Su garantia vence en la fecha " + fechaLimite );
    }
    
}
