
package TrabajoPractico3;


public class InteresCompuesto {
    
    public static double interesAnual(double capital, double tasaAnual){
        double ganancias = capital * (tasaAnual /  100);
        return ganancias;
    }
    
    public static void main(String[] args){
    
        double tasaAnual= 6; //La tasa anual por año que se generara la inversion
        double capital = 10000; //El monto del capital con el que se desea invertir
        int tiempo = 5; //Los años que se desean caclular    
        double interes  = InteresCompuesto.interesAnual(capital, tasaAnual);    
        
          //Si se desea calcular la inversion en 5 años
        double interesPeriodico = interes * tiempo;
        
        System.out.println("La inversion anual es de: " + interes);
        System.out.println("La inversion despues de 5 años redondeando seria de " + Math.round(interesPeriodico));
        
    }
    
}
