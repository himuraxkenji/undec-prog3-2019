package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AvionUnitTest {

	@Test
	public void instanciarAvion_TodosLosAtributos_InstanciaCorrecta() {
		
		List<Asiento> asientosAvion = new ArrayList<Asiento>();
		asientosAvion.add(new Asiento(1, "001"));
		asientosAvion.add(new Asiento(2, "002"));
		asientosAvion.add(new Asiento(3, "003"));
		
		Avion unAvion = new Avion(1, "Boeing", "A81SA", asientosAvion);
			
		assertEquals(1, unAvion.getId());
		assertEquals("Boeing", unAvion.getModelo());
		assertEquals("A81SA", unAvion.getMatricula());
		assertEquals("eze1234", unAeropuerto.getCodigo());	
	}
	
	
	@Test
	public void instanciarAvion_FaltaModelo_ModeloAvionIncompletoException() {
		
		List<Asiento> asientosAvion = new ArrayList<Asiento>();
		asientosAvion.add(new Asiento(1, "001"));
		asientosAvion.add(new Asiento(2, "002"));
		asientosAvion.add(new Asiento(3, "003"));
		
		Assertions.assertThrows(ModeloAvionIncompletoException.class, ()->{
			Avion unAvion = new Avion(1, "", "A81SA", asientosAvion);
		});
	}
	
	@Test
	public void instanciarAvion_FaltaMatricula_MatriculaAvionIncompletoException() {
		
		List<Asiento> asientosAvion = new ArrayList<Asiento>();
		asientosAvion.add(new Asiento(1, "001"));
		asientosAvion.add(new Asiento(2, "002"));
		asientosAvion.add(new Asiento(3, "003"));
		
		Assertions.assertThrows(ModeloAvionIncompletoException.class, ()->{
			Avion unAvion = new Avion(1, "Boeing", "", asientosAvion);
		});
	}
	
	@Test
	public void instanciarAvion_FaltaAsientos_AsientosAvionIncompletoException() {
		Assertions.assertThrows(ModeloAvionIncompletoException.class, ()->{
			Avion unAvion = new Avion(1, "Boeing", "A990999", null);
		});
	}
	
	@Test
	public void ModificarNumeroAsiento_TodosLosAtributos_InstanciaCorrecta() {
		List<Asiento> asientosAvion = new ArrayList<Asiento>();
		asientosAvion.add(new Asiento(1, "001"));
		asientosAvion.add(new Asiento(2, "002"));
		asientosAvion.add(new Asiento(3, "003"));
		
		Avion unAvion = new Avion(1, "Boeing", "A81SA", asientosAvion);
			
		assertEquals(1, unAvion.getId());
		assertEquals("Boeing", unAvion.getModelo());
		assertEquals("A81SA", unAvion.getMatricula());
		assertEquals("eze1234", unAeropuerto.getCodigo());	
	}
}
