package gestor;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class GestorAeropuertoUnitTest {

	@Test
	void crearAeropuerto_TodosLosAtributos_InstanciaCorrecta() {
		GestorAeropuerto gestorDeAeropuertos = GestorAeropuerto.getInstancia();
		Ciudad ciudad = new Ciudad(1, "Buenos Aires", "5533");
		assertEquals(true,gestorDeAeropuertos.crearAeropuerto(1, "Ezeiza", ciudad, "Eze123"));
	
	}
	
	@Test
	void modificarAeropuerto_CambiarNombre_InstanciaCorrecta() {
		GestorAeropuerto gestorDeAeropuertos = GestorAeropuerto.getInstancia();
		Ciudad ciudad = new Ciudad(2, "La Rioja", "5360");
		gestorDeAeropuertos.crearAeropuerto(2, "Anguinan", ciudad, "Ang001");
		assertEquals(true, gestorDeAeropuertos.modificarNombre(1, "Chilecito"));
	
	}
	
	@Test
	void borrarAeropuerto_TodosLosAtributos_AeropuertoEliminado() {
		GestorAeropuerto gestorDeAeropuertos = GestorAeropuerto.getInstancia();
		Ciudad ciudad = new Ciudad(2, "La Rioja", "5360");
		gestorDeAeropuertos.crearAeropuerto(3, "Lujan", ciudad, "Ang001");
		assertEquals(true,gestorDeAeropuertos.borrarAeropuerto(2));
		
	}
	
	@Test
	void traerUnPiloto_TodosLosAtributos_InstanciaCorrecta() {
		GestorAeropuerto gestorDeAeropuertos = GestorAeropuerto.getInstancia();
		Ciudad ciudad = new Ciudad(2, "La Rioja", "5360");
		gestorDeAeropuertos.crearAeropuerto(3, "Lujan", ciudad, "Ang001");
		assertEquals(3, gestorDeAeropuertos.traerUno(3).getID());
		assertEquals("Lujan", gestorDeAeropuertos.traerUno(3).getNombre());
		assertEquals("Ang001", gestorDeAeropuertos.traerUno(5).getCodigo());
	}
	
	@Test
	void traerTodosLosAeropuertos_TodosLosAtributos_InstanciaCorrecta() {
		GestorAeropuerto gestorDeAeropuertos = GestorAeropuerto.getInstancia();
		Ciudad ciudad = new Ciudad(2, "La Rioja", "5360");
		gestorDeAeropuertos.crearAeropuerto(3, "Lujan", ciudad, "Ang001");
		
		assertEquals(3, gestorDeAeropuertos.traerTodos().size());
	}
	
	@Test
	void traerAerolineaPorCodigo_TodosLosAtributos_InstanciaCorrecta() {
		GestorAeropuerto gestorDeAeropuertos = GestorAeropuerto.getInstancia();
		Ciudad ciudad = new Ciudad(3, "Guandacol", "5210");
		gestorDeAeropuertos.crearAeropuerto(10, "GuandaFly", ciudad, "Guanda123");
		
		assertEquals(1, gestorDeAeropuertos.traerAerolineaPorCodigo("Guanda123").size());
	
	}
	
}
