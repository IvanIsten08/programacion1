
package TrabajoPractico2;


import java.util.Scanner;


public class Ejercicio4 {
    
    //Metodo para calcular el perimetro
public int perimetro(int a, int b){
int perimetro = a * 2 + b * 2;
 return perimetro;
}
//Metodo para calcular el perimetro de un circulo
public double perimetroCirc(double a){
    
    double perimetro = 2 * 3.14 * a;
    return perimetro;
}
//metodo para calcular el area 
public int area(int a, int b){
    
    int area = a * b;
    return area;
}

//Metodo para calcular el area de un circulo
public double areaCirc(double a){
    
    double area = 3.14 * (a * a);
    return area;
}


public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Ejercicio4 calculo = new Ejercicio4();
    
    
    System.out.println("Ingrese el valor de los lados de un cuadrado: ");
    int cuadrado = scanner.nextInt();
    System.out.println("Ingrese el valor de la base de un rectangulo: ");
    int baseRectangulo = scanner.nextInt();
    System.out.println("Ingrese la altura del rectangulo: ");
    int alturaRectangulo = scanner.nextInt();
    System.out.println("Ingrese el radio de un circulo: ");
    int radio = scanner.nextInt();
    
    System.out.println("El perimetro del cuadrado es: " + calculo.perimetro(cuadrado, cuadrado));
    System.out.println("El perimetro del rectangulo es: " + calculo.perimetro(baseRectangulo, alturaRectangulo));
    System.out.println("El perimetro del circulo es: " + calculo.perimetroCirc(radio));
    System.out.println("\nEl area del cuadrado es: " + calculo.area(cuadrado, cuadrado));
    System.out.println("El area del rectangulo es: " + calculo.area(baseRectangulo, alturaRectangulo));
    System.out.println("El area del circulo es: " + calculo.areaCirc(radio));
}


}
