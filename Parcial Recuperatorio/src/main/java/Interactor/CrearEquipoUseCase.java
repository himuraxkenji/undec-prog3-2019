package Interactor;

import Exceptions.EquipoExisteException;
import Model.Equipo;
import Repositorio.IRepositorioCrearEquipo;

public class CrearEquipoUseCase {

    private IRepositorioCrearEquipo crearEquipoGateway;

    public CrearEquipoUseCase(IRepositorioCrearEquipo crearEquipoGateway) {
        this.crearEquipoGateway = crearEquipoGateway;
    }

    public boolean crearEquipo(Equipo equipoNuevo) throws EquipoExisteException {
        if(crearEquipoGateway.findByNombre(equipoNuevo.getNombre()) != null)
            throw new EquipoExisteException("Equipo Existe Exception: El nombre de equipo se encuentra en uso");
        return crearEquipoGateway.guardar(equipoNuevo);
    }
}
