package co.edu.uniquindio.poo;

/*
 * Clase para probar el funcionamiento del codigo del torneo deportivo.
 * @autor 
 * 
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class TorneoTest {
    private static final Logger LOG = Logger.getLogger(TorneoTest.class.getName());
    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCompletos() {
        LOG.info("Iniciado el test de datos completos");
        Torneo torneo = new Torneo("Copa del mundo", LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 1),
                LocalDate.of(2023, 9, 15), (byte) 24, (byte) 0, 0, TipoTorneo.LOCAL);

        assertEquals("Copa del mundo", torneo.getNombre());
        assertEquals(LocalDate.of(2023, 10, 1), torneo.getFechaInicio());
        assertEquals(LocalDate.of(2023, 8, 1), torneo.getFechaInicioInscripciones());
        assertEquals(LocalDate.of(2023, 9, 15), torneo.getFechaCierreInscripciones());
        assertEquals((byte) 24, torneo.getNumeroParticipantes());
        assertEquals((byte) 0, torneo.getLimiteEdad());
        assertEquals(0, torneo.getValorInscripcion());

        LOG.info("Finalizado el test de datos completos");
    }

    @Test
    public void datosNulos(){
        LOG.info("Iniciado el test de datos nulos");

        assertThrows(Throwable.class, () -> new Torneo(null,null,null,null,(byte)24,(byte)0,0,TipoTorneo.LOCAL));


        LOG.info("Finalizado el test de datos nulos");
    }

    @Test
    public void participantesNegativos(){
        LOG.info("Iniciado el test de participantes negativos");

        assertThrows(Throwable.class, () -> new Torneo("Copa del mundo", LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 1),
                LocalDate.of(2023, 9, 15), (byte) -24, (byte) 0, 0, TipoTorneo.LOCAL));

        LOG.info("Finalizado el test de datos participantes negativos");
    }

    @Test
    public void limiteEdadNegativo(){
        LOG.info("Iniciado el test de limite de edad negativo");

        assertThrows(Throwable.class, () -> new Torneo("Copa del mundo", LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 1),
                LocalDate.of(2023, 9, 15), (byte) 24, (byte) -1, 0, TipoTorneo.LOCAL));

        LOG.info("Finalizado el test de limite de edad negativo");
    }

    @Test
    public void inscripcionNegativo(){
        LOG.info("Iniciado el test de inscripcion negativa");

        assertThrows(Throwable.class, () -> new Torneo("Copa del mundo", LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 1),
                LocalDate.of(2023, 9, 15), (byte) 24, (byte) 0,  -1, TipoTorneo.LOCAL));

        LOG.info("Finalizado el test de inscripcion negativa");
    }

    @Test
    public void inscripcionTardia(){
        LOG.info("Iniciado el test de inscripcion tardia");

        assertThrows(Throwable.class, () -> new Torneo("Copa del mundo", LocalDate.of(2023, 10, 1), LocalDate.of(2023, 11, 1),
                LocalDate.of(2023, 11, 15), (byte) 24, (byte) 0, 0,TipoTorneo.LOCAL));

        LOG.info("Finalizado el test de inscripcion tardia");

    }

    @Test
    public void cierreInscripcionesAnteriorInicio(){
        LOG.info("Iniciado el test de cierre inscripciones anterior inicio");

        assertThrows(Throwable.class, () -> new Torneo("Copa del mundo", LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 15),
                LocalDate.of(2023, 8, 1), (byte) 24, (byte) 0, 0, TipoTorneo.LOCAL));

        LOG.info("Finalizado el test de cierre inscripciones anterior inicio");

    }



}
