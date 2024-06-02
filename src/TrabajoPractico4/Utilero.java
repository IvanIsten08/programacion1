package TrabajoPractico4;


public class Utilero extends Persona{
    public int experiencia;
    public String funciones;
    public String categoria;

    public Utilero(int experiencia, String funciones, String categoria, String nombre, int edad) {
        super(nombre, edad);
        this.experiencia = experiencia;
        this.funciones = funciones;
        this.categoria = categoria;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
