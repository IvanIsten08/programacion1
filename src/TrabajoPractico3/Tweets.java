package TrabajoPractico3;

import java.util.Scanner;


public class Tweets {
    
    public static boolean longitudTweet(String tweet){
        return tweet.length() <= 280;
    }
    
    public static String hashtag(String tweet, String hashtag){
        return tweet + "#programacion";
    }
    
   
    
    public static String extraerUsuario(String tweet){
        int arroba = tweet.indexOf('@');
        
        if(arroba != -1){
            int indiceEspacio = tweet.indexOf(' ', arroba);
            int indicePuntuacion = tweet.indexOf(':', arroba);
            
            int indiceFinal = Math.min(indiceEspacio != -1 ? indiceEspacio : Integer.MAX_VALUE, indicePuntuacion != -1 ? indicePuntuacion : Integer.MAX_VALUE);
            return tweet.substring(arroba + 1, indiceFinal);
        }
        
        return null;
     }
     
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
         System.out.println("Ingrese un nuevo Tweet (No mayor a 280 caracteres) : ");
         String tw = teclado.next();
         System.out.println("Ingrese su usuario(Tiene que comenzar con un '@'): ");
         String usuario = teclado.next();
         String usuarioFinal = "@" + usuario;
         String tweet = usuarioFinal + tw;
         
         
         if(longitudTweet(tweet)){
             System.out.println("El tweet cumple con el limite de 280 caracteres.");
         }else{
             System.out.println("El tweet excede el limite de 280 caracteres.");
         }
         
         String tweetHashtag = hashtag(tweet, "programacion");
         
         String nombreUsuario = extraerUsuario(tweet);
         if(nombreUsuario != null){
             System.out.println("Nombre de usuario: " + nombreUsuario);
         }else{
             System.out.println("No se encontro ningun nombre de usuario en el tweet.");
         }
         
    }
   
    
}
