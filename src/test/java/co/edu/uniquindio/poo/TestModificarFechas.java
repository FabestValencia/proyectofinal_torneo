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
                LocalDate.of(2023, 9, 15), (byte) 24, (byte) 0, (byte) 0);

        torneo.setFechaInicio(LocalDate.of(2023, 10, 12));

        assertEquals(LocalDate.of(2023, 10, 12), torneo.getFechaInicio());
        
        LOG.info("Finalizado el test de modificar fecha de inicio");
    }

    
}
