package gestor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
class GestorDePasajerosUnitTest {

	GestorPasajeros gestorDePasajeros = GestorPasajeros.getInstancia();

	@Test
	@Order(1)
	void crearPasajero_TodosLosAtributos_InstanciaCorrecta() {
		assertEquals(true,gestorDePasajeros.crearPasajero("20384407618", "Riperto", "Adriel", "3825574945"));
	}
	
	@Test
	@Order(2)
	void crearPasajero_FaltaTelefono_InstanciaCorrecta() {
		assertEquals(true,gestorDePasajeros.crearPasajero("23232323", "Riperto", "Adriel"));
	}
	
	@Test
	void crearPasajero_FaltaCuil_InstanciaIncorrecta() {
		assertEquals(false,gestorDePasajeros.crearPasajero("", "Arias", "Micaela"));
	}
	
	@Test
	void crearPasajero_FaltaApellido_InstanciaIncorrecta() {
		assertEquals(false,gestorDePasajeros.crearPasajero("27420030068", "", "Micaela"));		
	}
	
	@Test
	void crearPasajero_FaltaNombre_InstanciaIncorrecta() {
		assertEquals(false,gestorDePasajeros.crearPasajero("27420030068", "Arias", ""));	
	}
	
	@Test
	@Order(3)
	void modificarCuilUltimoPasajero_TodosLosDatos_CuilModificado() {
		gestorDePasajeros.crearPasajero("30333444009", "Arias", "Agustin");
		gestorDePasajeros.crearPasajero("27420060038", "Arias", "Micaela", "3825566686");
		gestorDePasajeros.crearPasajero("23332222255", "Arias", "Fabricio", "351666889");
		gestorDePasajeros.crearPasajero("26262626262", "Arias", "Walter", "5556669982");
		Integer codigoUltimoPasajero = gestorDePasajeros.traerTodosLosPasajeros().size();
		assertEquals(true,gestorDePasajeros.modificarCuilPasajero(codigoUltimoPasajero, "204200000018"));
		assertEquals("204200000018",gestorDePasajeros.traerUnPasajero(codigoUltimoPasajero).getCuil());
		assertEquals("Arias",gestorDePasajeros.traerUnPasajero(codigoUltimoPasajero).getApellido());
		assertEquals("Walter",gestorDePasajeros.traerUnPasajero(codigoUltimoPasajero).getNombre());
		assertEquals("5556669982",gestorDePasajeros.traerUnPasajero(codigoUltimoPasajero).getTelefono());
	}
	 
	@Test
	@Order(4)
	void modificarCuilUnPasajero_TodosLosDatos_CuilModificado() {
		
		assertEquals(true,gestorDePasajeros.modificarCuilPasajero(3, "3825565656"));
		assertEquals("3825565656",gestorDePasajeros.traerUnPasajero(3).getCuil());
		assertEquals("Arias",gestorDePasajeros.traerUnPasajero(3).getApellido());
		assertEquals("Agustin",gestorDePasajeros.traerUnPasajero(3).getNombre());
		assertEquals("No Cargado",gestorDePasajeros.traerUnPasajero(3).getTelefono());
	}
	
	@Test
	@Order(5)
	void modificarApellidoUltimoPasajero_TodosLosDatos_ApellidoModificado() {
		Integer codigoUltimoPasajero = gestorDePasajeros.traerTodosLosPasajeros().size();
		assertEquals(true,gestorDePasajeros.modificarApellidoPasajero(codigoUltimoPasajero, "Rodriguez"));
		assertEquals("204200000018",gestorDePasajeros.traerUnPasajero(codigoUltimoPasajero).getCuil());
		assertEquals("Rodriguez",gestorDePasajeros.traerUnPasajero(codigoUltimoPasajero).getApellido());
		assertEquals("Walter",gestorDePasajeros.traerUnPasajero(codigoUltimoPasajero).getNombre());
		assertEquals("5556669982",gestorDePasajeros.traerUnPasajero(codigoUltimoPasajero).getTelefono());
	}
	 
	@Test
	@Order(6)
	void modificarApellidoUnPasajero_TodosLosDatos_ApellidoModificado() {
		
		assertEquals(true,gestorDePasajeros.modificarApellidoPasajero(3, "Sanchez"));
		assertEquals("3825565656",gestorDePasajeros.traerUnPasajero(3).getCuil());
		assertEquals("Sanchez",gestorDePasajeros.traerUnPasajero(3).getApellido());
		assertEquals("Agustin",gestorDePasajeros.traerUnPasajero(3).getNombre());
		assertEquals("No Cargado",gestorDePasajeros.traerUnPasajero(3).getTelefono());
	}
	
	@Test
	@Order(7)
	void modificarNombreUltimoPasajero_TodosLosDatos_NombreModificado() {
		Integer codigoUltimoPasajero = gestorDePasajeros.traerTodosLosPasajeros().size();
		assertEquals(true,gestorDePasajeros.modificarNombrePasajero(codigoUltimoPasajero, "Jose"));
		assertEquals("204200000018",gestorDePasajeros.traerUnPasajero(codigoUltimoPasajero).getCuil());
		assertEquals("Rodriguez",gestorDePasajeros.traerUnPasajero(codigoUltimoPasajero).getApellido());
		assertEquals("Jose",gestorDePasajeros.traerUnPasajero(codigoUltimoPasajero).getNombre());
		assertEquals("5556669982",gestorDePasajeros.traerUnPasajero(codigoUltimoPasajero).getTelefono());
	}
	 
	@Test
	@Order(8)
	void modificarNombreUnPasajero_TodosLosDatos_NombreModificado() {
		
		assertEquals(true,gestorDePasajeros.modificarNombrePasajero(3, "Alejandro"));
		assertEquals("3825565656",gestorDePasajeros.traerUnPasajero(3).getCuil());
		assertEquals("Sanchez",gestorDePasajeros.traerUnPasajero(3).getApellido());
		assertEquals("Alejandro",gestorDePasajeros.traerUnPasajero(3).getNombre());
		assertEquals("No Cargado",gestorDePasajeros.traerUnPasajero(3).getTelefono());
	}
	
	@Test
	@Order(8)
	void modificarTelefonoUltimoPasajero_TodosLosDatos_TelefonoModificado() {
		Integer codigoUltimoPasajero = gestorDePasajeros.traerTodosLosPasajeros().size();
		assertEquals(true,gestorDePasajeros.modificarTelefonoPasajero(codigoUltimoPasajero, "3825565656"));
		assertEquals("204200000018",gestorDePasajeros.traerUnPasajero(codigoUltimoPasajero).getCuil());
		assertEquals("Rodriguez",gestorDePasajeros.traerUnPasajero(codigoUltimoPasajero).getApellido());
		assertEquals("Jose",gestorDePasajeros.traerUnPasajero(codigoUltimoPasajero).getNombre());
		assertEquals("3825565656",gestorDePasajeros.traerUnPasajero(codigoUltimoPasajero).getTelefono());
	}
	 
	@Test
	@Order(9)
	void modificarTelefonoUnPasajero_TodosLosDatos_TelefonoModificado() {
		
		assertEquals(true,gestorDePasajeros.modificarTelefonoPasajero(3, "3825562021"));
		assertEquals("3825565656",gestorDePasajeros.traerUnPasajero(3).getCuil());
		assertEquals("Sanchez",gestorDePasajeros.traerUnPasajero(3).getApellido());
		assertEquals("Alejandro",gestorDePasajeros.traerUnPasajero(3).getNombre());
		assertEquals("3825562021",gestorDePasajeros.traerUnPasajero(3).getTelefono());
	}
	
	@Test
	@Order(10)
	void borrarUnPasajero_TodosLosAtributos_PasajeroEliminado() {
		assertEquals(6,gestorDePasajeros.traerTodosLosPasajeros().size());
		assertEquals(true,gestorDePasajeros.borrarPasajero(4));
		assertEquals(5,gestorDePasajeros.traerTodosLosPasajeros().size());
	}
	
	@Test
	@Order(11)
	void traerUnPasajero_TodosLosAtributos_InstanciaCorrecta() {
		assertEquals(1, gestorDePasajeros.traerUnPasajero(1).getId());
		assertEquals("20384407618", gestorDePasajeros.traerUnPasajero(1).getCuil());
		assertEquals("Riperto", gestorDePasajeros.traerUnPasajero(1).getApellido());
		assertEquals("Adriel", gestorDePasajeros.traerUnPasajero(1).getNombre());
		assertEquals("3825574945", gestorDePasajeros.traerUnPasajero(1).getTelefono());
	}

	@Test
	@Order(12)
	void traerTodosLosPasajeros_TodosLosAtributos_InstanciaCorrecta() {
		assertEquals(5, gestorDePasajeros.traerTodosLosPasajeros().size());
	}
	
	@Test
	@Order(13)
	void traerPasajerosPorCuil_TodosLosAtributos_InstanciaCorrecta() {
		assertEquals(1, gestorDePasajeros.traerPasajeroPorCuil("20384407618").size());
	}
	
	@Test
	@Order(14)
	void traerPasajerosPorApellido_TodosLosAtributos_InstanciaCorrecta() {
		assertEquals(2, gestorDePasajeros.traerPasajeroPorApellido("Riperto").size());
	
	}
	
	@Test
	@Order(15)
	void traerPasajerosPorNombre_TodosLosAtributos_InstanciaCorrecta() {
		assertEquals(2, gestorDePasajeros.traerPasajeroPorNombre("Adriel").size());
	
	}
	
//	@Test
//	void traerPilotosPorApellido_TodosLosAtributos_InstanciaCorrecta() {
//		GestorPiloto gestorDePilotos = GestorPiloto.getInstancia();		
//		assertEquals(3, gestorDePilotos.traerPilotoPorApellido("Diaz").size());
//	
//	}

}
