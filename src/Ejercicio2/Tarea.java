package Ejercicio2;

import java.time.Duration;
import java.time.LocalTime;

public abstract class Tarea {
    protected LocalTime horaInicio;
    protected LocalTime horaFin;
    protected String responsable;
    
    public abstract Duration tiempoTotal();
    public abstract void informe();
}
