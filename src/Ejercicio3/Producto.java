package Ejercicio3;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public abstract class Producto {
    
    protected String nombre;
    protected double precio;
    protected LocalDate embalado;

    public Producto(String nombre, double precio, LocalDate embalado) {
        this.nombre = nombre;
        this.precio = precio;
        this.embalado = embalado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getEmbalado() {
        return embalado;
    }

    
    public abstract void nombre();
}
