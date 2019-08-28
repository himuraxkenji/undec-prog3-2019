package interactor;

import excepciones.ClienteExisteException;
import repositorio.IRepositorioCrearCliente;
import modelo.Cliente;

public class CrearClienteUseCase {
    private IRepositorioCrearCliente clienteGateway;

    public CrearClienteUseCase(IRepositorioCrearCliente clienteGateway) {
        this.clienteGateway = clienteGateway;
    }

    public boolean crearCliente(Cliente clienteNuevo) throws ClienteExisteException {

        if (clienteGateway.findByDNI(clienteNuevo.getNumOfDoc()).equals(clienteNuevo))
            throw new ClienteExisteException("El cliente Existe");


        clienteGateway.guardar(clienteNuevo);
        return true;
    }
}
