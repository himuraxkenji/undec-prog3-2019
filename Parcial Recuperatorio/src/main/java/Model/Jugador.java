package Model;

import Exceptions.JugadorIncompletoException;

import java.time.LocalDate;
import java.time.Period;

public class Jugador {


    private Integer idJugador;
    private String nombre;
    private LocalDate fechaNacimiento;
    private double estatura;
    private String documento;

    public Jugador(Integer idJugador, String nombre, LocalDate fechaNacimiento, Double estatura, String documento) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estatura = estatura;
        this.documento = documento;
    }


    public static Jugador instancia(Integer idJugador, String nombre, LocalDate fechaNacimiento, Double estatura, String documento) throws JugadorIncompletoException {
        if(nombre == null)
            throw new JugadorIncompletoException("Jugador Incompleto Exception: El nombre no puede ser nulo");
        if(nombre.length() == 0)
            throw new JugadorIncompletoException("Jugador Incompleto Exception: El nombre no estar vacio");
        if(fechaNacimiento == null)
            throw new JugadorIncompletoException("Jugador Incompleto Exception: La fechaNacimiento no puede ser nula");
        if(estatura == null)
            throw new JugadorIncompletoException("Jugador Incompleto Exception: La estatura no puede ser nula");
        if(estatura == 0)
            throw new JugadorIncompletoException("Jugador Incompleto Exception: La estatura no puede ser 0");

        return new Jugador(idJugador,nombre,fechaNacimiento, estatura, documento);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jugador)) return false;

        Jugador jugador = (Jugador) o;

        return documento.equals(jugador.documento);
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Integer getEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public double getEstatura() {
        return this.estatura;
    }
}
