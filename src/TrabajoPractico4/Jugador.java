package TrabajoPractico4;


public class Jugador extends Persona{
    
    public String posicion;
    public int dorsal;
    public int goles;

    public Jugador(String posicion, int dorsal, int goles, String nombre, int edad) {
        super(nombre, edad);
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.goles = goles;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
