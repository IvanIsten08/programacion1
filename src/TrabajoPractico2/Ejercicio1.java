
package TrabajoPractico2;

import java.util.Scanner;


public class Ejercicio1 {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;
    
    //Constructor
    public Ejercicio1 (String nombre, String apellido, int edad, double salario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
    
    //Metodo para mostrar informacion completa del empleado
    public void informacionCompleta(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
    
    //Metodo para mostrar la informacion del empeado sin el salario
    public void informacionSinSalario(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }
        
    //Metodo para incrementar el salario del empleado en una cantidad fija
    public void incrementarSalario(double incremento){
        salario += incremento;
    }
    
    //Metodo para incrementar el salario del empleado en un porcentaje 
    public void incrementarSalario(double incrementoPorcentaje, boolean porcentaje){
        if(porcentaje){
            double incremento = salario * (incrementoPorcentaje / 100);
            salario += incremento;
        }
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = scanner.next();
        
        System.out.println("Ingrese el apellido del empleado: ");
        String apellido = scanner.next();
        
        System.out.println("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();
        
        System.out.println("Ingrese el salario del empleado: ");
        double salario = scanner.nextDouble();
        
        //Crear una instancia de la clase Ejercicio1
        Ejercicio1 empleado = new Ejercicio1(nombre, apellido, edad, salario);
        
        //Mostrar informacion completa del empleado
        System.out.println("Informacion completa del empleado: ");
        empleado.informacionCompleta();
        
        //Mostrar la informacion del empleado sin el salario
        System.out.println("Informacion del empleado sin salario: ");
        empleado.informacionSinSalario();
        
        //Incrementar el salario del empleado en una cantidad fija
        System.out.println("\nEl salario actualizado del empleado es: ");
        empleado.informacionCompleta();
        
        //Incrementar el salario del empleado en un porcentaje
        System.out.println("\nEl salario actualizado del empleado despues del aumento es de: ");
        empleado.informacionCompleta();
        
        scanner.close();
    }
        
    }
    

