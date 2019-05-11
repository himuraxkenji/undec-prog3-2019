package gestor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GestorAerolineaUnitTest {

	@Test
	void crearAerolinea_TodosLosAtributos_InstanciaCorrecta() {
		GestorAerolinea gestorDeAerolineas = GestorAerolinea.getInstancia();
		assertEquals(true,gestorDeAerolineas.crearAerolinea(1, "Flybondy"));
	
	}
	
	@Test
	void modificarAerolinea_TodosLosAtributos_InstanciaCorrecta() {
		GestorAerolinea gestorDeAerolineas = GestorAerolinea.getInstancia();
		assertEquals(true, gestorDeAerolineas.modificarAerolinea(1, "AerolineasArgentinas"));
	}
	
	
	@Test
	void borrarAerolinea_TodosLosAtributos_InstanciaCorrecta() {
		GestorAerolinea gestorDeAerolineas = GestorAerolinea.getInstancia();
		gestorDeAerolineas.crearAerolinea(2, "Flybondy");
		gestorDeAerolineas.crearAerolinea(3, "Al Mundo");
		assertEquals(true,gestorDeCiudades.borrarCiudad(2));
		
	}
	
	@Test
	void traerUnaCiudad_TodosLosAtributos_InstanciaCorrecta() {
		GestorAerolinea gestorDeAerolineas = GestorAerolinea.getInstancia();
		assertEquals(1, gestorDeAerolineas.traerUno(1).getID());
		assertEquals("AerolineasArgentinas", gestorDeAerolineas.traerUno(4).getNombre());
	}
	
	@Test
	void traerTodaslasAerolineas_TodosLosAtributos_InstanciaCorrecta() {
		GestorAerolineas gestorDeAerolineas= GestorAerolineas.getInstancia();
		assertEquals(2, gestorDeAerolineas.traerTodos().size());
	}
	
	@Test
	void traerAerolineaPorNombre_TodosLosAtributos_InstanciaCorrecta() {
		
		GestorAerolineas gestorDeAerolineas= GestorAerolineas.getInstancia();
		assertEquals(1, gestorDeAerolineas.traerAerolineaPorNombre("Flybondi").size);
	
	}

}
