package ModelUnitTest;

import Exceptions.EquipoIncompletoException;
import Exceptions.JugadorIncompletoException;
import Model.Equipo;
import Model.Jugador;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

public class EquipoUnitTest {

    @Test
    public void factoryEquipo_EquipoCompleto_instanciaCorrecta() throws EquipoIncompletoException {

        Equipo elEquipo= Equipo.instancia(1,"Barcelona", new ArrayList<Jugador>());
        Assertions.assertNotNull(elEquipo);

    }

    @Test
    public void factoryEquipo_EquipoIncompleto_EquipoIncompletoException(){
        Assertions.assertThrows(EquipoIncompletoException.class, () -> Equipo.instancia(null,null,null));

    }
    @Test
    public void factoryEquipo_EquipoEquals_EquipoRepetido() throws EquipoIncompletoException {
        Equipo equipoUno= Equipo.instancia(1,"Barcelona", new ArrayList<Jugador>());
        Equipo equipoDos= Equipo.instancia(1,"Barcelona", new ArrayList<Jugador>());

        Assertions.assertEquals(equipoUno, equipoDos);

    }

    @Test
    public void factoryEquipo_agregarJugadorEquipo_AgregadoJugador() throws EquipoIncompletoException, JugadorIncompletoException {
        Equipo equipoUno= Equipo.instancia(1,"Barcelona", new ArrayList<Jugador>());
        Jugador elJugador = Jugador.instancia(1, "Lionel Messi", LocalDate.of(1987, 6, 24), 1.7, "12345678");

        Assertions.assertTrue(equipoUno.asignarJugador(elJugador));

    }

    @Test
    public void factoryEquipo_agregarJugadorEquipo_JugadorNoAgregado() throws EquipoIncompletoException, JugadorIncompletoException {
        Equipo equipoUno= Equipo.instancia(1,"Barcelona", new ArrayList<Jugador>());
        Jugador elJugador = Jugador.instancia(1, "Lionel Messi", LocalDate.of(1987, 6, 24), 1.7, "12345678");
        equipoUno.asignarJugador(elJugador);
        Assertions.assertFalse(equipoUno.asignarJugador(elJugador));

    }


}
