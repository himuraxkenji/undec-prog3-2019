package Repositorio;

import Model.Jugador;

public interface IRepositorioModificarJugador {
    Jugador findByDNI(String s);

    boolean actualizar(Jugador messiDatosNuevos);
}
