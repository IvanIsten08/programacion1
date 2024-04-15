package TrabajoPractico1;

import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Ingrese un numero del 1 al 99: ");
    int numero = scanner.nextInt();
    
    if(numero >=1 && numero < 10){
        System.out.println("El numero ingresado es de un digito.");
    }else if(numero >=10 && numero <100){
        System.out.println("El numero ingresado es de dos digitos.");
    }else{
        System.out.println("El numero ingresado es incorrecto.");
    }
    
    
}    
}
