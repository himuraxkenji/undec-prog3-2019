package gestor;
import aeropuerto.*;
import excepciones.AsientoMalFormadoException;
import excepciones.AsignacionMalFormadaException;

import java.util.*;

public class GestorAsignacion {
	
	private List<Asignacion> listaDeAsignaciones;
	private static GestorAsignacion gestorDeAsignaciones; 
	
	private GestorAsignacion() {
		this.listaDeAsignaciones = new ArrayList<Asignacion>();
	}
	
	public static GestorAsignacion getInstancia() {
		if (gestorDeAsignaciones == null) 
			gestorDeAsignaciones = new GestorAsignacion();
			
		return gestorDeAsignaciones;
	}

	public boolean crearAsignacion(Pasajero pasajero, Asiento asiento) {
		Asignacion unaAsignacion = null;
		
		for (Asignacion asignacion : listaDeAsignaciones) {
			if (asiento.getNroAsiento().equals(asignacion.getAsiento().getNroAsiento()) ) {
				
				return false;
			}
		}
		String codigoAsignacion = generaCodigoAsignacion(pasajero, asiento);
		try {
			unaAsignacion = new Asignacion(pasajero, asiento, codigoAsignacion);
			return listaDeAsignaciones.add(unaAsignacion);
		} catch (AsientoMalFormadoException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	private String generaCodigoAsignacion(Pasajero pasajero, Asiento asiento) {
		String cod = asiento.getNroAsiento() + "-";
		cod+= pasajero.getApellido().substring(0,1);
		cod+= pasajero.getNombre().substring(0,1) + "-";
		cod+= pasajero.getCuil().substring(0,2);
		return cod;
	}

	public boolean modificarAsignacionAsiento(String codigoAsignacion, Asiento asiento) {
		
		for (Asignacion asignacion : listaDeAsignaciones) {
			if (asignacion.getCodigoAsignacion().equals(codigoAsignacion)) {
				asignacion.setAsiento(asiento);
				String cod = generaCodigoAsignacion(asignacion.getPasajero(),asignacion.getAsiento());
				asignacion.setCodigoAsignacion(cod);
				return true;
			}
		}
		
		return false;
	}

	

	public boolean modificarAsignacionCuilPasajero(String codigoAsignacion, Pasajero pasajero) {
		for (Asignacion asignacion : listaDeAsignaciones) {
			if (asignacion.getCodigoAsignacion().equals(codigoAsignacion)) {
				asignacion.setPasajero(pasajero);;
				String cod = generaCodigoAsignacion(asignacion.getPasajero(),asignacion.getAsiento());
				asignacion.setCodigoAsignacion(cod);
				return true;
			}
		}
		return false;
	}

	public boolean borrarAsignacion(String codigoAsignacion) {
		for (Asignacion asignacion : listaDeAsignaciones) {
			if (asignacion.getCodigoAsignacion().equals(codigoAsignacion)) {
				return listaDeAsignaciones.remove(asignacion);
			}
		}
		return false;
	}
	public Asignacion traerUnaAsignacion(String codigoAsignacion) {
		for (Asignacion asignacion : listaDeAsignaciones) {
			if (asignacion.getCodigoAsignacion().equals(codigoAsignacion)) {
				return asignacion;
			}
		}
		return null;
	}
	public List<Asignacion> traerTodasLasAsignacion() {
		return listaDeAsignaciones;
	}

	public List<Asignacion> traerAsignacionApellido(String apellido) {
		List<Asignacion> porApellido = new ArrayList<Asignacion>();
		for (Asignacion asignacion : listaDeAsignaciones) {
			if(asignacion.getPasajero().getApellido().equals(apellido))
				porApellido.add(asignacion);
		}
		return porApellido;
	}

	public boolean borrarTodasLasAsignaciones() {
		return listaDeAsignaciones.removeAll(listaDeAsignaciones);
	}

}
