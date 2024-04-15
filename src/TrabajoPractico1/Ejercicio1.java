package TrabajoPractico1;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args){
    
    Scanner scanner = new Scanner (System.in);
    
    System.out.println("Ingrese la calificacion de la materia: ");
    int nota = scanner.nextInt();
    
    if(nota<4){
        System.out.println("Usted desaprobo la materia.");
    }else if(nota >= 4 && nota <10){
        System.out.println("Usted aprobo la materia.");
        }else if(nota == 10){
        System.out.println("Usted tiene una nota sobresaliente con calificacion de 10.");
    }else{
            System.out.println("La nota ingresada es invalida.");
        }   
    
}    
}
