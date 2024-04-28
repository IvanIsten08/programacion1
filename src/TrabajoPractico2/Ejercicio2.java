package TrabajoPractico2;
        
import java.util.Scanner;



public class Ejercicio2{
    
    //Metodo para sumar dos numeros enteros
    public int suma(int a, int b){
        return a + b;
    }            
    
    //Metodo para restar dos numeros enteros
    public int resta(int a, int b){
        return a - b;
    }            
    
    //Metodo para multiplicar dos numeros enteros
    public int multiplicar(int a, int b){
        return a * b;
    }
    
    //Metodo para dividir dos numeros enteros
    public int dividir(int a, int b) throws ArithmeticExcepcion{
        if(b == 0){
            throw new ArithmeticExcepcion("No se puede dividir por cero");
        }
        return a / b;
    }
    
     //Metodo para sumar dos numeros decimales
    public double suma(double a, double b){
        return a + b;
    }            
    
    //Metodo para restar dos numeros decimales
    public double resta(double a, double b){
        return a - b;
    }            
    
    //Metodo para multiplicar dos numeros decimales
    public double multiplicar(double a, double b){
        return a * b;
    }
    
    //Metodo para dividir dos numeros decimales
    public double dividir(double a, double b) throws ArithmeticExcepcion{
        if(b == 0){
            throw new ArithmeticExcepcion("No se puede dividir por cero");
        }
        return a / b;
    }
    
    



public static void main(String[] args) throws ArithmeticExcepcion{
Scanner scanner = new Scanner(System.in);
Ejercicio2 operaciones = new Ejercicio2();

    System.out.println("Ingrese el primero numero entero: ");
    int entero1 = scanner.nextInt();
    System.out.println("Ingrese el segundo numero entero: ");
    int entero2 = scanner.nextInt();
    System.out.println("Ingrese el primer primer numero decimal: ");
    double decimal1 = scanner.nextDouble();
    System.out.println("Ingrese el segundo numero decimal: ");
    double decimal2 = scanner.nextDouble();
    
    System.out.println("La suma de los numeros enteros es: " + operaciones.suma(entero1, entero2));
    System.out.println("La suma de los numeros decimales es de: " + operaciones.suma(decimal1, decimal2));
    System.out.println("La resta de los numeros enteros es de: " + operaciones.resta(entero1, entero2));
    System.out.println("La resta de los numeros decimales es de: " + operaciones.resta(decimal1, decimal2));
    System.out.println("La multiplicacion de los numeros enteros es de: " + operaciones.multiplicar(entero1, entero2));
    System.out.println("La multiplicacion de los numeros decimales es de: " + operaciones.multiplicar(decimal1, decimal2));
    System.out.println("La division de los numeros enteros es de: " + operaciones.dividir(entero1, entero2));
    System.out.println("La division de los numeros decimales es de: " + operaciones.dividir(decimal1, decimal2));


        
}
}