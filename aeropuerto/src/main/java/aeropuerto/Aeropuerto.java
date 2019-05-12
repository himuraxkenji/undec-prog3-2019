package aeropuerto;

import excepciones.AerolineaMalFormadaException;
import excepciones.AeropuertoCiudadIncompletaException;
import excepciones.AeropuertoIdIncompletoException;
import excepciones.AeropuertoNombreIncompletoException;

public class Aeropuerto {

	private Integer idAeropuerto;
	private String nombre;
	private Ciudad ciudad;
	private String codigoAeropuerto;

	public Aeropuerto(Integer idAeropuerto, String nombre, Ciudad ciudad, String codigoAeropuerto)throws AerolineaMalFormadaException {
		
		if(idAeropuerto.toString().length() == 0|| idAeropuerto <= 0 || idAeropuerto == null)
			throw new AeropuertoIdIncompletoException();
		if (nombre.length() == 0) 
			throw new AeropuertoNombreIncompletoException();
		if (ciudad == null) 
			throw new AeropuertoCiudadIncompletaException();
		
		this.idAeropuerto = idAeropuerto;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.codigoAeropuerto = codigoAeropuerto;
		
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setCodigoAeropuerto(String codigoAeropuerto) {
		this.codigoAeropuerto = codigoAeropuerto;
	}

	public String getCodigoAeropuerto() {
		return this.codigoAeropuerto;
	}

	public Ciudad getCiudad() {
		return this.ciudad;
	}

	public Integer getId() {
		return this.idAeropuerto;
	}

}
