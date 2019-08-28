package modelo;

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
                                         Cliente elCliente, LocalDate fechaService, String detalle, Float precio) {
        if (!fechaService.isBefore(LocalDate.now()))

     }
}
