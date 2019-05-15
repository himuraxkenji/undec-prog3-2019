package gestor;

import java.util.*;

import aeropuerto.Aerolinea;
import excepciones.AerolineaMalFormadaException;

public class GestorAerolinea {
	
	private List<Aerolinea> listaDeAerolineas;
	private static Integer codigoAerolinea;
	private static GestorAerolinea gestorDeAerolinea;
	
	private GestorAerolinea() {
		this.listaDeAerolineas = new ArrayList<Aerolinea>();
	}
	
	public static GestorAerolinea getInstancia() {
		if(gestorDeAerolinea == null)
			gestorDeAerolinea = new GestorAerolinea();
		return gestorDeAerolinea;
	}

	public boolean crearAerolinea(String nombre) {
		Aerolinea unaAerolinea = null;
		try {
			codigoAerolinea = listaDeAerolineas.size()+1;
			unaAerolinea = new Aerolinea(codigoAerolinea, nombre);
			return listaDeAerolineas.add(unaAerolinea);
		}catch (AerolineaMalFormadaException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public boolean modificarAerolinea(Integer codigoAerolinea, String nombre) {
		listaDeAerolineas.get(codigoAerolinea-1).setNombre(nombre);
		return true;
	}

	public boolean borrarAerolinea(Integer codigoAerolinea) {
		listaDeAerolineas.get(codigoAerolinea-1);
		return true;
	}

	public Aerolinea traerUnaAerolinea(Integer codigoAerolinea) {
		return listaDeAerolineas.get(codigoAerolinea-1);
	}

	public List<Aerolinea> traerTodasLasAerolineas() {
		return listaDeAerolineas;
	}

	public boolean borrarTodasLasAerolineas() {
		return listaDeAerolineas.removeAll(listaDeAerolineas);
	}

}