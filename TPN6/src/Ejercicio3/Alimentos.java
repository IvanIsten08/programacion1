
package Ejercicio3;
import java.lang.String;
import java.time.LocalDate;
import java.time.Period;


public class Alimentos extends Producto implements Vencimiento{

    private LocalDate fechaVencimiento;
    private Period tiempoRestante;
    private LocalDate fechaHoy = LocalDate.now();

    public Alimentos(String nombre, double precio, LocalDate embalado, LocalDate fechaVencimiento) {
        super(nombre, precio, embalado);
        this.fechaVencimiento = fechaVencimiento;
    }

    public Alimentos(LocalDate fechaVencimiento, Period tiempoRestante, String nombre, double precio, LocalDate embalado) {
        super(nombre, precio, embalado);
        this.fechaVencimiento = fechaVencimiento;
        this.tiempoRestante = tiempoRestante;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Period getTiempoRestante() {
        return tiempoRestante;
    }

    public void setTiempoRestante(Period tiempoRestante) {
        this.tiempoRestante = verifVencim();
    }
    
    
    @Override
    public void nombre() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Fecha de embalado: " + embalado);
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
       
    }

    @Override
    public Period verifVencim() {
       LocalDate fechaHoy = LocalDate.now();
       if(fechaVencimiento.isBefore(fechaHoy)){
           System.out.println("El producto esta vencido.");
           tiempoRestante = Period.ZERO;
           return Period.ZERO;  //El producto ya vencio
       }else{
           System.out.println("Falta " + tiempoRestante.getMonths() + "meses y " + tiempoRestante.getDays() + "dias para que venza el producto.");
           tiempoRestante = Period.between(fechaHoy, fechaVencimiento);
           return Period.between(fechaHoy, fechaVencimiento);
       }
    }

    @Override
    public void mostrar() {
        System.out.println("Bu");  
     if(tiempoRestante.isZero()){
            System.out.println("El producto esta vencido.");
        }else{
            System.out.println("Falta " + tiempoRestante.getMonths() + "meses y " + tiempoRestante.getDays() + "dias para que venza el producto.");
        }}

   
   
}
