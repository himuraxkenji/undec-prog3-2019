package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import excepciones.*;

class PilotoUnitTest {

	@Test
	public void instanciarPiloto_TodosLosAtributos_InstanciaCorrecta() {

		LocalDate fechaNacimientoPiloto = LocalDate.of(2019, 5, 1);
		Piloto unPiloto = null;
		
		try {
			unPiloto = new Piloto(1, "Alvarez", "Juan", "38440761", fechaNacimientoPiloto);
		}catch (PilotoMalFormadoException e){
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		assertEquals(1, unPiloto.getId());
		assertEquals("Alvarez", unPiloto.getApellido());
		assertEquals("Juan", unPiloto.getNombres());
		assertEquals("38440761", unPiloto.getDni());
		assertEquals("2019-05-01", unPiloto.getFechaNacimiento());
	}
	
	@Test
	public void instanciarPiloto_FaltaFechaNacimiento_InstanciaCorrecta() {

		Piloto unPiloto = null;
		
		try {
			unPiloto = new Piloto(1, "Alvarez", "Juan", "38440761");
		}catch (PilotoMalFormadoException e){
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		assertEquals(1, unPiloto.getId());
		assertEquals("Alvarez", unPiloto.getApellido());
		assertEquals("Juan", unPiloto.getNombres());
		assertEquals("38440761", unPiloto.getDni());
	}
	
	@Test
	public void instanciarPiloto_FaltaApellidoPiloto_ApellidoPilotoIncompletoException() {
		LocalDate fechaNacimientoPiloto = LocalDate.of(2019, 5, 1); 
		Assertions.assertThrows(PilotoApellidoIncompletoException.class, ()->{
			 Piloto unPiloto = new Piloto(1, "", "Juan", "38440761", fechaNacimientoPiloto);
		});
		
	}
	
	@Test
	public void instanciarPiloto_FaltaNombrePiloto_NombrePilotoIncompletoException() {
		LocalDate fechaNacimientoPiloto = LocalDate.of(2019, 5, 1); 
		Assertions.assertThrows(PilotoNombreIncompletoException.class, ()->{
			 Piloto unPiloto = new Piloto(1, "Alvarez", "", "38440761", fechaNacimientoPiloto);
		});
		
	}
	
	@Test
	public void instanciarPiloto_FaltaDNIPiloto_DNIPilotoIncompletoException() {
		LocalDate fechaNacimientoPiloto = LocalDate.of(2019, 5, 1); 
		Assertions.assertThrows(PilotoDNIIncompletoException.class, ()->{
			 Piloto unPiloto = new Piloto(1, "Alvarez", "Juan", "", fechaNacimientoPiloto);
		});
		
	}
	
	@Test
	public void modificarApellido_TodosLosDatos_ModificacionCorrecta() {
		LocalDate fechaNacimientoPiloto = LocalDate.of(2019, 5, 1);
		Piloto unPiloto = null;
		
		try {
			unPiloto = new Piloto(1, "Alvarez", "Juan", "38440761", fechaNacimientoPiloto);
		}catch (PilotoMalFormadoException e){
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		unPiloto.setApellido("Lopez");
		
		assertEquals("Lopez", unPiloto.getApellido());
		
	}
	
	@Test
	public void modificarNombre_TodosLosDatos_ModificacionCorrecta() {
		LocalDate fechaNacimientoPiloto = LocalDate.of(2019, 5, 1);
		Piloto unPiloto = null;
		
		try {
			unPiloto = new Piloto(1, "Alvarez", "Juan", "38440761", fechaNacimientoPiloto);
		}catch (PilotoMalFormadoException e){
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		unPiloto.setNombres("Jose");
		
		assertEquals("Jose", unPiloto.getNombres());
		
	}
	
	@Test
	public void modificarDNI_TodosLosDatos_ModificacionCorrecta() {
		LocalDate fechaNacimientoPiloto = LocalDate.of(2019, 5, 1);
		Piloto unPiloto = null;
		
		try {
			unPiloto = new Piloto(1, "Alvarez", "Juan", "38440761", fechaNacimientoPiloto);
		}catch (PilotoMalFormadoException e){
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		unPiloto.setDNI("39774621");
		
		assertEquals("39774621", unPiloto.getDni());
		
	}
	
	@Test
	public void modificarFechaNacimiento_TodosLosDatos_ModificacionCorrecta() {
		LocalDate fechaNacimientoPiloto = LocalDate.of(2019, 5, 1);
		Piloto unPiloto = null;
		
		try {
			unPiloto = new Piloto(1, "Alvarez", "Juan", "38440761", fechaNacimientoPiloto);
		}catch (PilotoMalFormadoException e){
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		fechaNacimientoPiloto = LocalDate.of(2019, 6, 2);
		
		unPiloto.setFechaNacimiento(fechaNacimientoPiloto);
		
		assertEquals("2019-06-02", unPiloto.getFechaNacimiento());
		
	}
}
