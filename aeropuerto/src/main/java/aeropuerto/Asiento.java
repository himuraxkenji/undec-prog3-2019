package aeropuerto;

import excepciones.*;

public class Asiento {

	private Integer idAsiento;
	private String numeroAsiento;

	public Asiento(Integer idAsiento, String numeroAsiento) throws AsientoMalFormadoException{
		if (numeroAsiento.length() == 0 )
			throw new AsientoNumeroIncompletoException();

		this.idAsiento = idAsiento;
		this.numeroAsiento = numeroAsiento;
		
	}

	public Integer getId() {
		return this.idAsiento;
	}

	public String getNroAsiento() {
		return this.numeroAsiento;
	}

	public void setNroAsiento(String numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}

}
