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
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());
    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCompletos() {
        LOG.info("Iniciado el test de datos completos");
        Torneo torneo = new Torneo("Copa del mundo", LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 1),
                LocalDate.of(2023, 9, 15), (byte) 24, (byte) 0, (byte) 0);

        assertEquals("Copa del mundo", torneo.nombre());
        assertEquals(LocalDate.of(2023, 10, 1), torneo.fechaInicio());
        assertEquals(LocalDate.of(2023, 8, 1), torneo.fechaInicioInscripciones());
        assertEquals(LocalDate.of(2023, 9, 15), torneo.fechaCierreInscripciones());
        assertEquals((byte) 24, torneo.numeroParticipantes());
        assertEquals((byte) 0, torneo.limiteEdad());
        assertEquals((byte) 0, torneo.valorInscripcion());

        LOG.info("Finalizado el test de datos completos");
    }

    @Test
    public void datosNulos(){
        LOG.info("Iniciado el test de datos nulos");

        assertThrows(Throwable.class, () -> new Torneo(null,null,null,null,(byte)24,(byte)0,(byte)0));


        LOG.info("Finalizado el test de datos nulos");
    }

    @Test
    public void participantesNegativos(){
        LOG.info("Iniciado el test de participantes negativos");

        assertThrows(Throwable.class, () -> new Torneo("Copa del mundo", LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 1),
                LocalDate.of(2023, 9, 15), (byte) -24, (byte) 0, (byte) 0));

        LOG.info("Finalizado el test de datos participantes negativos");
    }

    @Test
    public void limiteEdadNegativo(){
        LOG.info("Iniciado el test de limite de edad negativo");

        assertThrows(Throwable.class, () -> new Torneo("Copa del mundo", LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 1),
                LocalDate.of(2023, 9, 15), (byte) 24, (byte) -1, (byte) 0));

        LOG.info("Finalizado el test de limite de edad negativo");
    }

    @Test
    public void inscripcionNegativo(){
        LOG.info("Iniciado el test de inscripcion hegativa");

        assertThrows(Throwable.class, () -> new Torneo("Copa del mundo", LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 1),
                LocalDate.of(2023, 9, 15), (byte) 24, (byte) 0, (byte) -1));

        LOG.info("Finalizado el test de inscripcion negativa");
    }

}
