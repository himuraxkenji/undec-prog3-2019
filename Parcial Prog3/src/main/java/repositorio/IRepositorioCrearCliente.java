package repositorio;

import modelo.Cliente;

public interface IRepositorioCrearCliente {
    Boolean guardar(Cliente clienteNuevo);

    Cliente findByDNI(String dni);
}
