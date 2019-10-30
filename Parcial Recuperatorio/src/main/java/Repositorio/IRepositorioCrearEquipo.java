package Repositorio;

import Model.Equipo;

public interface IRepositorioCrearEquipo {
    Equipo findByNombre(String nombre);

    Boolean guardar(Equipo equipo);
}
