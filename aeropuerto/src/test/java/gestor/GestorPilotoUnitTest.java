package gestor;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import java.time.LocalDate;

@TestMethodOrder(OrderAnnotation.class)
class GestorPilotoUnitTest {

	GestorPiloto gestorDePilotos = GestorPiloto.getInstancia();
	
	@Test
	@Order(1)
	void crearPiloto_TodosLosAtributos_InstanciaCorrecta() {
		assertEquals(true,gestorDePilotos.crearPiloto("Alvarez", "Juan", "38440761", LocalDate.of(1994, 6, 12)));	
		
	}
	
	@Test
	@Order(2)
	void crearPiloto_FaltaFechaNacimiento_InstanciaCorrecta() {
		assertEquals(true,gestorDePilotos.crearPiloto("Del Pesso", "Micaela", "38006003"));
	}
	
	@Test
	void crearPiloto_FaltaApellido_InstanciaIncorrecta() {
		assertEquals(false,gestorDePilotos.crearPiloto("", "Rodrigo", "38006003"));
	}
	
	@Test
	void crearPiloto_FaltaNombre_InstanciaIncorrecta() {
		assertEquals(false,gestorDePilotos.crearPiloto("Del Pesso", "", "38006003"));
	}
	
	@Test
	void crearPiloto_FaltaDNI_InstanciaIncorrecta() {
		assertEquals(false,gestorDePilotos.crearPiloto("Del Pesso", "Rodrigo", ""));
	}
	
	@Test
	@Order(3)
	void modificarApellidoPiloto_TodosLosAtributos_ApellidoActualizado() {
		gestorDePilotos.crearPiloto("Diaz", "Manuel", "39006003", LocalDate.of(1999, 7, 10));
		gestorDePilotos.crearPiloto("Arias", "Agustin","123123123", LocalDate.of(1999, 6, 10));
		gestorDePilotos.crearPiloto("Arias", "Micaela", "3825566686",LocalDate.of(2000, 7, 10));
		gestorDePilotos.crearPiloto("Arias", "Fabricio", "351666889", LocalDate.of(1999, 6, 10));
		gestorDePilotos.crearPiloto("Arias", "Walter", "38440761");
		assertEquals(true, gestorDePilotos.modificarApellidoPiloto(3, "Ruppert"));
		assertEquals("Ruppert", gestorDePilotos.traerUnPiloto(3).getApellido());
		assertEquals("Manuel", gestorDePilotos.traerUnPiloto(3).getNombres());
		assertEquals("39006003", gestorDePilotos.traerUnPiloto(3).getDni());
		assertEquals("1999-07-10", gestorDePilotos.traerUnPiloto(3).getFechaNacimiento());
	}
	
	
	@Test
	@Order(4)
	void modificarNombrePiloto_TodosLosAtributos_NombreActualizado() {
		assertEquals(true, gestorDePilotos.modificarNombrePiloto(3, "Rossel"));
		assertEquals("Ruppert", gestorDePilotos.traerUnPiloto(3).getApellido());
		assertEquals("Rossel", gestorDePilotos.traerUnPiloto(3).getNombres());
		assertEquals("39006003", gestorDePilotos.traerUnPiloto(3).getDni());
		assertEquals("1999-07-10", gestorDePilotos.traerUnPiloto(3).getFechaNacimiento());
	}
	
	@Test
	@Order(5)
	void modificarDNIPiloto_TodosLosAtributos_DNIActualizado() {
		assertEquals(true, gestorDePilotos.modificarDNIPiloto(3, "38.440.761"));
		assertEquals("Ruppert", gestorDePilotos.traerUnPiloto(3).getApellido());
		assertEquals("Rossel", gestorDePilotos.traerUnPiloto(3).getNombres());
		assertEquals("38.440.761", gestorDePilotos.traerUnPiloto(3).getDni());
		assertEquals("1999-07-10", gestorDePilotos.traerUnPiloto(3).getFechaNacimiento());
	}
	
	@Test
	@Order(6)
	void modificarFechaNacimientoPiloto_TodosLosAtributos_FechaNacimientoActualizado() {
		assertEquals(true, gestorDePilotos.modificarFechaNacimientoPiloto(3, LocalDate.of(1994, 6, 29)));
		assertEquals("Ruppert", gestorDePilotos.traerUnPiloto(3).getApellido());
		assertEquals("Rossel", gestorDePilotos.traerUnPiloto(3).getNombres());
		assertEquals("38.440.761", gestorDePilotos.traerUnPiloto(3).getDni());
		assertEquals("1994-06-29", gestorDePilotos.traerUnPiloto(3).getFechaNacimiento());
	}
	
	@Test
	@Order(7)
	void borrarPiloto_TodosLosAtributos_PilotoEliminado() {
		assertEquals(7,gestorDePilotos.traerTodosLosPilotos().size());
		assertEquals(true,gestorDePilotos.borrarPiloto(3));
		assertEquals(6,gestorDePilotos.traerTodosLosPilotos().size());
	}
	
	@Test
	@Order(8)
	void traerUnPiloto_TodosLosAtributos_InstanciaCorrecta() {
		assertEquals(1, gestorDePilotos.traerUnPiloto(1).getId());
		assertEquals("Alvarez", gestorDePilotos.traerUnPiloto(1).getApellido());
		assertEquals("Juan", gestorDePilotos.traerUnPiloto(1).getNombres());
		assertEquals("38440761", gestorDePilotos.traerUnPiloto(1).getDni());
		assertEquals("1994-06-12", gestorDePilotos.traerUnPiloto(1).getFechaNacimiento());
	}
	@Test
	@Order(9)
	void traerTodosLosPilotos_TodosLosAtributos_InstanciaCorrecta() {
		assertEquals(6,gestorDePilotos.traerTodosLosPilotos().size());
	}
	
	@Test
	@Order(10)
	void traerPilotosPorApellido_TodosLosAtributos_InstanciaCorrecta() {
		assertEquals(4, gestorDePilotos.traerPilotoPorApellido("Arias").size());
	}
	
	@Test
	@Order(11)
	void traerPilotosPorNombre_TodosLosAtributos_InstanciaCorrecta() {
		assertEquals(2, gestorDePilotos.traerPilotoPorNombre("Micaela").size());
	}
	
	@Test
	@Order(12)
	void traerPilotosPorDNI_TodosLosAtributos_InstanciaCorrecta() {
		assertEquals(2, gestorDePilotos.traerPilotoPorDNI("38440761").size());
	}
	
	@Test
	@Order(13)
	void traerPilotosPorFechaNacimiento_TodosLosAtributos_InstanciaCorrecta() {
		assertEquals(2, gestorDePilotos.traerPilotoPorFechaNacimiento("1999-06-10").size());
	}
	
	@Test
	@Order(14)
	void borrarTodosLosPilotos_TodosLosAtributos_PilotosEliminados() {
		assertEquals(true, gestorDePilotos.borrarTodosLosPilotos());
		assertEquals(0, gestorDePilotos.traerTodosLosPilotos().size() );
	}

}
