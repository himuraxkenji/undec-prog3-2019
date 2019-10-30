package Interactor;

import Exceptions.JugadorExisteException;
import Model.Jugador;
import Repositorio.IRepositorioCrearJugador;

public class CrearJugadorUseCase {

    private IRepositorioCrearJugador crearJugadorGateway;

    public CrearJugadorUseCase(IRepositorioCrearJugador crearJugadorGateway) {
        this.crearJugadorGateway = crearJugadorGateway;
    }

    public boolean crearJugador(Jugador elJugador) throws JugadorExisteException {
        if(crearJugadorGateway.findByDocumento(elJugador.getDocumento()) != null)
            throw new JugadorExisteException("Jugador Existe Exception: El jugador tiene dni repetido");

        return crearJugadorGateway.guardar(elJugador);

    }
}
