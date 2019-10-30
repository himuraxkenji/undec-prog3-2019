package Repositorio;

import Model.Jugador;

public interface IRepositorioCrearJugador {
    Jugador findByDocumento(String documento);

    Boolean guardar(Jugador jugador);
}
