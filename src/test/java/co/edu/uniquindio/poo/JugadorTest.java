package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class JugadorTest {

    private static final Logger LOG = Logger.getLogger(EquipoTest.class.getName());

    @Test
    public void registrarJugadorEquipo(){
        LOG.info("Iniciado el test de registro jugador equipo");

        Persona representante = new Persona("Fabian","Valencia","fabest@gmail.com", "3210986789");
        Equipo equipo = new Equipo("Uniquindio", representante);

        Jugador jugador = new Jugador("Santiago","Marin","circabobi@gmail.com","3219784567", LocalDate.now().minusYears(15));

        equipo.registrarJugador(jugador);

        assertTrue(equipo.jugadores().contains(jugador));
        assertEquals(1, equipo.jugadores().size());

        LOG.info("Finalizado el test de registro jugador equipo");
    }

    @Test
    public void registrarJugadorTorneo(){
        LOG.info("Iniciado el test de registro jugador torneo");

        Torneo torneo = new Torneo("Copa del mundo", LocalDate.now().plusMonths(1), LocalDate.now().minusDays(15), LocalDate.now().plusDays(15), (byte)24, (byte)0, 0, TipoTorneo.LOCAL);

        
        Persona representante = new Persona("Fabian","Valencia","fabest@gmail.com", "3210986789");
        Equipo equipo = new Equipo("Uniquindio", representante);

        Jugador jugador = new Jugador("Santiago","Marin","circabobi@gmail.com","3219784567", LocalDate.now().minusYears(15));

        torneo.registrarEquipo(equipo);
        torneo.registrarJugador("Uniquindio",jugador);

        assertTrue(equipo.jugadores().contains(jugador));
        assertEquals(1, equipo.jugadores().size());

        LOG.info("Finalizado el test de registro jugador torneo");
    }
    
}
