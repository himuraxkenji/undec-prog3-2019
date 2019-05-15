package gestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import aeropuerto.Piloto;
import excepciones.PilotoMalFormadoException;

public class GestorPiloto {
	
	private List<Piloto> listaDePilotos;
	private static GestorPiloto gestorDePilotos;
	private static Integer codigoPiloto;
	
	private GestorPiloto() {
		this.listaDePilotos = new ArrayList<Piloto>();
	}
	
	public static GestorPiloto getInstancia() {
		if(gestorDePilotos == null)
			gestorDePilotos = new GestorPiloto();
		return gestorDePilotos;
	}

	public boolean crearPiloto(String apellido, String nombre, String dni) {
		Piloto unPiloto = null;
		try {
			codigoPiloto = listaDePilotos.size() + 1;
			unPiloto = new Piloto(codigoPiloto, apellido, nombre, dni);
			return listaDePilotos.add(unPiloto);
		}catch (PilotoMalFormadoException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public boolean crearPiloto(String apellido, String nombre, String dni, LocalDate fechaNacimiento) {
		Piloto unPiloto = null;
		try {
			codigoPiloto = listaDePilotos.size() + 1;
			unPiloto = new Piloto(codigoPiloto, apellido, nombre, dni, fechaNacimiento);
			return listaDePilotos.add(unPiloto);
		}catch (PilotoMalFormadoException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public boolean modificarApellidoPiloto(Integer codigoPiloto, String apellido) {
		listaDePilotos.get(codigoPiloto-1).setApellido(apellido);
		return true;
	}

	public boolean modificarNombrePiloto(Integer codigoPiloto, String nombre) {
		listaDePilotos.get(codigoPiloto-1).setNombres(nombre);
		return true;
	}
	
	public boolean modificarDNIPiloto(Integer codigoPiloto, String dni) {
		listaDePilotos.get(codigoPiloto-1).setDNI(dni);
		return true;
	}

	public boolean modificarFechaNacimientoPiloto(Integer codigoPiloto, LocalDate fechaNacimiento) {
		listaDePilotos.get(codigoPiloto-1).setFechaNacimiento(fechaNacimiento);
		return true;
	}
	
	public Piloto traerUnPiloto(Integer codigoPiloto) {
		return listaDePilotos.get(codigoPiloto -1 );
	}

	public List<Piloto> traerTodosLosPilotos() {
		return listaDePilotos;
	}

	public boolean borrarPiloto(Integer codigoPiloto) {
		return listaDePilotos.remove(listaDePilotos.get(codigoPiloto-1));
	}

	public List<Piloto> traerPilotoPorApellido(String apellido) {
		
		List<Piloto> listaPilotosPorApellido= new ArrayList<Piloto>();
		
		for (Piloto piloto : listaDePilotos) {
			if (piloto.getApellido().equals(apellido)) {
				listaPilotosPorApellido.add(piloto);
			}
		}
		return listaPilotosPorApellido;
	}

	public List<Piloto> traerPilotoPorNombre(String nombre) {
		List<Piloto> listaPilotosPorNombre = new ArrayList<Piloto>();
		
		for (Piloto piloto : listaDePilotos) {
			if (piloto.getNombres().equals(nombre)) {
				listaPilotosPorNombre.add(piloto);
			}
		}
		
		return listaPilotosPorNombre;
	}

	public List<Piloto> traerPilotoPorDNI(String dni) {
		List<Piloto> listaPilotosPorDNI = new ArrayList<Piloto>();
		
		for (Piloto piloto : listaDePilotos) {
			if (piloto.getDni().equals(dni)) {
				listaPilotosPorDNI.add(piloto);
			}
		}
		return listaPilotosPorDNI;
	}

	public List<Piloto> traerPilotoPorFechaNacimiento(String fechaNacimiento) {
		List<Piloto> listaPilotosPorFechaNacimiento = new ArrayList<Piloto>();
		
		for (Piloto piloto : listaDePilotos) {
			if (piloto.getFechaNacimiento().equals(fechaNacimiento)) {
				listaPilotosPorFechaNacimiento.add(piloto);
			}
		}
		return listaPilotosPorFechaNacimiento; 
	}

	public Object borrarTodosLosPilotos() {
		return listaDePilotos.removeAll(listaDePilotos);
	}

}
