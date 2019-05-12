package gestor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GestorAvionUnitTest {
	
	List<Asiento> asientosAvion = new ArrayList<Asiento>();
	asientosAvion.add(new Asiento(1, "001V"));
	asientosAvion.add(new Asiento(2, "002P"));
	asientosAvion.add(new Asiento(3, "003V"));
	asientosAvion.add(new Asiento(4, "004P"));
	
	@Test
	void crearAvion_TodosLosAtributos_InstanciaCorrecta() {
		GestorDeAvion gestorDeUnAvion = GestorDeAvion.getInstancia();
		assertEquals(true, gestorDeUnAvion.crearAvion(1, "Boga", "AKK4", asientosAvion ));
	}
	
	
	@Test
	void modificarAvion_TodosLosAtributos_InstanciaCorrecta() {
		GestorDeAvion gestorDeUnAvion = GestorDeAvion.getInstancia();
		gestorDeUnAvion.crearAvion(2, "Boga", "LL4K", asientosAvion);
		assertEquals(true,gestorDeUnAvion.modificarMatriculaAvion(2, "88TW"));
	}
	
	@Test
	void borrarAsignacion_TodosLosAtributos_AvionEliminado() {
		GestorDeAvion gestorDeUnAvion = GestorDeAvion.getInstancia();
		gestorDeUnAvion.crearAvion(3, "Colossus", "O08E", asientosAvion);
		assertEquals(true, gestorDeUnAvion.borrarAvion(3));
	}
	
	@Test
	void traerUnAvion_TodosLosAtributos_InstanciaCorrecta() {
		GestorDeAvion gestorDeUnAvion = GestorDeAvion.getInstancia();
		gestorDeUnAvion.crearAvion(4, "Colossus-2", "0033E", asientosAvion);
		assertEquals(4,gestorDeUnAvion.traerUnAvion(4).getID());
		assertEquals("Colossus-2",gestorDeUnAvion.traerUnAvion(4).getModelo());
		assertEquals("0033E",gestorDeUnAvion.traerUnAvion(4).getMatricula());
		assertEquals(4 ,gestorDeUnAvion.traerUnAvion(4).getAsientos().size());
	}
	
	@Test
	void traerTodosAviones_TodosLosAtributos_InstanciaCorrecta() {
		GestorDeAvion gestorDeUnAvion = GestorDeAvion.getInstancia();
		assertEquals(4,gestorDeUnAvion .traerTodosLosAviones().size());
	}
	
	@Test
	void traerAvionPorModelo_TodosLosAtributos_InstanciaCorrecta() {
		GestorDeAvion gestorDeUnAvion = GestorDeAvion.getInstancia();
		assertEquals(2, gestorDePasajeros.traerAvionPorModelo("Boga").size());
	
	}

}
