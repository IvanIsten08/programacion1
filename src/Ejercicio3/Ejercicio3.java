
package Ejercicio3;

import java.time.LocalDate;


public class Ejercicio3 {
    
    public static void main(String[] args){
        Producto prod1 = new Alimentos("Arroz", 1500.00, LocalDate.of(2024,8,2), LocalDate.of(2023,9,24));
        Producto prod2 = new Electronicos("Lavarropas", 300000.00, LocalDate.of(2024,4,30), 6);
        Producto prod3 = new Ropa("Remera", 15000, LocalDate.of(2023,6,12), 3);
        
        
    prod1.nombre();
    prod2.nombre();
    prod3.nombre();
        
    }
}
