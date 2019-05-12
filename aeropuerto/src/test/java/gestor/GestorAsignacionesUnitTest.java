package gestor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GestorAsignacionesUnitTest {
	
	
	@Test
	void crearAsignacion_TodosLosAtributos_InstanciaCorrecta() {
		GestorAsignacion gestorDeAsignaciones = GestorAsignacion.getInstancia();
		assertEquals(true, gestorDeAsignaciones.crearAsignacion(1, "0001",1, "20384407618", "Riperto", "Adriel", "3825574945", "CodAsig001" ));
	}
	
	
	@Test
	void modificarDatosAsignacion_TodosLosAtributos_InstanciaCorrecta() {
		GestorAsignacion gestorDeAsignaciones = GestorAsignacion.getInstancia();
		gestorDeAsignaciones.crearAsignacion(2, "0002",2, "20384407616", "Riperto", "Aaron", "3825574944", "CodAsig002");
		assertEquals(true,gestorDeAsignaciones.modificarPasajeroAsignacionApellido("004", "Ruperto"));
	}
	
	
	@Test
	void borrarAsignacion_TodosLosAtributos_AsignacionEliminada() {
		GestorAsignacion gestorDeAsignaciones = GestorAsignacion.getInstancia();
		gestorDeAsignaciones.crearAsignacion(3, "0003",3, "20384407616", "Riperto", "Nehemias", "3825574944", "CodAsig003");
		assertEquals(true,gestorDeAsignaciones.borrarAsignacion("CodAsig003"));
	}
	
	@Test
	void traerUnaAsignacion_TodosLosAtributos_InstanciaCorrecta() {
		GestorAsignacion gestorDeAsignaciones = GestorAsignacion.getInstancia();
		gestorDeAsignaciones.crearAsignacion(4, "0004",4, "20384407617", "Riperto", "Ayax", "3825574944", "CodAsig004");
		assertEquals(true,gestorDeAsignaciones.traerUnaAsignacion("CodAsig004"));
	}
	
	@Test
	void traerTodosLosPasajeros_TodosLosAtributos_InstanciaCorrecta() {
		GestorAsignacion gestorDeAsignaciones = GestorAsignacion.getInstancia();
		gestorDeAsignaciones.crearAsignacion(5, "0005",5, "20384407617", "Arias", "Micaela", "3825574944", "CodAsig005");
		assertEquals(4,gestorDeAsignaciones.traerTodasLasAsignacion().size());
	}
	
	@Test
	void traerAsinacionPorApellido_TodosLosAtributos_InstanciaCorrecta() {
		GestorPasajeros gestorDePasajeros = GestorPasajeros.getInstancia();
		assertEquals(3, gestorDePasajeros.traerPilotoPorApellido("Riperto").size());
	
	}
	
}
