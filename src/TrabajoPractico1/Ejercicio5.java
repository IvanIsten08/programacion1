
package TrabajoPractico1;

import java.util.Scanner;

public class Ejercicio5 {

public static void main(String[] args){
    
    Scanner scanner = new Scanner (System.in);
    
    System.out.println("Ingrese los valores de X que sea distinto a 0: ");
    int x = scanner.nextInt();
    
    System.out.println("Ingrese los valores de Y que sea distinto a 0: ");
    int y = scanner.nextInt();
    
    if(x >= 1 && y >= 1){
        System.out.println("El punto se encuentra en el primer cuadrante");
    }else if(x < 0 && y > 0){
        System.out.println("El punto se encuentra en el segundo cuadrante");
    }else if(x < 0 && y < 0){
        System.out.println("El punto se encuentra en el tercer cuadrante");
    }else{
        System.out.println("El punto se encuentra en el cuarto cuadrante");
    }
     
    
}    
}
