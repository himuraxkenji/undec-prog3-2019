package gestor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GestorCiudadUnitTest {

	
	@Test
	void crearCiudad_TodosLosAtributos_InstanciaCorrecta() {
		GestorCiudad gestorDeCiudades = GestorCiudad.getInstancia();
		assertEquals(true,gestorDeCiudades.crearCiudad(1, "La Rioja", "5360"));
	
	}
	
	@Test
	void modificarCiudad_TodosLosAtributos_InstanciaCorrecta() {
		GestorCiudad gestorDeCiudades = GestorCiudad.getInstancia();
		gestorDeCiudades.crearCiudad(2, "Mar del plata", "1122");
		assertEquals(true, gestorDeCiudades.modificarCiudad(2, "Mar del Plata", "1123"));
	}
	
	@Test
	void borrarCiudad_TodosLosAtributos_InstanciaCorrecta() {
		GestorCiudad gestorDeCiudades = GestorCiudad.getInstancia();
		gestorDeCiudades.crearCiudad(3, "Buenos Aires", "5361");
		assertEquals(true,gestorDeCiudades.borrarCiudad(3));
		
	}
	
	@Test
	void traerUnaCiudad_TodosLosAtributos_InstanciaCorrecta() {
		GestorCiudad gestorDeCiudades = GestorCiudad.getInstancia();
		gestorDeCiudades.crearCiudad(4, "La Plata", "6661");
		assertEquals(4, gestorDeCiudades.traerUno(4).getID());
		assertEquals("La Plata", gestorDeCiudades.traerUno(4).getNombre());
		assertEquals("6661", gestorDeCiudades.traerUno(4).getCodigoPostal());
	}
	
	@Test
	void traerTodaslasCiudades_TodosLosAtributos_InstanciaCorrecta() {
		GestorCiudad gestorDeCiudades = GestorCiudad.getInstancia();
		assertEquals(3, gestorDeCiudades.traerTodos().size());
	}
	
	@Test
	void traerCiudadPorNombre_TodosLosAtributos_InstanciaCorrecta() {
		GestorCiudad gestorDeCiudades = GestorCiudad.getInstancia();
		gestorDeCiudades.crearCiudad(5, "La Plata", "6623");
		assertEquals(2, gestorDeCiudades.traerCiudadPorNombre("La Plata").size);
	
	}
	
}