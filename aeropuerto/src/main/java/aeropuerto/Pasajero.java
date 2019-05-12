package aeropuerto;

import excepciones.*;

public class Pasajero {
	
	
	private Integer idPasajero;
	private String cuil;
	private String apellido;
	private String nombre;
	private String telefono = "No Cargado";

	public Pasajero(Integer idPasajero, String cuil, String apellido, String nombre, String telefono) throws PasajeroMalFormadoException{
		
		if(cuil.length() == 0)
			throw new PasajeroCuilIncompletoException();
		if(apellido.length() == 0)
			throw new PasajeroApellidoIncompletoException();
		if(nombre.length() == 0)
			throw new PasajeroNombreIncompletoException();
		
		this.idPasajero = idPasajero;
		this.cuil = cuil;
		this.apellido = apellido;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public Pasajero(Integer idPasajero, String cuil, String apellido, String nombre) throws PasajeroMalFormadoException{
		if(cuil.length() == 0)
			throw new PasajeroCuilIncompletoException();
		if(apellido.length() == 0)
			throw new PasajeroApellidoIncompletoException();
		if(nombre.length() == 0)
			throw new PasajeroNombreIncompletoException();
		this.idPasajero = idPasajero;
		this.cuil = cuil;
		this.apellido = apellido;
		this.nombre = nombre;
	}

	public Integer getId() {
		return this.idPasajero;
	}

	public String getCuil() {
		return this.cuil;
	}

	public String getApellido() {
		return this.apellido;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	

}
