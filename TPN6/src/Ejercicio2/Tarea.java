package Ejercicio2;
import java.time.Duration;
import java.time.LocalTime;

public abstract class Tarea {
    protected LocalTime horaInicio;
    protected LocalTime horaFin;
    protected String responsable;

    public Tarea(LocalTime horaInicio, LocalTime horaFin, String responsable) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.responsable = responsable;
    }
    
    
    
    public long tiempoTotal(){
        return Duration.between(horaInicio, horaFin).toMinutes();
    }
    public abstract void informe();
}
