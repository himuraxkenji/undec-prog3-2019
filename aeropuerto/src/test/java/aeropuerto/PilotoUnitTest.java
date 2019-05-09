package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PilotoUnitTest {

	@Test
	public void instanciarPiloto_TodosLosAtributos_InstanciaCorrecta() {

		LocalDate fechaNacimientoPiloto = LocalDate.of(2019, 5, 1);
		Piloto unPiloto = new Piloto(1, "Alvarez", "Juan", "38440761", fechaNacimientoPiloto);
		
		assertEquals(1, unPiloto.getId());
		assertEquals("Alvarez", unPiloto.getApellido());
		assertEquals("Juan", unPiloto.getNombre());
		assertEquals("38.440.761", unPiloto.getDni());
		assertEquals("2019-05-01", unPiloto.getFechaNacimiento());
	}
	
	@Test
	public void instanciarPiloto_FaltaFechaNacimiento_InstanciaCorrecta() {

		Piloto unPiloto = new Piloto(1, "Alvarez", "Juan", "38440761");
		
		assertEquals(1, unPiloto.getId());
		assertEquals("Alvarez", unPiloto.getApellido());
		assertEquals("Juan", unPiloto.getNombre());
		assertEquals("38.440.761", unPiloto.getDni());
	}
	
	@Test
	public void instanciarPiloto_FaltaApellidoPiloto_ApellidoPilotoIncompletoException() {
		LocalDate fechaNacimientoPiloto = LocalDate.of(2019, 5, 1); 
		Assertions.assertThrows(ApellidoPilotoIncompletoException.class, ()->{
			 Piloto unPiloto = new Piloto(1, "", "Juan", "38440761", fechaNacimientoPiloto);
		});
		
	}
	
	@Test
	public void instanciarPiloto_FaltaNombrePiloto_NombrePilotoIncompletoException() {
		LocalDate fechaNacimientoPiloto = LocalDate.of(2019, 5, 1); 
		Assertions.assertThrows(NombrePilotoIncompletoException.class, ()->{
			 Piloto unPiloto = new Piloto(1, "Alvarez", "", "38440761", fechaNacimientoPiloto);
		});
		
	}
	
	@Test
	public void instanciarPiloto_FaltaDNIPiloto_DNIPilotoIncompletoException() {
		LocalDate fechaNacimientoPiloto = LocalDate.of(2019, 5, 1); 
		Assertions.assertThrows(DNIPilotoIncompletoException.class, ()->{
			 Piloto unPiloto = new Piloto(1, "Alvarez", "Juan", "", fechaNacimientoPiloto);
		});
		
	}
	
	@Test
	public void modificarApellido_TodosLosDatos_ModificacionCorrecta() {
		LocalDate fechaNacimientoPiloto = LocalDate.of(2019, 5, 1);
		Piloto unPiloto = new Piloto(1, "Alvarez", "Juan", "38440761", fechaNacimientoPiloto);
		
		unPiloto.setApellido("Lopez");
		
		assertEquals("Lopez", unPiloto.getApellido());
		
	}
	
	@Test
	public void modificarNombre_TodosLosDatos_ModificacionCorrecta() {
		LocalDate fechaNacimientoPiloto = LocalDate.of(2019, 5, 1);
		Piloto unPiloto = new Piloto(1, "Alvarez", "Juan", "38440761", fechaNacimientoPiloto);
		
		unPiloto.setNombre("Jose");
		
		assertEquals("Jose", unPiloto.getNombre());
		
	}
	
	@Test
	public void modificarDNI_TodosLosDatos_ModificacionCorrecta() {
		LocalDate fechaNacimientoPiloto = LocalDate.of(2019, 5, 1);
		Piloto unPiloto = new Piloto(1, "Alvarez", "Juan", "38440761", fechaNacimientoPiloto);
		
		unPiloto.setDNI("39774621");
		
		assertEquals("39774621", unPiloto.getNombre());
		
	}
	
	@Test
	public void modificarFechaNacimiento_TodosLosDatos_ModificacionCorrecta() {
		LocalDate fechaNacimientoPiloto = LocalDate.of(2019, 5, 1);
		Piloto unPiloto = new Piloto(1, "Alvarez", "Juan", "38440761", fechaNacimientoPiloto);
		
		fechaNacimientoPiloto = LocalDate.of(2019, 6, 2);
		
		unPiloto.setDNI(fechaNacimientoPiloto);
		
		assertEquals("2019-06-02", unPiloto.getNombre());
		
	}
	

}
