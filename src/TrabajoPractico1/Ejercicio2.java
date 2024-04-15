package TrabajoPractico1;

import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Ingrese la nota del primer parcial: ");
    int parcial1 = scanner.nextInt();
    
    System.out.println("Ingrese la nota del segundo parcial: ");
    int parcial2 = scanner.nextInt();
    
    System.out.println("Ingrese la nota del tercer parcial: ");
    int parcial3 = scanner.nextInt();
    
    int promedio = (parcial1 + parcial2 + parcial3) / 3;
    System.out.println("Su promedio es de : " + promedio);
    
    if(promedio <8){
        System.out.println("Usted no promociono la materia.");
    }else{
        System.out.println("Usted promociono la materia.");
    }
    
}    
}
