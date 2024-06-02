package TrabajoPractico4;


public class Entrenador extends Persona{
    public int experiencia;
    public String titulo;
    public String equipo_perteneciente;



    public Entrenador(int experiencia, String titulo, String equipo_perteneciente, String nombre, int edad) {
        super(nombre, edad);
        this.experiencia = experiencia;
        this.titulo = titulo;
        this.equipo_perteneciente = equipo_perteneciente;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEquipo_perteneciente() {
        return equipo_perteneciente;
    }

    public void setEquipo_perteneciente(String equipo_perteneciente) {
        this.equipo_perteneciente = equipo_perteneciente;
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
