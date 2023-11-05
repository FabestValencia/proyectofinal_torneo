package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class EquipoTest {

    private static final Logger LOG = Logger.getLogger(EquipoTest.class.getName());

    @Test
    public void registrarEquipo(){
        LOG.info("Iniciado el test de registro de equipo");

        Torneo torneo = new Torneo("Copa del mundo", LocalDate.now().plusMonths(1), LocalDate.now().minusDays(15), LocalDate.now().plusDays(15), (byte)24, (byte)0, 0, TipoTorneo.LOCAL, GeneroTorneo.MIXTO);

        Persona representante = new Persona("Fabian","Valencia","fabest@gmail.com", "3210986789");
        Equipo equipo = new Equipo("Uniquindio", representante);

        torneo.registrarEquipo(equipo);

        assertTrue(torneo.getEquipos().contains(equipo));
        assertEquals(1, torneo.getEquipos().size());

        LOG.info("Finalizado el test de registro de equipo");
    }

    @Test
    public void nombreEquipoRepetido(){
        LOG.info("Iniciado el test de nombre equipo repetido");

        Torneo torneo = new Torneo("Copa del mundo", LocalDate.now().plusMonths(1), LocalDate.now().minusDays(15), LocalDate.now().plusDays(15), (byte)24, (byte)0, 0, TipoTorneo.LOCAL, GeneroTorneo.MIXTO);
        
        Persona representante = new Persona("Fabian","Valencia","fabest@gmail.com", "3210986789");
        
        Equipo equipo1 = new Equipo("Uniquindio", representante);
        Equipo equipo2 = new Equipo("Uniquindio", representante);

        torneo.registrarEquipo(equipo1);

        assertThrows(Throwable.class, ()-> torneo.registrarEquipo(equipo2));

        LOG.info("Finalizadoo el test de nombre equipo repetido");
    }

    @Test
    public void inscripcionesCerradas(){

        LOG.info("Iniciado el test de inscripcion cerrada");

        Torneo torneo = new Torneo("Copa del mundo", 
        LocalDate.now().plusMonths(1), LocalDate.now().minusDays(15), 
        LocalDate.now().minusDays(1), (byte)24, (byte)0, 0,
         TipoTorneo.LOCAL, GeneroTorneo.MIXTO);
        
        Persona representante = new Persona("Fabian","Valencia","fabest@gmail.com", "3210986789");
        
        Equipo equipo1 = new Equipo("Uniquindio", representante);

        assertThrows(Throwable.class, ()-> torneo.registrarEquipo(equipo1));

        LOG.info("Finalizadoo el test de nombre inscripcion cerrada");

    }

     @Test
    public void inscripcionesNoAbiertas(){

        LOG.info("Iniciado el test de inscripcion no abierta");

        Torneo torneo = new Torneo("Copa del mundo", LocalDate.now().plusMonths(1), LocalDate.now().plusDays(1), LocalDate.now().plusDays(15), (byte)24, (byte)0, 0, TipoTorneo.LOCAL, GeneroTorneo.MIXTO);
        
        Persona representante = new Persona("Fabian","Valencia","fabest@gmail.com", "3210986789");
        
        Equipo equipo1 = new Equipo("Uniquindio", representante);

        assertThrows(Throwable.class, ()-> torneo.registrarEquipo(equipo1));

        LOG.info("Finalizadoo el test de nombre inscripcion no abierta");

    }
    
}
