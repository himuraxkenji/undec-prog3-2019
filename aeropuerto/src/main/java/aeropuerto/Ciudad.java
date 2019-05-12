package aeropuerto;

import excepciones.CiudadMalFormadaException;
import excepciones.IdCiudadIncompletaException;
import excepciones.NombreCiudadIncompletaException;

public class Ciudad {
	
	private Integer idCiudad;
	private String nombre;
	private String codigoPostal;

	public Ciudad(Integer idCiudad, String nombre, String codigoPostal) throws CiudadMalFormadaException {
		if(nombre.length() == 0)
			throw new NombreCiudadIncompletaException();
		if(idCiudad == 0)
			throw new IdCiudadIncompletaException();
		this.idCiudad = idCiudad;
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
	}

	public Ciudad(Integer idCiudad, String nombre) throws CiudadMalFormadaException{
		if(nombre.length() == 0)
			throw new NombreCiudadIncompletaException();
		if(idCiudad == 0)
			throw new IdCiudadIncompletaException();
		this.idCiudad = idCiudad;
		this.nombre = nombre;
	}

	public Integer getIdCiudad() {
		return this.idCiudad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCiudad(String nombre) {
		this.nombre = nombre;
	}
}
