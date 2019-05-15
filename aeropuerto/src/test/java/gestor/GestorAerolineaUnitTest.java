package gestor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
class GestorAerolineaUnitTest {
	
	GestorAerolinea gestorDeAerolineas = GestorAerolinea.getInstancia();
	
	@Test
	@Order(1)
	void crearAerolinea_TodosLosAtributos_InstanciaCorrecta() {
		assertEquals(true,gestorDeAerolineas.crearAerolinea("Flybondy"));
	}
	
	@Test
	void crearAerolinea_FaltaNombreAerolinea_InstanciaIncorrecta() {
		assertEquals(false,gestorDeAerolineas.crearAerolinea(""));
	}
	
	@Test
	@Order(2)
	void modificarNombreAerolinea_TodosLosAtributos_ActualizarNombreAerolinea() {
		gestorDeAerolineas.crearAerolinea("Aerolineas Argentinas");
		gestorDeAerolineas.crearAerolinea("Al Mundo");
		gestorDeAerolineas.crearAerolinea("Fly Emirates");
		gestorDeAerolineas.crearAerolinea("LAN");
		assertEquals(true, gestorDeAerolineas.modificarAerolinea(2, "Volaris"));
		assertEquals(2, gestorDeAerolineas.traerUnaAerolinea(2).getId());
		assertEquals("Volaris", gestorDeAerolineas.traerUnaAerolinea(2).getNombre());
	}
	
	
	@Test
	@Order(3)
	void borrarUnaAerolinea_TodosLosAtributos_AerolineaEliminada() {
		assertEquals(true,gestorDeAerolineas.borrarAerolinea(2));
		
	}
	
	@Test
	@Order(4)
	void traerUnaAerolinea_TodosLosAtributos_InstanciaCorrecta() {
		assertEquals(1, gestorDeAerolineas.traerUnaAerolinea(1).getId());
		assertEquals("Flybondy", gestorDeAerolineas.traerUnaAerolinea(1).getNombre());
	}
	
	@Test
	@Order(5)
	void traerTodaslasAerolineas_TodosLosAtributos_InstanciaCorrecta() {
		assertEquals(5, gestorDeAerolineas.traerTodasLasAerolineas().size());
	}
	
	@Test
	@Order(6)
	void borrarTodasLasAerolineas_TodosLosAtributos_Aerolineasborradas() {
		assertEquals(true,gestorDeAerolineas.borrarTodasLasAerolineas());
		assertEquals(0, gestorDeAerolineas.traerTodasLasAerolineas().size());
	}

}
