package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class TestModificarFechas {

    private static final Logger LOG = Logger.getLogger(TestModificarFechas.class.getName());

    @Test
    public void modificarFechaInicio(){
        LOG.info("Iniciado el test de modificar fecha de inicio");
        Torneo torneo = new Torneo("Copa del mundo", LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 1),
                LocalDate.of(2023, 9, 15), (byte) 24, (byte) 0, 0, TipoTorneo.LOCAL, GeneroTorneo.MIXTO);

        torneo.setFechaInicio(LocalDate.of(2023, 10, 12));

        assertEquals(LocalDate.of(2023, 10, 12), torneo.getFechaInicio());
        
        LOG.info("Finalizado el test de modificar fecha de inicio");
    }

    @Test
    public void modicicarFechaInicioNulo(){
        LOG.info("Iniciado el test de modificar fecha nulo");

        Torneo torneo = new Torneo("Copa del mundo", LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 1),
                LocalDate.of(2023, 9, 15), (byte) 24, (byte) 0, 0, TipoTorneo.LOCAL, GeneroTorneo.MIXTO);

        assertThrows(Throwable.class, ()-> torneo.setFechaInicio(null));
        
        LOG.info("Finalizado el test de modificar fecha nulo");
    }

    @Test
    public void modificarFechaInicioAnteriorInscripciones(){
        LOG.info("Iniciado el test de modificar fecha inicio anterior a inscripciones");

        Torneo torneo = new Torneo("Copa del mundo", LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 1),
                LocalDate.of(2023, 9, 15), (byte) 24, (byte) 0, 0, TipoTorneo.LOCAL, GeneroTorneo.MIXTO);

        assertThrows(Throwable.class, ()-> torneo.setFechaInicio(LocalDate.of(2023, 7, 1)));

        LOG.info("Finalizado el test de modificar fecha inicio anterior a inscripciones");
    }

    @Test
    public void modificarFechaInicioInscripciones(){
        LOG.info("Iniciado el test de modificar fecha de inicio de inscripciones");
        
        Torneo torneo = new Torneo("Copa del mundo", LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 1),
                LocalDate.of(2023, 9, 15), (byte) 24, (byte) 0, 0, TipoTorneo.LOCAL, GeneroTorneo.MIXTO);

        torneo.setFechaInicioInscripciones(LocalDate.of(2023, 8, 10));

        assertEquals(LocalDate.of(2023, 8, 10), torneo.getFechaInicioInscripciones());
        
        LOG.info("Finalizado el test de modificar fecha de inicio de inscripciones");
    }

    @Test
    public void modificarFechaInicioInscripcionesNulo(){
        LOG.info("Iniciado el test de modificar fecha de incripciones con nulo");

        Torneo torneo = new Torneo("Copa del mundo", LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 1),
                LocalDate.of(2023, 9, 15), (byte) 24, (byte) 0, 0, TipoTorneo.LOCAL, GeneroTorneo.MIXTO);

        assertThrows(Throwable.class, ()-> torneo.setFechaInicioInscripciones(null));
        
        LOG.info("Finalizado el test de modificar fecha de incripciones con nulo");
    }

}
