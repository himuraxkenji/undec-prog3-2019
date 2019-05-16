package gestor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import aeropuerto.Asiento;
import aeropuerto.Pasajero;
import excepciones.AsientoMalFormadoException;
import excepciones.PasajeroMalFormadoException;
import java.util.*;

@TestMethodOrder(OrderAnnotation.class)
class GestorAsignacionesUnitTest {
	
	GestorAsignacion gestorDeAsignaciones = GestorAsignacion.getInstancia();
	private static List<Pasajero> pasajeros = new ArrayList<Pasajero>();
	private static List<Asiento> asientos = new ArrayList<Asiento>();
	
	@Test
	@Order(1)
	void cargarPasajeros() {
		
		try {
			pasajeros.add(new Pasajero(1, "20384407618", "Riperto", "Adriel","3825574945"));
			pasajeros.add(new Pasajero(2, "20384407618", "Riperto", "Aaron", "3825574944"));
			pasajeros.add(new Pasajero(3,"30333444009", "Arias", "Agustin"));
			pasajeros.add(new Pasajero(4,"27420060038", "Arias", "Micaela", "3825566686"));
			pasajeros.add(new Pasajero(5,"23332222255", "Arias", "Fabricio", "351666889"));
			pasajeros.add(new Pasajero(6,"26262626262", "Arias", "Walter", "5556669982"));
		}catch(PasajeroMalFormadoException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	@Order(2)
	void cargarAsientos() {
		
		try {
			asientos.add(new Asiento(1,"1V"));
			asientos.add(new Asiento(2,"2P"));
			asientos.add(new Asiento(3,"3V"));
			asientos.add(new Asiento(4,"4P"));
			asientos.add(new Asiento(5,"5V"));
			asientos.add(new Asiento(6,"6P"));
		}catch(AsientoMalFormadoException e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	@Order(3)
	void crearAsignacion_TodosLosAtributos_InstanciaCorrecta() {
		assertEquals(true, gestorDeAsignaciones.crearAsignacion(pasajeros.get(0), asientos.get(0)));
	}
	
	@Test
	@Order(4)
	void crearAsignacion_SeRepiteAsiento_InstanciaIncorrecta() {
		assertEquals(false, gestorDeAsignaciones.crearAsignacion(pasajeros.get(1), asientos.get(0)));
	}
	
	@Test
	@Order(6)
	void modificarAsignacionAsiento_TodosLosAtributos_AsientoActualizado() {
		gestorDeAsignaciones.crearAsignacion(pasajeros.get(1), asientos.get(1));
		gestorDeAsignaciones.crearAsignacion(pasajeros.get(2), asientos.get(2));
		gestorDeAsignaciones.crearAsignacion(pasajeros.get(3), asientos.get(3));
		gestorDeAsignaciones.crearAsignacion(pasajeros.get(4), asientos.get(4));
		assertEquals(true,gestorDeAsignaciones.modificarAsignacionAsiento("2P-RA-20", asientos.get(5)));
		assertEquals("6P",gestorDeAsignaciones.traerUnaAsignacion("6P-RA-20").getAsiento().getNroAsiento());
		assertEquals("20384407618",gestorDeAsignaciones.traerUnaAsignacion("6P-RA-20").getPasajero().getCuil());
		assertEquals("Riperto",gestorDeAsignaciones.traerUnaAsignacion("6P-RA-20").getPasajero().getApellido());
		assertEquals("Aaron",gestorDeAsignaciones.traerUnaAsignacion("6P-RA-20").getPasajero().getNombre());
		assertEquals("3825574944",gestorDeAsignaciones.traerUnaAsignacion("6P-RA-20").getPasajero().getTelefono());
	}

	@Test
	@Order(7)
	void modificarAsignacionPasajero_TodosLosAtributos_PasajeroActualizado() {
		assertEquals(true,gestorDeAsignaciones.modificarAsignacionCuilPasajero("6P-RA-20", pasajeros.get(5)));
		assertEquals("6P",gestorDeAsignaciones.traerUnaAsignacion("6P-AW-26").getAsiento().getNroAsiento());
		assertEquals("26262626262",gestorDeAsignaciones.traerUnaAsignacion("6P-AW-26").getPasajero().getCuil());
		assertEquals("Arias",gestorDeAsignaciones.traerUnaAsignacion("6P-AW-26").getPasajero().getApellido());
		assertEquals("Walter",gestorDeAsignaciones.traerUnaAsignacion("6P-AW-26").getPasajero().getNombre());
		assertEquals("5556669982",gestorDeAsignaciones.traerUnaAsignacion("6P-AW-26").getPasajero().getTelefono());
	}
		
	@Test
	@Order(8)
	void borrarAsignacion_TodosLosAtributos_AsignacionEliminada() {
		assertEquals(true,gestorDeAsignaciones.borrarAsignacion("6P-AW-26"));
	}
	
	@Test
	@Order(9)
	void traerTodosLasAsignaciones_TodosLosAtributos_InstanciaCorrecta() {
		assertEquals(4,gestorDeAsignaciones.traerTodasLasAsignacion().size());
	}
	
	@Test
	@Order(10)
	void traerAsinacionPorApellido_TodosLosAtributos_InstanciaCorrecta() {
		assertEquals(3, gestorDeAsignaciones.traerAsignacionApellido("Arias").size());
	
	}
	
	@Test
	@Order(11)
	void borrarTodasLasAsignaciones_TodosLosAtributos_AsignacionesEliminadas() {
		assertEquals(true, gestorDeAsignaciones.borrarTodasLasAsignaciones());
		assertEquals(0, gestorDeAsignaciones.traerTodasLasAsignacion().size());
	
	}
}
