package modelo;

import excepciones.VehiculoIncompletoException;

public class Vehiculo {
    private Integer idVehiculo;
    private String marca;
    private String matricula;
    private Integer year;

    private Vehiculo(Integer idVehiculo, String marca, String matricula, Integer year) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.matricula = matricula;
        this.year = year;
    }

    public static Vehiculo factoryVehiculo(Integer idVehiculo, String marca, String patente, Integer year) throws VehiculoIncompletoException {
        if (patente == null || patente.length() == 0)
            throw new VehiculoIncompletoException(" VehiculoIncompletoException: Patente Incompleta");

        return new Vehiculo(idVehiculo, marca, patente, year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo)) return false;

        Vehiculo vehiculo = (Vehiculo) o;

        return matricula != null ? matricula.equals(vehiculo.matricula) : vehiculo.matricula == null;
    }

    public String mostrarVehiculo() {
        return this.marca + " modelo " + this.year + " - Patente " + this.matricula;
    }
}
