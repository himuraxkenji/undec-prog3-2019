package aeropuerto;

import excepciones.AerolineaMalFormadaException;
import excepciones.AerolineaNombreIncompletoException;

public class Aerolinea {

	private Integer idAerolinea; 
	private String nombre;

	public Aerolinea(Integer idAerolinea, String nombre) throws AerolineaMalFormadaException{
		if(nombre.length() == 0)
			throw new AerolineaNombreIncompletoException();
		this.idAerolinea = idAerolinea;
		this.nombre = nombre;
	}

	public Integer getId() { 
		return this.idAerolinea;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
