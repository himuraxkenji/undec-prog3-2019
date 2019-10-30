package Interactor;

import Model.Equipo;
import Repositorio.IRepositorioObtenerEquipo;

public class ObtenerPromedioEstaturaEquipoUseCase {
    private IRepositorioObtenerEquipo iRepositorioObtenerEquipo;

    public ObtenerPromedioEstaturaEquipoUseCase(IRepositorioObtenerEquipo iRepositorioObtenerEquipo) {
        this.iRepositorioObtenerEquipo = iRepositorioObtenerEquipo;

    }

    public double obtenerPromedioEstatura(Equipo elEquipo) {
        return Math.round(this.iRepositorioObtenerEquipo.obtenerEquipoPorNombre(elEquipo.getNombre()).obtenerPromedioEstatura()*100.0)/100.0;
    }
}
