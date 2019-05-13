package aeropuerto;

import java.util.ArrayList;
import java.util.List;

import excepciones.AsientoMalFormadoException;
import excepciones.AvionCantidadAsientoCeroIncompletoException;
import excepciones.AvionMalFormadoException;
import excepciones.AvionMatriculaIncompletaException;
import excepciones.AvionModeloIncompletoException;

public class Avion {

	private Integer idAvion;
	private String modelo;
	private String matricula;
	private List<Asiento> listaAsientos;

	public Avion(Integer idAvion, String modelo, String matricula, int cantidadAsientos) throws AvionMalFormadoException{
		if(modelo.length() == 0)
			throw new AvionModeloIncompletoException();
		if(matricula.length() == 0)
			throw new AvionMatriculaIncompletaException();
		if (cantidadAsientos < 2) 
			throw new AvionCantidadAsientoCeroIncompletoException();
		this.idAvion = idAvion;
		this.modelo = modelo;
		this.matricula = matricula;
		this.listaAsientos = new ArrayList<Asiento>();
		addAsiento(cantidadAsientos);
		
	}

	public Integer getId() {
		return this.idAvion;
	}

	public String getModelo() {
		return this.modelo;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public List<Asiento> getAsientos() {
		return this.listaAsientos;
	}

	private void addAsiento(int cantidadAsientos) {
		for (int i = 0; i < cantidadAsientos; i++) {
			try {
				listaAsientos.add(new Asiento(i+1, "00"+(i+1)));
			} catch (AsientoMalFormadoException e) {
				e.printStackTrace();
			}
		}
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setCantidadAsientos(int cantidadAsientos) {
		listaAsientos.removeAll(listaAsientos);
		addAsiento(cantidadAsientos);
	}
	
	

}
