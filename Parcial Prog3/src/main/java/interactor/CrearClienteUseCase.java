package interactor;

import excepciones.ClienteExisteException;
import repositorio.IRepositorioCrearCliente;
import modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class CrearClienteUseCase {
    private IRepositorioCrearCliente clienteGateway;
    private List<Cliente> clientes;
    public CrearClienteUseCase(IRepositorioCrearCliente clienteGateway) {
        this.clienteGateway = clienteGateway;
        this.clientes = new ArrayList<Cliente>();
    }

    public boolean crearCliente(Cliente clienteNuevo) throws ClienteExisteException {
        for (Cliente c: clientes) {
            if (c.equals(clienteNuevo))
                throw new ClienteExisteException("El cliente Existe");

        }
        return clientes.add(clienteNuevo);

    }
}
