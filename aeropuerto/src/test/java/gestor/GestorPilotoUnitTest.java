package gestor;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class GestorPilotoUnitTest {

	@Test
	void crearPiloto_TodosLosAtributos_InstanciaCorrecta() {
		GestorPiloto gestorDePilotos = GestorPiloto.getInstancia();
		assertEquals(true,gestorDePilotos.crearPiloto(1, "Alvarez", "Juan", "38440761", LocalDate.of(1994, 6, 12)));
	
	}
	
	@Test
	void crearPiloto_FaltaFechaNacimiento_InstanciaCorrecta() {
		GestorPiloto gestorDePilotos = GestorPiloto.getInstancia();
		assertEquals(true,gestorDePilotos.crearPiloto(2, "Del Pesso", "Rodrigo", "38006003"));
	
	}
	
	
	@Test
	void modificarDatosPiloto_FaltaFechaNacimiento_FechaNacimientoCargada() {
		GestorPiloto gestorDePilotos = GestorPiloto.getInstancia();
		gestorDePilotos.crearPiloto(3, "Diaz", "Manuel", "39006003");
		assertEquals(true, gestorDePilotos.modificarPiloto(3, "","","", LocalDate.of(1999, 6, 3) ));
	}
	
	
	@Test
	void borrarAerolinea_TodosLosAtributos_PilotoEliminado() {
		GestorPiloto gestorDePilotos = GestorPiloto.getInstancia();
		gestorDePilotos.crearPiloto(4, "Diaz", "Jose", "36001002");
		assertEquals(true,gestorDeCiudades.borrarPiloto(4));
		
	}
	
	@Test
	void traerUnPiloto_TodosLosAtributos_InstanciaCorrecta() {
		GestorPiloto gestorDePilotos = GestorPiloto.getInstancia();
		gestorDePilotos.crearPiloto(5, "Diaz", "Matias", "36001003");
		assertEquals(5, gestorDePilotos.traerUno(5).getID());
		assertEquals("Diaz", gestorDePilotos.traerUno(5).getApellido());
		assertEquals("Matias", gestorDePilotos.traerUno(5).getNombre());
		assertEquals("38.440.761", gestorDePilotos.traerUno(5).getDNI());
	}
	
	@Test
	void traerTodosLosPilotos_TodosLosAtributos_InstanciaCorrecta() {
		GestorPiloto gestorDePilotos = GestorPiloto.getInstancia();
		assertEquals(4, gestorDePilotos.traerTodos().size());
	}
	
	@Test
	void traerPilotosPorDNI_TodosLosAtributos_InstanciaCorrecta() {
		GestorPiloto gestorDePilotos = GestorPiloto.getInstancia();		
		assertEquals(1, gestorDePilotos.traerPilotoPorNombre("36001003").size());
	
	}
	
	@Test
	void traerPilotosPorApellido_TodosLosAtributos_InstanciaCorrecta() {
		GestorPiloto gestorDePilotos = GestorPiloto.getInstancia();		
		assertEquals(2, gestorDePilotos.traerPilotoPorApellido("Diaz").size());
	
	}
	
	@Test
	void traerPilotosPorNombre_TodosLosAtributos_InstanciaCorrecta() {
		GestorPiloto gestorDePilotos = GestorPiloto.getInstancia();		
		assertEquals(1, gestorDePilotos.traerPilotoPorNombre("Juan").size());
	
	}

}
