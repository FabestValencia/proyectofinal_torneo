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

        Jugador jugador = new Jugador("Santiago","Marin","circabobi@gmail.com","3219784567", LocalDate.now().minusYears(15), GeneroJugador.MASCULINO);

        equipo.registrarJugador(jugador);

        assertTrue(equipo.jugadores().contains(jugador));
        assertEquals(1, equipo.jugadores().size());

        LOG.info("Finalizado el test de registro jugador equipo");
    }

    @Test
    public void registrarJugadorTorneo(){
        LOG.info("Iniciado el test de registro jugador torneo");

        Torneo torneo = new Torneo("Copa del mundo", LocalDate.now().plusMonths(1), LocalDate.now().minusDays(15), LocalDate.now().plusDays(15), (byte)24, (byte)0, 0, TipoTorneo.LOCAL, GeneroTorneo.MIXTO);

        
        Persona representante = new Persona("Fabian","Valencia","fabest@gmail.com", "3210986789");
        Equipo equipo = new Equipo("Uniquindio", representante);

        Jugador jugador = new Jugador("Santiago","Marin","circabobi@gmail.com","3219784567", LocalDate.now().minusYears(15), GeneroJugador.MASCULINO);

        torneo.registrarEquipo(equipo);
        torneo.registrarJugador("Uniquindio",jugador);

        assertTrue(equipo.jugadores().contains(jugador));
        assertEquals(1, equipo.jugadores().size());

        LOG.info("Finalizado el test de registro jugador torneo");
    }
    
    @Test
    public void registrarJugadorTorneoSinLimiteEdad(){
        LOG.info("Iniciado el test de registro jugador torneo sin limite edad");

        Torneo torneo = new Torneo("Copa del mundo", LocalDate.now().plusMonths(1), LocalDate.now().minusDays(15), LocalDate.now().plusDays(15), (byte)24, (byte)0, 0, TipoTorneo.LOCAL, GeneroTorneo.MIXTO);

        
        Persona representante = new Persona("Fabian","Valencia","fabest@gmail.com", "3210986789");
        Equipo equipo = new Equipo("Uniquindio", representante);

        Jugador jugador = new Jugador("Santiago","Marin","circabobi@gmail.com","3219784567", LocalDate.now().minusYears(21), GeneroJugador.MASCULINO);

        torneo.registrarEquipo(equipo);
        torneo.registrarJugador("Uniquindio",jugador);

        assertTrue(equipo.jugadores().contains(jugador));
        assertEquals(1, equipo.jugadores().size());

        LOG.info("Finalizado el test de registro jugador torneo sin limite edad");
    }

    @Test
    public void registrarJugadorTorneoConLimiteEdad(){
        LOG.info("Iniciado el test de registro jugador torneo con limite edad");

        Torneo torneo = new Torneo("Copa del mundo", LocalDate.now().plusMonths(1), LocalDate.now().minusDays(15), LocalDate.now().plusDays(15), (byte)24, (byte)18, 0, TipoTorneo.LOCAL, GeneroTorneo.MIXTO);

        
        Persona representante = new Persona("Fabian","Valencia","fabest@gmail.com", "3210986789");
        Equipo equipo = new Equipo("Uniquindio", representante);

        Jugador jugador = new Jugador("Santiago","Marin","circabobi@gmail.com","3219784567", LocalDate.now().minusYears(21), GeneroJugador.MASCULINO);

        torneo.registrarEquipo(equipo);
        assertThrows(Throwable.class, ()->torneo.registrarJugador("Uniquindio",jugador));


        LOG.info("Finalizado el test de registro jugador torneo con limite edad");
    }

    @Test
    public void registrarJugadorTorneoInscripcionesCerradas(){
        LOG.info("Iniciado el test de registro jugador torneo con inscripciones cerradas");

        Torneo torneo = new Torneo("Copa del mundo", LocalDate.now().plusMonths(1), LocalDate.now().minusDays(15), LocalDate.now().plusDays(1), (byte)24, (byte)18, 0, TipoTorneo.LOCAL, GeneroTorneo.MIXTO);

        
        Persona representante = new Persona("Fabian","Valencia","fabest@gmail.com", "3210986789");
        Equipo equipo = new Equipo("Uniquindio", representante);

        Jugador jugador = new Jugador("Santiago","Marin","circabobi@gmail.com","3219784567", LocalDate.now().minusYears(15), GeneroJugador.MASCULINO);

        torneo.registrarEquipo(equipo);
        
        torneo.setFechaCierreInscripciones(LocalDate.now().minusDays(1));

        assertThrows(Throwable.class, ()->torneo.registrarJugador("Uniquindio",jugador));


        LOG.info("Finalizado el test de registro jugador torneo con inscripciones cerradas");
    }

    @Test
    public void registrarJugadorRepetidoEquipo(){
        LOG.info("Iniciado el test de registro jugador con jugador repetido");

        Persona representante = new Persona("Fabian","Valencia","fabest@gmail.com", "3210986789");
        Equipo equipo = new Equipo("Uniquindio", representante);

        Jugador jugador1 = new Jugador("Santiago","Marin","circabobi@gmail.com","3219784567", LocalDate.now().minusYears(15), GeneroJugador.MASCULINO);
        Jugador jugador2 = new Jugador("Santiago","Marin","circaelbobi@gmail.com","3219874567", LocalDate.now().minusYears(15), GeneroJugador.MASCULINO);

        equipo.registrarJugador(jugador1);
        assertThrows(Throwable.class, ()->equipo.registrarJugador(jugador2));


        LOG.info("Finalizado el test de registro jugador con jugador repetido");
    }

    @Test
    public void registrarJugadorRepetidoTorneo(){
        LOG.info("Iniciado el test de registro jugador en el torneo con jugador repetido");

        Torneo torneo = new Torneo("Copa del mundo", LocalDate.now().plusMonths(1), LocalDate.now().minusDays(15), LocalDate.now().plusDays(15), (byte)24, (byte)18, 0, TipoTorneo.LOCAL, GeneroTorneo.MIXTO);
        
        Persona representante = new Persona("Fabian","Valencia","fabest@gmail.com", "3210986789");
        
        Equipo equipo = new Equipo("Uniquindio", representante);
        Equipo equipo2 = new Equipo("Quindio", representante);

        torneo.registrarEquipo(equipo);
        torneo.registrarEquipo(equipo2);

        Jugador jugador1 = new Jugador("Santiago","Marin","circabobi@gmail.com","3219784567", LocalDate.now().minusYears(15), GeneroJugador.MASCULINO);
        Jugador jugador2 = new Jugador("Santiago","Marin","circaelbobi@gmail.com","3219874567", LocalDate.now().minusYears(15), GeneroJugador.MASCULINO);

        torneo.registrarJugador("Uniquindio", jugador1);

        assertThrows(Throwable.class, ()->torneo.registrarJugador("Quindio", jugador2));


        LOG.info("Finalizado el test de registro jugador en el torneo con jugador repetido");
    }

}
