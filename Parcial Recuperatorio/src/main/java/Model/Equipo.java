package Model;



import Exceptions.EquipoIncompletoException;

import java.util.ArrayList;
import java.util.Collection;

public class Equipo {

    private Integer idEquipo;
    private String nombre;
    private Collection<Jugador> jugadores;

    public Equipo(Integer idEquipo, String nombre, ArrayList<Jugador> jugadores) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }


    public static Equipo instancia(Integer idEquipo, String nombre, ArrayList<Jugador> jugadores) throws EquipoIncompletoException {
        if(nombre == null)
            throw new EquipoIncompletoException("Equipo Incompleto Exception: El nombre del equipo no puede ser null");
        if(nombre.length() == 0)
            throw new EquipoIncompletoException("Equipo Incompleto Exception: El nombre del equipo no puede estar vacio");

        return new Equipo(idEquipo,nombre,jugadores);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipo)) return false;

        Equipo equipo = (Equipo) o;

        return nombre.equals(equipo.nombre);
    }

    public boolean addJugador(Jugador elJugador) {
        if(!jugadores.contains(elJugador))
            return jugadores.add(elJugador);
        return false;
    }

    public String getNombre() {
        return this.nombre;
    }
}
