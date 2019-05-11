package gestor;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class GestorDePasajerosUnitTest {

	@Test
	void crearPasajero_TodosLosAtributos_InstanciaCorrecta() {
		GestorPasajeros gestorDePasajeros = GestorPasajeros.getInstancia();
		assertEquals(true,gestorDePasajeros.crearPasajero(1, "20384407618", "Riperto", "Adriel", "3825574945"));
	
	}
	
	@Test
	void crearPiloto_FaltaFechaNacimiento_InstanciaCorrecta() {
		GestorPasajeros gestorDePasajeros = GestorPasajeros.getInstancia();
		assertEquals(true,gestorDePasajeros.crearPasajero(2, "27420030068", "Arias", "Micaela", ""));
	
	}
	
	
	@Test
	void modificarDatosPasajero_FaltaTelefono_TelefonoCargado() {
		GestorPasajeros gestorDePasajeros = GestorPasajeros.getInstancia();
		gestorDePasajeros.crearPasajero(3, "30333444009", "Arias", "agustin", "");
		assertEquals(true,gestorDePasajeros.modificarTelefono(3, "3825565656"));
	}
	
	
	@Test
	void borrarPasajero_TodosLosAtributos_PasajeroEliminado() {
		GestorPasajeros gestorDePasajeros = GestorPasajeros.getInstancia();
		gestorDePasajeros.crearPasajero(4, "30333444009", "Arias", "agustin", "");
		assertEquals(true,gestorDePasajeros.borrarPasajero(4));
		
	}
	
	@Test
	void traerUnPasajero_TodosLosAtributos_InstanciaCorrecta() {
		GestorPasajeros gestorDePasajeros = GestorPasajeros.getInstancia();
		gestorDePasajeros.crearPasajero(5, "20388606543", "Arias", "Jose", "3856656565");
		assertEquals(5, gestorDePasajeros.traerUno(5).getID());
		assertEquals("20388606543", gestorDePasajeros.traerUno(5).getCuil());
		assertEquals("Arias", gestorDePasajeros.traerUno(5).getApellido());
		assertEquals("Jose", gestorDePasajeros.traerUno(5).getNombre());
		assertEquals("3856656565", gestorDePasajeros.traerUno(5).getTelefono());
	}
	
	@Test
	void traerTodosLosPasajeros_TodosLosAtributos_InstanciaCorrecta() {
		GestorPasajeros gestorDePasajeros = GestorPasajeros.getInstancia();
		assertEquals(4, gestorDePasajeros.traerTodos().size());
	}
	
	@Test
	void traerPasajerosPorApellido_TodosLosAtributos_InstanciaCorrecta() {
		GestorPasajeros gestorDePasajeros = GestorPasajeros.getInstancia();
		assertEquals(1, gestorDePasajeros.traerPilotoPorApellido("Arias").size());
	
	}
	
	@Test
	void traerPilotosPorApellido_TodosLosAtributos_InstanciaCorrecta() {
		GestorPiloto gestorDePilotos = GestorPiloto.getInstancia();		
		assertEquals(3, gestorDePilotos.traerPilotoPorApellido("Diaz").size());
	
	}

}
