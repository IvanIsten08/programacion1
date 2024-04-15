package TrabajoPractico1;

import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args){
    
    Scanner scanner = new Scanner (System.in);
    
    System.out.println("Ingrese el dia de la fecha: ");
    int dia = scanner.nextInt();
    
    System.out.println("Ingrese el mes de la fecha: ");
    int mes = scanner.nextInt();
    
    System.out.println("Ingrese el año de la fecha: ");
    int año = scanner.nextInt();
    
    System.out.println("La fecha del Dia:" + dia + " Mes:" + mes + " Año:" + año);
    
    if(mes >= 1 && mes <4){
        System.out.println("La fecha corresponde al primer trimestre del año.");
    }else if(mes >=4 && mes < 7){
        System.out.println("La fecha corresponde al segundo trimestre del año.");
    }else if(mes >= 7 && mes < 10){
        System.out.println("La fecha corresponde al tercer trimestre del año.");
    }else{
        System.out.println("La fecha corresponde al cuarto trimestre del año.");
    }
}    
}
