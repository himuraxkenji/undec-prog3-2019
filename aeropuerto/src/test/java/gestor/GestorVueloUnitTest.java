package gestor;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import aeropuerto.Aerolinea;
import aeropuerto.Aeropuerto;
import aeropuerto.Asiento;
import aeropuerto.Asignacion;
import aeropuerto.Avion;
import aeropuerto.Ciudad;
import aeropuerto.Pasajero;
import aeropuerto.Piloto;
import aeropuerto.Vuelo;

class GestorVueloUnitTest {
	
	Aeropuerto salida = new Aeropuerto(1, "Ezeiza", new Ciudad(1, "Buenos Aires"), "eze1234");
	LocalDate fechaHoraSalida = LocalDateTime.of(2019, 5, 1, 6, 30);
	Aeropuerto arribo = new Aeropuerto(1, "Anguinan", new Ciudad(1, "La Rioja"), "ang001");
	LocalDate fechaHoraArribo = LocalDateTime.of(2019, 5, 2, 20, 30);
	Aerolinea aerolinea = new Aerolinea(1, "Flybondy");
	List<Piloto> pilotos = new ArrayList<Piloto>();
	pilotos.add(new Piloto(1, "Alvarez", "Juan", "38440761", LocalDate.of(1993, 5, 1)));
	pilotos.add(new Piloto(2, "Del Valle", "Jose", "36660669", LocalDate.of(1992, 6, 1)));		
	List<Asiento> asientosAvion = new ArrayList<Asiento>();
	asientosAvion.add(new Asiento(1, "001"));
	asientosAvion.add(new Asiento(2, "002"));
	asientosAvion.add(new Asiento(3, "003"));
	Avion unAvion = new Avion(1, "Boeing", "A81SA", asientosAvion);
	
	
	List<Asiento> asientosAvion = new ArrayList<Asiento>();	
	asientosAvion.add(new Asiento(1, "001"));
	asientosAvion.add(new Asiento(2, "002"));
	asientosAvion.add(new Asiento(3, "003"));
	List<Asignacion> pasajeros = new ArrayList<Asignacion>(); 
	pasajeros.add(new Pasajero(1, "20384407618", "Riperto", "Adriel" ));
	pasajeros.add(new Pasajero(2, "20380060038", "Portugal", "Nahuel" ));

	
	@Test
	void crearVuelo_TodosLosAtributos_InstanciaCorrecta() {
		
		GestorDeVuelo gestorDeUnVuelo = GestorDeVuelo.getInstancia();
		assertEquals(true, gestorDeUnVuelo.crearVuelo("codigoVuelo", salida, fechaHoraSalida, arribo, fechaHoraArribo, aerolinea, pilotos, unAvion, pasajeros));
	}
	
	
	@Test
	void modificarVuelo_TodosLosAtributos_InstanciaCorrecta() {
		GestorDeVuelo gestorDeUnVuelo = GestorDeUnVuelo.getInstancia();
		assertEquals(true,gestorDeUnAvion.modificarVuelo("codigoVuelo", "0011"));
	}
	
	@Test
	void borrarAsignacion_TodosLosAtributos_AvionEliminado() {
		GestorDeVuelo gestorDeUnVuelo = GestorDeUnVuelo.getInstancia();
		gestorDeUnVuelo.crearVuelo("codigoVuelo", salida, fechaHoraSalida, arribo, fechaHoraArribo, aerolinea, pilotos, unAvion, pasajeros)
		assertEquals(true, gestorDeUnVuelo.borrarVuelo("codigoVuelo"));
	}
	
	@Test
	void traerUnVuelo_TodosLosAtributos_InstanciaCorrecta() {
		GestorDeVuelo gestorDeUnVuelo = GestorDeUnVuelo.getInstancia();
		assertEquals("0011",gestorDeUnVuelo.traerVuelo("0011").getCodigoVuelo());
	}
	
	@Test
	void traerTodosLosVuelos_TodosLosAtributos_InstanciaCorrecta() {
		GestorDeVuelo gestorDeUnVuelo = GestorDeUnVuelo.getInstancia();
		assertEquals(1,gestorDeUnVuelo.traerTodosLosVuelos().size());
	}
	
	@Test
	void traerVueloPorFechaDeSalida_TodosLosAtributos_InstanciaCorrecta() {
		GestorDeVuelo gestorDeUnVuelo = GestorDeUnVuelo.getInstancia();
		assertEquals(1, gestorDeUnVuelo.traerVueloPorFechaSalida(LocalDate.of(2019, 5, 1).size()));
	
	}

}
