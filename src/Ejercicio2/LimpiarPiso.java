package Ejercicio2;

import java.time.Duration;
import java.time.LocalTime;

public class LimpiarPiso extends Tarea{

    public LimpiarPiso() {
    }

    
    @Override
    public Duration tiempoTotal() {
      return Duration.between(horaInicio, horaFin);
    }

    @Override
    public void informe() {
        System.out.println("El trabajo todavia no se realizo.");    }
    
}
