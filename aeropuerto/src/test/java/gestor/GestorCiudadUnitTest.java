package gestor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Order; 
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
class GestorCiudadUnitTest {
	GestorCiudad gestorDeCiudades = GestorCiudad.getInstancia();

	@Test
	@Order(1)
	void crearCiudad_TodosLosAtributos_CiudadCargada() {
		assertEquals(true,gestorDeCiudades.crearCiudad("La Rioja", "5360"));
	
	}
	
	@Test
	@Order(2)
	void crearCiudad_FaltaCodigoPostal_CiudadCargada() {
		assertEquals(true,gestorDeCiudades.crearCiudad("La Rioja"));
	
	}
	
	@Test
	@Order(3)
	void crearCiudad_FaltaNombreCiudad_InstanciaCorrecta() {
		assertEquals(false,gestorDeCiudades.crearCiudad(""));
	
	}
	
	 
	@Test
	@Order(4)
	void modificarNombreCiudad_TodosLosAtributos_InstanciaCorrecta() {
		gestorDeCiudades.crearCiudad("Mar del plata");
		gestorDeCiudades.crearCiudad("La plata");
		Integer codigoCiudad = gestorDeCiudades.traerTodasLasCiudades().size()-1;
		assertEquals(true, gestorDeCiudades.modificarNombreCiudad(codigoCiudad, "La Pampa"));
		assertEquals("La Pampa", gestorDeCiudades.traerUnaCiudad(codigoCiudad).getNombre());
	}
	
	@Test
	@Order(5)
	void borrarUnaCiudad_TodosLosAtributos_InstanciaCorrecta() {
		gestorDeCiudades.crearCiudad("Buenos Aires", "5361");
		gestorDeCiudades.crearCiudad("Mar del plata");
		gestorDeCiudades.crearCiudad("La plata");
		assertEquals(7,gestorDeCiudades.traerTodasLasCiudades().size());
		assertEquals(true,gestorDeCiudades.borrarCiudad(7)); 
		assertEquals(6,gestorDeCiudades.traerTodasLasCiudades().size());
		
	}
	
	@Test
	@Order(6)
	void traerUnaCiudad_TodosLosAtributos_InstanciaCorrecta() {
		gestorDeCiudades.crearCiudad("Buenos Aires", "5361");
		gestorDeCiudades.crearCiudad("Mar del plata", "5263");
		gestorDeCiudades.crearCiudad("La plata");
		assertEquals(5, gestorDeCiudades.traerUnaCiudad(5).getIdCiudad());
		assertEquals("Buenos Aires", gestorDeCiudades.traerUnaCiudad(5).getNombre());
		assertEquals("5361", gestorDeCiudades.traerUnaCiudad(5).getCodigoPostal());
	}
	
	@Test
	@Order(7)
	void traerTodaslasCiudades_TodosLosAtributos_InstanciaCorrecta() {
		assertEquals(9, gestorDeCiudades.traerTodasLasCiudades().size());
	}
	
	@Test
	@Order(8)
	void traerCiudadPorNombre_TodosLosAtributos_InstanciaCorrecta() {
		assertEquals(2, gestorDeCiudades.traerCiudadPorNombre("Mar del plata").size());
		assertEquals(2, gestorDeCiudades.traerCiudadPorNombre("La Rioja").size());
	}
	
	@Test
	@Order(9)
	void borrarTodasLasCiudades_TodosLosAtributos_InstanciaCorrecta() {
		assertEquals(true, gestorDeCiudades.borrarTodasLasCiudades());
		assertEquals(0, gestorDeCiudades.traerTodasLasCiudades().size());
	}
}