package aeropuerto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import excepciones.VueloCodigoIncompletoException;
import excepciones.VueloFechaHoraSalidaIncompletaException;
import excepciones.VueloMalFormadoException;
import excepciones.VuelofechaHoraArriboException;

public class Vuelo {

	private String codigoVuelo;
	private Aeropuerto salida, arribo;
	private LocalDateTime fechaHoraSalida, fechaHoraArribo;
	private Aerolinea aerolinea;
	private List<Piloto> pilotos;
	private Avion unAvion;
	private List<Asignacion> pasajeros;
	
	public Vuelo(String codigoVuelo, Aeropuerto salida, LocalDateTime fechaHoraSalida, Aeropuerto arribo,
			LocalDateTime fechaHoraArribo, Aerolinea aerolinea, List<Piloto> pilotos, Avion unAvion,
			List<Asignacion> pasajeros) throws VueloMalFormadoException{
		
		if (codigoVuelo.length() == 0) 
			throw new VueloCodigoIncompletoException();
		if(fechaHoraSalida == null)
			throw new VueloFechaHoraSalidaIncompletaException();
		if(fechaHoraArribo == null)
			throw new VuelofechaHoraArriboException();
		
		this.codigoVuelo = codigoVuelo;
		this.salida = salida;
		this.arribo = arribo;
		this.fechaHoraSalida = fechaHoraSalida;
		this.fechaHoraArribo = fechaHoraArribo;
		this.aerolinea = aerolinea;
		this.pilotos = new ArrayList<Piloto>();
		this.pilotos = pilotos;
		this.unAvion = unAvion;
		this.pasajeros = new ArrayList<Asignacion>();
		this.pasajeros = pasajeros;
	}

	public String getCodigoVuelo() {
		return this.codigoVuelo;
	}

	public Aeropuerto getSalida() {
		return this.salida;
	}

	public LocalDateTime getFechaHoraSalida() {
		return this.fechaHoraSalida;
	}

	public LocalDateTime getFechaHoraArribo() {
		return this.fechaHoraArribo;
	}

	public Aeropuerto getArribo() {
		return this.arribo;
	}

	public Aerolinea getAerolinea() {
		return this.aerolinea;
	}

	public List<Piloto> getPilotos() {
		return this.pilotos;
	}

	public Avion getAvion() {
		return this.unAvion;
	}

	public List<Asignacion> getAsignaciones() {
		return this.pasajeros;
	}

	public void anadirPasajero(Asignacion nuevoPasajero) {
		this.pasajeros.add(nuevoPasajero);
	}

}
