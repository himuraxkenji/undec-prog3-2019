package gestor;
import aeropuerto.*;
import excepciones.CiudadMalFormadaException;

import java.util.*;
public class GestorCiudad {
	
	private List<Ciudad> listaDeCiudades;
	private static GestorCiudad miGestor;
	private static Integer codigoCiudad;
	
	private GestorCiudad() {
		listaDeCiudades = new ArrayList<Ciudad>();
	} 
	
	public static GestorCiudad getInstancia() {
		if(miGestor == null) {
			miGestor = new GestorCiudad();
			return miGestor;
		}else {
			return miGestor;
		}
	}

	public Boolean crearCiudad(String nombreCiudad, String codigoPostal) {
		Ciudad ciudadNueva = null;
		 
		try {
			codigoCiudad = listaDeCiudades.size() + 1;
			ciudadNueva = new Ciudad(codigoCiudad, nombreCiudad, codigoPostal);
			listaDeCiudades.add(ciudadNueva);
			return true; 
		} catch (CiudadMalFormadaException e) {
//			System.out.println(e.getMessage());
		}
		
		return false;
	}

	public Boolean crearCiudad(String nombreCiudad) {
		Ciudad ciudadNueva = null;
		
		try {
			codigoCiudad = listaDeCiudades.size() + 1;
			ciudadNueva = new Ciudad(codigoCiudad, nombreCiudad);
			listaDeCiudades.add(ciudadNueva);
			return true;
		} catch (CiudadMalFormadaException e) {
//			System.out.println(e.getMessage());
		}
		return false;
	}

	public Boolean modificarNombreCiudad(Integer idCiudad, String nombreNuevoCiudad) {
		
		for (Ciudad ciudad : listaDeCiudades) {
			if(ciudad.getIdCiudad() == idCiudad) {
				ciudad.setCiudad(nombreNuevoCiudad);
				return true;
			}
		}
		return false;
	}

	public Boolean borrarCiudad(Integer codigoCiudad) {
		return listaDeCiudades.remove(listaDeCiudades.get(codigoCiudad-1));
	}

	public Ciudad traerUnaCiudad(Integer codigoCiudad) {
		return listaDeCiudades.get(codigoCiudad-1);
	}
	
	public List<Ciudad> traerTodasLasCiudades() {
		return listaDeCiudades;
	}

	public List<Ciudad>  traerCiudadPorNombre(String nombreCiudad) {
		List<Ciudad> ciudadesSolicitadas = new ArrayList<Ciudad>();
		
		for (Ciudad ciudad : listaDeCiudades) {
			if(ciudad.getNombre().equals(nombreCiudad))
				ciudadesSolicitadas.add(ciudad);
		}
		
		return ciudadesSolicitadas;
	}

	public boolean borrarTodasLasCiudades() {
		return listaDeCiudades.removeAll(listaDeCiudades);
	}

}
