package Ejercicio1;

import java.util.Scanner;


public class Ejercicio1 {
    
    public static void main(String[] args){
        Dispositivo sensor = new Sensor();
        Dispositivo camaraSeg = new Camara();
        Dispositivo altavocesInt = new Altavoces();
        Scanner teclado = new Scanner(System.in);
        
        
        sensor.nombre = "Sensor de Temperatura";
        System.out.println(sensor.nombre);
        sensor.condicion();
        if(sensor.estado == true){
            sensor.encender();
        }else{
            sensor.apagar();
        }
        
        camaraSeg.nombre = "Camara de Seguridad";
        System.out.println(camaraSeg.nombre);
        camaraSeg.condicion();
        if(camaraSeg.estado == true){
            camaraSeg.encender();
        }else{
            camaraSeg.apagar();
        }
        
        altavocesInt.nombre = "Altavoces Inteligentes";
        System.out.println(altavocesInt.nombre);
        altavocesInt.condicion();
        if(altavocesInt.estado == true){
                 altavocesInt.encender();        
        }else{
            altavocesInt.apagar();
        }
        
    }
}
