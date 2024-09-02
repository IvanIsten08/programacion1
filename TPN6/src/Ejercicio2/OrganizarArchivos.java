package Ejercicio2;

import java.time.LocalTime;


public class OrganizarArchivos extends Tarea{

    public OrganizarArchivos(LocalTime horaInicio, LocalTime horaFin, String responsable) {
        super(horaInicio, horaFin, responsable);
    }

    @Override
    public void informe() {
        System.out.println("Encargado: " + responsable);
        System.out.println("Hora de inicio: " + horaInicio);
        System.out.println("Hora de fin: " + horaFin);
        System.out.println("Tiempo para realizar la tarea: " + tiempoTotal() + " minutos");
    }
    
    
}
