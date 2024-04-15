
package TrabajoPractico1;

import java.util.Scanner;

public class Ejercicio6 {
    
    public static String tipoDeTriangulo(double lado1, double lado2, double lado3){
        if(lado1==lado2 && lado1 != lado3 || lado1==lado3 && lado1 != lado2 || lado2==lado3 && lado2 != lado1){
            return "El triangulo es isosceles";
        }else if(lado1==lado2 && lado1==lado3){
            return "El triangulo es equilatero";
        }else{
            return "El triangulo es escaleno";
        }
    }
    
    
public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    int contIso = 0;
    int contEsca = 0;
    int contEqui = 0;
    System.out.println("Ingrese la cantidad de triangulos que desea examinar: \n");
    int cantTriang = scanner.nextInt();
    
    for(int i = 1; i<=cantTriang;i++){
        System.out.println("Para el triangulo " + i + ":");
        System.out.println("Ingrese la longitud del primer lado: ");
        double lado1 = scanner.nextDouble();
        System.out.println("Ingrese la longitud del segundo lado: ");
        double lado2 = scanner.nextDouble();
        System.out.println("Ingrese la longitud del tercer lado: ");
        double lado3 = scanner.nextDouble();
        
        if(lado1==lado2 && lado1 != lado3 || lado1==lado3 && lado1 != lado2 || lado2==lado3 && lado2 != lado1){
            contIso++;
        }else if(lado1 == lado2 && lado1 == lado3){
            contEqui++;
        }else if(lado1 != lado2 && lado1 != lado3){
            contEsca++;
        }
        
        String tipo = tipoDeTriangulo(lado1,lado2,lado3);
        System.out.println("" + tipo);
    }
    System.out.println("La cantidad de triangulos equilateros es de: " + contEqui);
    System.out.println("La cantidad de triangulos isosceles es de: " + contIso);
    System.out.println("La cantidad de triangulos escalenos es de: " + contEsca);
    
}    
}
