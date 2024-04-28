import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio3 {
    
    // Método para calcular días transcurridos hasta la fecha actual desde la fecha ingresada
    public int calcularDiasTranscurridos(String fecha) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Establecer el formato de la fecha
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Cambiar el tipo de variable ingresado a formato de fecha
        LocalDate fechaIngresada = LocalDate.parse(fecha, formatter);
        
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();
        
        // Calcular los días transcurridos entre las fechas
        int diasTranscurridos = (int) Math.abs(fechaActual.toEpochDay() - fechaIngresada.toEpochDay());
        
        // Cerrar el scanner
        scanner.close();
        
        // Retornar los días transcurridos
        return diasTranscurridos;
    }
    
    // Método para determinar si un año es bisiesto
    public boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }



    public static void main(String[] args) {
        Ejercicio3 manejador = new Ejercicio3();
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese la fecha en formato "dd/mm/yyyy"
        System.out.print("Ingrese la fecha (formato dd/mm/yyyy): ");
        String fechaIngresada = scanner.next();
        
        // Calcular los días transcurridos desde la fecha ingresada hasta la actual
        int diasTranscurridos = manejador.calcularDiasTranscurridos(fechaIngresada);
        
        // Mostrar los días transcurridos
        System.out.println("Días transcurridos desde " + fechaIngresada + " hasta hoy: " + diasTranscurridos);
        
        // Obtener el año de la fecha ingresada
        int anio = LocalDate.parse(fechaIngresada, DateTimeFormatter.ofPattern("dd/MM/yyyy")).getYear();
        
        // Determinar si el año ingresado es bisiesto
        boolean esBisiesto = manejador.esBisiesto(anio);
        System.out.println("El año " + anio + " es bisiesto: " + esBisiesto);
        
        // Cerrar el scanner
        scanner.close();
    }
}