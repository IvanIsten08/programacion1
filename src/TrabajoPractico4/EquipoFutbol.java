package TrabajoPractico4;

import java.util.ArrayList;
import java.util.List;


public class EquipoFutbol {
    private String nombre;
    private String ciudad;
    private List<Jugador> jugadores;
    private List<Persona> cuerpoTecnico;

    public EquipoFutbol(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.jugadores = new ArrayList<>();
        this.cuerpoTecnico = new ArrayList<>();
    }
    
    public void concentrar(){
        System.out.println("Equipo concentrando.");
    }
    
    public void viajar(){
        System.out.println("Equipo viajando.");
    }
    
    public void jugarPartido(){
            System.out.println(nombre + " esta jugando un partido.");
}
    
    public void entrenar(){
        System.out.println(nombre +" esta entrenando.");
    }
    
    public void agregarCuerpoTecnico(Persona persona){
        cuerpoTecnico.add(persona);
    }
    
    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }
    
    public void eliminarJugador(Jugador jugador){
        String borrado = jugador.nombre;
        jugadores.remove(jugador);
        System.out.println("Jugador eliminado: "+ borrado);
    }
    
    public void mostrarJugador(){
        for(Jugador j: jugadores){
            System.out.println("Nombre: "+j.getNombre() +" Posicion: " +j.getPosicion() +" Goles: "+ j.getGoles());
        }
    }
    
    
    public static void main(String[] args){
        
    
    //Creacion de jugadores
    Jugador j1 = new Jugador("Arquero",1,0,"Iker Casillas", 28);
    Jugador j2 = new Jugador("Defensa",2, 1, "Gabriel Otamendi", 33);
    Jugador j3 = new Jugador("Defensa",3, 6, "Marcelo Vieira", 36);
    Jugador j4 = new Jugador("Defensa",4, 0, "Alexander Arnold", 28);
    Jugador j5 = new Jugador("Mediocampista",5, 1, "Sergio Busquets", 36);
    Jugador j6 = new Jugador("Defensa",6, 2, "Cuti Romero", 31);
    Jugador j7 = new Jugador("Delantero",7, 38, "Cristiano Ronaldo", 39);
    Jugador j8 = new Jugador("Mediocampista",8, 7, "Andres Iniesta", 37);
    Jugador j9 = new Jugador("Delantero",9, 26, "Julian Alvarez", 24);
    Jugador j10 = new Jugador("Mediocampista",10, 42, "Lionel Messi", 37);
    Jugador j11 = new Jugador("Delantero",11, 29, "Neymar Jr", 35);
    Jugador j12 = new Jugador("Arquero",12, 0, "Ter Stegen", 33);
    Jugador j13 = new Jugador("Defensa",13, 5, "Gonzalez Pirez", 29);
    Jugador j14 = new Jugador("Defensa",13, 4, "Milton Casco", 28);
    Jugador j15 = new Jugador("Mediocampista",13, 9, "Claudio Echeverri", 21);
    Jugador j16 = new Jugador("Delantero",13, 1, "Miguel Borja", 25);
    
    //Creacion de los integrantes del cuerpo tecnico
    Entrenador entrenador = new Entrenador(4, "Tecnico Deportivo Superior en Futbol", "Manchester City", "Pep Guardiola", 41);
    Entrenador ayudanteDeCampo = new Entrenador(2, "Tecnico Deportivo en Futbol", "River PLate", "Pablo Aimar", 43);
    Masajista masajista = new Masajista(6, "Tecnico en Salud Deportiva", "Traumotologia", "Paula Videz", 38);
    Utilero utilero = new Utilero(5, "Mantenimiento y limpieza de la indumentaria, accesorios y pelotas, incluyendo kit medico.", "principal", "Diego Maradona", 54);
    
    
    //Creacion del equipo
    EquipoFutbol equipo = new EquipoFutbol("F.C.Programacion", "Concepcion");
    
    //Agregar jugadores al equipo
    equipo.agregarJugador(j1);
    equipo.agregarJugador(j2);
    equipo.agregarJugador(j3);
    equipo.agregarJugador(j4);
    equipo.agregarJugador(j5);
    equipo.agregarJugador(j6);
    equipo.agregarJugador(j7);
    equipo.agregarJugador(j8);
    equipo.agregarJugador(j9);
    equipo.agregarJugador(j10);
    equipo.agregarJugador(j11);
    equipo.agregarJugador(j12);
    equipo.agregarJugador(j13);
    equipo.agregarJugador(j14);
    equipo.agregarJugador(j15);
    equipo.agregarJugador(j16);
    
    //Creacion del cuerpo Tecnico
    equipo.agregarCuerpoTecnico(entrenador);
    equipo.agregarCuerpoTecnico(ayudanteDeCampo);
    equipo.agregarCuerpoTecnico(utilero);
    equipo.agregarCuerpoTecnico(masajista);
    
    //mostrar jugadores ordenados por posicion
    equipo.mostrarJugador();
    
    //Acciones del equipo
    equipo.concentrar();
    equipo.viajar();
    equipo.jugarPartido();
    equipo.entrenar();
    
    //Para eliminar un jugador
    equipo.eliminarJugador(j13);
    
    
    
            }
}
