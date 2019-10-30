package Interactor;

import Exceptions.JugadorExisteException;
import Model.Jugador;
import Repositorio.IRepositorioModificarJugador;

public class ModificarJugadorUseCase {
    private IRepositorioModificarJugador iRepositorioModificarJugador;

    public ModificarJugadorUseCase(IRepositorioModificarJugador iRepositorioModificarJugador) {
        this.iRepositorioModificarJugador = iRepositorioModificarJugador;
    }

    public boolean modificarJugador(Jugador jugador) throws JugadorExisteException {
        if (iRepositorioModificarJugador.findByDNI(jugador.getDocumento()) != null)
            throw new JugadorExisteException("Jugador Existe Exception: El documento del jugador ya se encuentra en uso");
        return iRepositorioModificarJugador.actualizar(jugador);
    }
}
