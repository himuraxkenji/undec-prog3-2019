package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import excepciones.*;

class VueloUnitTest {


	@Test
	public void instanciarVuelo_TodosLosAtributos_InstanciaCorrecta() {
		Aeropuerto salida = null;
		try {
			salida = new Aeropuerto(1, "Ezeiza", new Ciudad(1, "Buenos Aires"), "eze1234");
		} catch (AerolineaMalFormadaException e) {
			e.printStackTrace();
		} catch (CiudadMalFormadaException e) {
			e.printStackTrace();
		}
		
		LocalDateTime fechaHoraSalida = LocalDateTime.of(2019, 5, 1, 6, 30);
		
		Aeropuerto arribo = null;
		try {
			arribo = new Aeropuerto(1, "Anguinan", new Ciudad(1, "La Rioja"), "ang001");
		} catch (AerolineaMalFormadaException e) {
			e.printStackTrace();
		} catch (CiudadMalFormadaException e) {
			e.printStackTrace();
		}
		
		LocalDateTime fechaHoraArribo = LocalDateTime.of(2019, 5, 2, 20, 30);
		
		Aerolinea aerolinea = null;
		try {
			aerolinea = new Aerolinea(1, "Flybondy");
		} catch (AerolineaMalFormadaException e) {
			e.printStackTrace();
		}
		
		List<Piloto> pilotos = new ArrayList<Piloto>();
		
		try {
			pilotos.add(new Piloto(1, "Alvarez", "Juan", "38440761", LocalDate.of(1993, 5, 1)));
			pilotos.add(new Piloto(2, "Del Valle", "Jose", "36660669", LocalDate.of(1992, 6, 1)));		
		} catch (PilotoMalFormadoException e) {
			e.printStackTrace();
		}
		
		Avion unAvion = null;
		try {
			unAvion = new Avion(1, "Boeing", "A81SA", 12);
		} catch (AvionMalFormadoException e) {
			e.printStackTrace();
		}
		
		List<Asignacion> asignacion = new ArrayList<Asignacion>(); 
		
		try {
			asignacion.add(new Asignacion(new Pasajero(1, "20384407618", "Riperto", "Adriel" ), new Asiento(1, "001"), "A001" ));
		} catch (AsientoMalFormadoException e1) {
			e1.printStackTrace();
		} catch (PasajeroMalFormadoException e1) {
			e1.printStackTrace();
		}
		
		Vuelo unVuelo = null;
		
		try {
			unVuelo = new Vuelo("codigoVuelo", salida, fechaHoraSalida, arribo, fechaHoraArribo, aerolinea, pilotos, unAvion, asignacion);
		}catch (VueloMalFormadoException e) { 
			e.printStackTrace();
		}
		
		assertEquals("codigoVuelo", unVuelo.getCodigoVuelo()); 
		assertEquals("Ezeiza", unVuelo.getSalida().getNombre());
		assertEquals("2019-05-01T06:30", unVuelo.getFechaHoraSalida().toString());
		assertEquals("Anguinan", unVuelo.getArribo().getNombre());
		assertEquals("2019-05-02T20:30", unVuelo.getFechaHoraArribo().toString());
		assertEquals("Flybondy", unVuelo.getAerolinea().getNombre());
		assertEquals("Alvarez", unVuelo.getPilotos().get(0).getApellido());
		assertEquals("Del Valle", unVuelo.getPilotos().get(1).getApellido());
		assertEquals("Boeing", unVuelo.getAvion().getModelo());
		assertEquals("Riperto", unVuelo.getAsignaciones().get(0).getPasajero().getApellido());
	}
	
	@Test
	public void instanciarVuelo_FaltaCodigoVuelo_VueloCodigoIncompletoException() {
		
		Assertions.assertThrows(VueloCodigoIncompletoException.class, ()->{
			Aeropuerto salida = null;
			try {
				salida = new Aeropuerto(1, "Ezeiza", new Ciudad(1, "Buenos Aires"), "eze1234");
			} catch (AerolineaMalFormadaException e) {
				e.printStackTrace();
			} catch (CiudadMalFormadaException e) {
				e.printStackTrace();
			}
			
			LocalDateTime fechaHoraSalida = LocalDateTime.of(2019, 5, 1, 6, 30);
			
			Aeropuerto arribo = null;
			try {
				arribo = new Aeropuerto(1, "Anguinan", new Ciudad(1, "La Rioja"), "ang001");
			} catch (AerolineaMalFormadaException e) {
				e.printStackTrace();
			} catch (CiudadMalFormadaException e) {
				e.printStackTrace();
			}
			
			LocalDateTime fechaHoraArribo = LocalDateTime.of(2019, 5, 2, 20, 30);
			
			Aerolinea aerolinea = null;
			try {
				aerolinea = new Aerolinea(1, "Flybondy");
			} catch (AerolineaMalFormadaException e) {
				e.printStackTrace();
			}
			
			List<Piloto> pilotos = new ArrayList<Piloto>();
			
			try {
				pilotos.add(new Piloto(1, "Alvarez", "Juan", "38440761", LocalDate.of(1993, 5, 1)));
				pilotos.add(new Piloto(2, "Del Valle", "Jose", "36660669", LocalDate.of(1992, 6, 1)));		
			} catch (PilotoMalFormadoException e) {
				e.printStackTrace();
			}
			
			Avion unAvion = null;
			try {
				unAvion = new Avion(1, "Boeing", "A81SA", 12);
			} catch (AvionMalFormadoException e) {
				e.printStackTrace();
			}
			
			List<Asignacion> asignacion = new ArrayList<Asignacion>(); 
			
			try {
				asignacion.add(new Asignacion(new Pasajero(1, "20384407618", "Riperto", "Adriel" ), new Asiento(1, "001"), "A001" ));
			} catch (AsientoMalFormadoException e1) {
				e1.printStackTrace();
			} catch (PasajeroMalFormadoException e1) {
				e1.printStackTrace();
			}
			Vuelo unVuelo = null;
			unVuelo = new Vuelo("", salida, fechaHoraSalida, arribo, fechaHoraArribo, aerolinea, pilotos, unAvion, asignacion);
		});
	}
	
	@Test
	public void instanciarVuelo_FaltaFechaHoraSalida_VueloFechaHoraSalidaIncompletaException() {
		
		Assertions.assertThrows(VueloFechaHoraSalidaIncompletaException.class, ()->{
			Aeropuerto salida = null;
			try {
				salida = new Aeropuerto(1, "Ezeiza", new Ciudad(1, "Buenos Aires"), "eze1234");
			} catch (AerolineaMalFormadaException e) {
				e.printStackTrace();
			} catch (CiudadMalFormadaException e) {
				e.printStackTrace();
			}
			
			LocalDateTime fechaHoraSalida = null;
			
			Aeropuerto arribo = null;
			try {
				arribo = new Aeropuerto(1, "Anguinan", new Ciudad(1, "La Rioja"), "ang001");
			} catch (AerolineaMalFormadaException e) {
				e.printStackTrace();
			} catch (CiudadMalFormadaException e) {
				e.printStackTrace();
			}
			
			LocalDateTime fechaHoraArribo = LocalDateTime.of(2019, 5, 2, 20, 30);
			
			Aerolinea aerolinea = null;
			try {
				aerolinea = new Aerolinea(1, "Flybondy");
			} catch (AerolineaMalFormadaException e) {
				e.printStackTrace();
			}
			
			List<Piloto> pilotos = new ArrayList<Piloto>();
			
			try {
				pilotos.add(new Piloto(1, "Alvarez", "Juan", "38440761", LocalDate.of(1993, 5, 1)));
				pilotos.add(new Piloto(2, "Del Valle", "Jose", "36660669", LocalDate.of(1992, 6, 1)));		
			} catch (PilotoMalFormadoException e) {
				e.printStackTrace(); 
			}
			
			Avion unAvion = null;
			try {
				unAvion = new Avion(1, "Boeing", "A81SA", 12);
			} catch (AvionMalFormadoException e) {
				e.printStackTrace();
			}
			
			List<Asignacion> asignacion = new ArrayList<Asignacion>(); 
			
			try {
				asignacion.add(new Asignacion(new Pasajero(1, "20384407618", "Riperto", "Adriel" ), new Asiento(1, "001"), "A001" ));
			} catch (AsientoMalFormadoException e1) {
				e1.printStackTrace();
			} catch (PasajeroMalFormadoException e1) {
				e1.printStackTrace();
			}
			Vuelo unVuelo = null;
			unVuelo = new Vuelo("001", salida, fechaHoraSalida, arribo, fechaHoraArribo, aerolinea, pilotos, unAvion, asignacion);
		});
	}
	
	@Test
	public void instanciarVuelo_FaltaFechaHoraArribo_VueloFechaHoraArriboIncompletaException() {
		
		Assertions.assertThrows(VuelofechaHoraArriboException.class, ()->{
			Aeropuerto salida = null;
			try {
				salida = new Aeropuerto(1, "Ezeiza", new Ciudad(1, "Buenos Aires"), "eze1234");
			} catch (AerolineaMalFormadaException e) {
				e.printStackTrace();
			} catch (CiudadMalFormadaException e) {
				e.printStackTrace();
			}
			
			LocalDateTime fechaHoraSalida = LocalDateTime.of(2019, 5, 1, 6, 30);
			
			Aeropuerto arribo = null;
			try {
				arribo = new Aeropuerto(1, "Anguinan", new Ciudad(1, "La Rioja"), "ang001");
			} catch (AerolineaMalFormadaException e) {
				e.printStackTrace();
			} catch (CiudadMalFormadaException e) {
				e.printStackTrace();
			}
			
			LocalDateTime fechaHoraArribo = null;
			
			Aerolinea aerolinea = null;
			try {
				aerolinea = new Aerolinea(1, "Flybondy");
			} catch (AerolineaMalFormadaException e) {
				e.printStackTrace();
			}
			
			List<Piloto> pilotos = new ArrayList<Piloto>();
			
			try {
				pilotos.add(new Piloto(1, "Alvarez", "Juan", "38440761", LocalDate.of(1993, 5, 1)));
				pilotos.add(new Piloto(2, "Del Valle", "Jose", "36660669", LocalDate.of(1992, 6, 1)));		
			} catch (PilotoMalFormadoException e) {
				e.printStackTrace();
			}
			
			Avion unAvion = null;
			try {
				unAvion = new Avion(1, "Boeing", "A81SA", 12);
			} catch (AvionMalFormadoException e) {
				e.printStackTrace();
			}
			
			List<Asignacion> asignacion = new ArrayList<Asignacion>(); 
			
			try {
				asignacion.add(new Asignacion(new Pasajero(1, "20384407618", "Riperto", "Adriel" ), new Asiento(1, "001"), "A001" ));
			} catch (AsientoMalFormadoException e1) {
				e1.printStackTrace();
			} catch (PasajeroMalFormadoException e1) {
				e1.printStackTrace();
			}
			Vuelo unVuelo = null;
			unVuelo = new Vuelo("001", salida, fechaHoraSalida, arribo, fechaHoraArribo, aerolinea, pilotos, unAvion, asignacion);
		});
	}
	@Test
	public void AgregarAsignacion_TodosLosAtributos_InstanciaCorrecta() {
		Aeropuerto salida = null;
		try {
			salida = new Aeropuerto(1, "Ezeiza", new Ciudad(1, "Buenos Aires"), "eze1234");
		} catch (AerolineaMalFormadaException e) {
			e.printStackTrace();
		} catch (CiudadMalFormadaException e) {
			e.printStackTrace();
		}
		
		LocalDateTime fechaHoraSalida = LocalDateTime.of(2019, 5, 1, 6, 30);
		
		Aeropuerto arribo = null;
		try {
			arribo = new Aeropuerto(1, "Anguinan", new Ciudad(1, "La Rioja"), "ang001");
		} catch (AerolineaMalFormadaException e) {
			e.printStackTrace();
		} catch (CiudadMalFormadaException e) {
			e.printStackTrace();
		}
		
		LocalDateTime fechaHoraArribo = LocalDateTime.of(2019, 5, 2, 20, 30);
		
		Aerolinea aerolinea = null;
		try {
			aerolinea = new Aerolinea(1, "Flybondy");
		} catch (AerolineaMalFormadaException e) {
			e.printStackTrace();
		}
		
		List<Piloto> pilotos = new ArrayList<Piloto>();
		
		try {
			pilotos.add(new Piloto(1, "Alvarez", "Juan", "38440761", LocalDate.of(1993, 5, 1)));
			pilotos.add(new Piloto(2, "Del Valle", "Jose", "36660669", LocalDate.of(1992, 6, 1)));		
		} catch (PilotoMalFormadoException e) {
			e.printStackTrace();
		}
		
		Avion unAvion = null;
		try {
			unAvion = new Avion(1, "Boeing", "A81SA", 12);
		} catch (AvionMalFormadoException e) {
			e.printStackTrace();
		}
		
		List<Asignacion> asignacion = new ArrayList<Asignacion>(); 
		Asignacion nuevoPasajero = null;
		try {
			asignacion.add(new Asignacion(new Pasajero(1, "20384407618", "Riperto", "Adriel" ), new Asiento(1, "001"), "A001" ));
			nuevoPasajero = new Asignacion(new Pasajero(2, "20384407616", "Riperto", "Aaron" ), new Asiento(2, "002"), "A002" );
		} catch (AsientoMalFormadoException e1) {
			e1.printStackTrace();
		} catch (PasajeroMalFormadoException e1) {
			e1.printStackTrace();
		}
		
		Vuelo unVuelo = null;
		
		try {
			unVuelo = new Vuelo("codigoVuelo", salida, fechaHoraSalida, arribo, fechaHoraArribo, aerolinea, pilotos, unAvion, asignacion);
		}catch (VueloMalFormadoException e) { 
			e.printStackTrace();
		}
		
		unVuelo.anadirPasajero(nuevoPasajero);
		assertEquals(2, unVuelo.getAsignaciones().size()); 
	}
}
