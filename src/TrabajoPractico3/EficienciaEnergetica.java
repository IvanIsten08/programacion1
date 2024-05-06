package TrabajoPractico3;


import java.util.Scanner;


public class EficienciaEnergetica {

public static double ahorroAnual(double reduccion, double costoConsumo){
    double ahorro = Math.sqrt(reduccion) * costoConsumo * 365;
    return ahorro;
}
    
public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Ingrese el porcentaje de reduccion del consumo: ");
    double reduccion = teclado.nextDouble();
    System.out.println("Ingrese el costo de electricidad  por kWh: ");
    double costoConsumo = teclado.nextDouble();
    
    double ahorroElectricidad = EficienciaEnergetica.ahorroAnual(reduccion, costoConsumo);
    System.out.println("El ahorro energetico anual es: $" + ahorroElectricidad);
    
}    
}
