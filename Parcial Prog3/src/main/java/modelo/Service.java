package modelo;

import excepciones.ServiceIncompletoException;

import java.time.LocalDate;

public class Service {
    private Integer id;
    private Vehiculo elVehiculo;
    private Cliente elCliente;
    private LocalDate fechaService;
    private String detalle;

    public Service(Integer id, Vehiculo elVehiculo, Cliente elCliente, LocalDate fechaService, String detalle, Float precio) {
        this.id = id;
        this.elVehiculo = elVehiculo;
        this.elCliente = elCliente;
        this.fechaService = fechaService;
        this.detalle = detalle;
        this.precio = precio;
    }

    private Float precio;


    public static Service factoryService(Integer id, Vehiculo elVehiculo,
                                         Cliente elCliente, LocalDate fechaService, String detalle, Float precio) throws ServiceIncompletoException {
        if (!fechaService.isBefore(LocalDate.now()))
            throw new ServiceIncompletoException("Fecha Mayor a la actual");
        return new Service(id, elVehiculo,  elCliente, fechaService,  detalle, precio);

    }

    public String mostrarResumen() {
        return "Service Nro: " + this.id + "\nCliente: " + this.elCliente + "\nVehiculo: " + this.elVehiculo + "\nTrabajo Realizado: " + this.detalle;
    }
}