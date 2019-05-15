package gestor;
import aeropuerto.*;
import excepciones.PasajeroMalFormadoException;

import java.util.*;

public class GestorPasajeros {
	
	private static GestorPasajeros gestorDePasajeros;
	private List<Pasajero> listaPasajeros; 
	private static Integer codigoPasajero;
	
	private GestorPasajeros() {
		listaPasajeros = new ArrayList<Pasajero>();
		
	}
	
	
	public static GestorPasajeros getInstancia() {
		if(gestorDePasajeros == null)
			gestorDePasajeros = new GestorPasajeros();
		return gestorDePasajeros;
	}


	public boolean crearPasajero( String cuil, String apellido, String nombres, String telefono) {
		Pasajero unPasajero = null;
		
		try {
			codigoPasajero = listaPasajeros.size() + 1;
			unPasajero = new Pasajero(codigoPasajero, cuil, apellido, nombres,telefono);
			listaPasajeros.add(unPasajero);
			return true;
		}catch(PasajeroMalFormadoException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	
	public boolean crearPasajero( String cuil, String apellido, String nombres) {
		Pasajero unPasajero = null;
		
		try {
			codigoPasajero = listaPasajeros.size() + 1;
			unPasajero = new Pasajero(codigoPasajero, cuil, apellido, nombres);
			listaPasajeros.add(unPasajero);
			return true;
		}catch(PasajeroMalFormadoException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public boolean modificarCuilPasajero(Integer codigoPasajero, String cuilNuevo) {
		 listaPasajeros.get(codigoPasajero-1).setCuil(cuilNuevo);
		 return true; 
	}
	
	public boolean modificarApellidoPasajero(Integer codigoPasajero, String apellidoNuevo) {
		 listaPasajeros.get(codigoPasajero-1).setApellido(apellidoNuevo);
		 return true; 
	}
	
	public boolean modificarNombrePasajero(Integer codigoPasajero, String nombreNuevo) {
		 listaPasajeros.get(codigoPasajero-1).setNombre(nombreNuevo);
		 return true; 
	}

	public List<Pasajero> traerTodosLosPasajeros(){
		return this.listaPasajeros;
	}


	public Pasajero traerUnPasajero(Integer codigoPasajero) {
		return listaPasajeros.get(codigoPasajero-1);
	}


	public boolean modificarTelefonoPasajero(Integer codigoPasajero, String telefono) {
		listaPasajeros.get(codigoPasajero-1).setTelefono(telefono);
		return true; 
	}


	public boolean borrarPasajero(Integer codigoPasajero) {
		return listaPasajeros.remove(listaPasajeros.get(codigoPasajero-1));
	}
	
	public List<Pasajero> traerPasajeroPorCuil(String cuil) {
		List<Pasajero> listaDePasajerosPorCuil= new ArrayList<Pasajero>();
		
		for (Pasajero pasajero : listaPasajeros) {
			if(pasajero.getCuil().equals(cuil))
				listaDePasajerosPorCuil.add(pasajero);
		}
		
		return listaDePasajerosPorCuil;
	}

	public List<Pasajero> traerPasajeroPorApellido(String apellido) {
		
		List<Pasajero> listaDePasajerosPorApellido= new ArrayList<Pasajero>();
		for (Pasajero pasajero : listaPasajeros) {
			if(pasajero.getApellido().equals(apellido))
				listaDePasajerosPorApellido.add(pasajero);
		}
		return listaDePasajerosPorApellido;
	}


	public List<Pasajero> traerPasajeroPorNombre(String nombre) {
		List<Pasajero> listaDePasajerosPorNombre = new ArrayList<Pasajero>();
		for (Pasajero pasajero : listaPasajeros) {
			if(pasajero.getNombre() == nombre)
				listaDePasajerosPorNombre.add(pasajero);
		}
		return listaDePasajerosPorNombre;
	}


	


	
}
