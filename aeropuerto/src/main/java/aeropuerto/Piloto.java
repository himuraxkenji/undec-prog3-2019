package aeropuerto;

import java.time.LocalDate;

import excepciones.*;

public class Piloto {

	private Integer idPiloto;
	private String apellido;
	private String nombres;
	private String dni;
	private LocalDate fechaNacimiento;

	public Piloto(Integer idPiloto, String apellido, String nombres, String dni, LocalDate fechaNacimiento)throws PilotoMalFormadoException{
		if(apellido.length() == 0)
			throw new PilotoApellidoIncompletoException();
		if(nombres.length() == 0)
			throw new PilotoNombreIncompletoException();
		if(dni.length() == 0)
			throw new PilotoDNIIncompletoException();
		
		this.idPiloto = idPiloto;
		this.apellido = apellido;
		this.nombres = nombres;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento; 
	}

	public Piloto(Integer idPiloto, String apellido, String nombres, String dni )throws PilotoMalFormadoException {
		if(apellido.length() == 0)
			throw new PilotoApellidoIncompletoException();
		if(nombres.length() == 0)
			throw new PilotoNombreIncompletoException();
		if(dni.length() == 0)
			throw new PilotoDNIIncompletoException();
		
		this.idPiloto = idPiloto;
		this.apellido = apellido;
		this.nombres = nombres;
		this.dni = dni;
		this.fechaNacimiento = LocalDate.of(1,1,1);
	}

	public Integer getId() {
		return this.idPiloto;
	}

	public String getApellido() {
		return this.apellido;
	}

	public String getNombres() {
		return this.nombres;
	}

	public String getDni() {
		return this.dni;
	}

	public String getFechaNacimiento() {
		return this.fechaNacimiento.toString();
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public void setDNI(String dni) {
		this.dni = dni;
	}

	public void setFechaNacimiento(LocalDate fechaNacimientoPiloto) {
		this.fechaNacimiento = fechaNacimientoPiloto;
	}
	

}
