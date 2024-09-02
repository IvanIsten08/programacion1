package Ejercicio2;
import java.time.LocalTime;

public class Ejercicio2 {
    
    public static void main(String[] args){
        OrganizarArchivos organizar = new OrganizarArchivos(LocalTime.of(9, 20), LocalTime.of(12, 10), "Javier");
        LimpiarPiso piso = new LimpiarPiso(LocalTime.of(8, 40), LocalTime.of(11, 30), "Diego");
        HacerInventario inventario = new HacerInventario(LocalTime.of(8, 50), LocalTime.of(12, 45), "Carla");
        
        organizar.informe();
        piso.informe();
        inventario.informe();
        
    }
}
