package Ejercicio1;


public abstract class Dispositivo {
    
    protected String nombre;
    protected int activar;
    protected boolean estado;
    
    protected abstract void encender();
    protected abstract void apagar();
    protected abstract boolean condicion();
}
