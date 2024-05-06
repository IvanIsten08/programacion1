
package TrabajoPractico3;

import java.util.Scanner;


public class Password {
    
    public  static boolean contenido(String key, boolean mayor){
        if(key.length()>8){
            mayor = true;
         }
        return true;
         }
    
    public static boolean numerico(String key){
        
        return key.matches(".*\\d.*");
    }
    
    public static boolean caracteres(String key){
        return key.matches(".*[!@#$%^&*].*");
    }
    
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        boolean mayor = false;
        
        System.out.println("Ingrese su contraseña: ");
        String key = teclado.next();
        
        if(Password.contenido(key, mayor)){
        if(Password.numerico(key)){
            if(Password.caracteres(key)){
            System.out.println("Contraseña correcta.");
               } else{
                System.out.println("La contraseña no contiene caracteres.");
               }
             }else{
            System.out.println("La contraseña no contiene numeros.");
               }
          }else{
            System.out.println("La contraseña tiiene menos de 8 caracteres.");
             }
         }
}
