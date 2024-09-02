package Ejercicio1;

import java.util.Scanner;


public class Camara extends Dispositivo{

    public Camara() {
    }

    
    @Override
    protected void encender() {
        System.out.println("El dispositivo esta encendido.");    }

    @Override
    protected void apagar() {
        System.out.println("El dispositivo esta apagado.");    }

    @Override
    protected boolean condicion() {
          Scanner scanner = new Scanner(System.in);
      while(activar == 1 || activar == 0){
        System.out.println("Para encender la camara presione 1, para apagar presione 0: ");
            System.out.println("(Si desea salir presione cualquier otra tecla)");
        activar = scanner.nextInt();
        if(activar == 1){
            return estado = true;
        }else{
            return estado = false;
        }
       
        }
      return estado;
    }
    
}
