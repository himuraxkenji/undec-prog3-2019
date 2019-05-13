package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import excepciones.AsientoMalFormadoException;
import excepciones.AvionCantidadAsientoCeroIncompletoException;
import excepciones.AvionMalFormadoException;
import excepciones.AvionMatriculaIncompletaException;
import excepciones.AvionModeloIncompletoException;

class AvionUnitTest {
	
	
	
	@Test
	public void instanciarAvion_TodosLosAtributos_InstanciaCorrecta() {
		
		Avion unAvion = null;
		try {
			unAvion = new Avion(1, "Boeing", "A81SA", 12);
		} catch (AvionMalFormadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(1, unAvion.getId());
		assertEquals("Boeing", unAvion.getModelo());
		assertEquals("A81SA", unAvion.getMatricula());
		assertEquals(12, unAvion.getAsientos().size());
	}
	
	
	@Test
	public void instanciarAvion_FaltaModelo_ModeloAvionIncompletoException() {
		
		Assertions.assertThrows(AvionModeloIncompletoException.class, ()->{
			Avion unAvion = new Avion(1, "", "A81SA", 12);
		});
	}
	
	@Test
	public void instanciarAvion_FaltaMatricula_MatriculaAvionIncompletoException() {
				
		Assertions.assertThrows(AvionMatriculaIncompletaException.class, ()->{
			Avion unAvion = new Avion(1, "Boeing", "", 12);
		});
	}
	
	@Test
	public void instanciarAvion_FaltaAsientos_AsientosAvionIncompletoException() {
		Assertions.assertThrows(AvionCantidadAsientoCeroIncompletoException.class, ()->{
			Avion unAvion = new Avion(1, "Boeing", "A990999", 0);
		});
	}
	
	@Test
	public void ModificarModeloAvion_TodosLosAtributos_InstanciaCorrecta() {
		
		Avion unAvion = null;
		try {
			unAvion = new Avion(1, "Boeing", "A81SA", 12);
		} catch (AvionMalFormadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		unAvion.setModelo("Ruster");
		assertEquals("Ruster", unAvion.getModelo());
	}
	
	@Test
	public void ModificarMatriculaAvion_TodosLosAtributos_InstanciaCorrecta() {
		
		Avion unAvion = null;
		try {
			unAvion = new Avion(1, "Boeing", "A81SA", 12);
		} catch (AvionMalFormadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		unAvion.setMatricula("AW888");
		assertEquals("AW888", unAvion.getMatricula());
	}
	
	@Test
	public void ModificarCantidadAsientos_TodosLosAtributos_InstanciaCorrecta() {
		
		Avion unAvion = null;
		try {
			unAvion = new Avion(1, "Boeing", "A81SA", 12);
		} catch (AvionMalFormadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		unAvion.setCantidadAsientos(50);
		assertEquals(50, unAvion.getAsientos().size());
	}
	
}
