package co.edu.uniquindio;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class BatallonTest {
    private static final Logger LOG = Logger.getLogger(BatallonTest.class.getName());

    @Test
    public void crearVehiculoBlindadoTest() {
        LOG.info("La prueba crearVehiculoBlindadoTest ha iniciado.");
        Batallon newBatallon = new Batallon("Calarca", "1");

        boolean respuesta = newBatallon.crearVehiculoBlindado("002","1999", 1998, 1922, EstadoOperativo.DISPONIBLE,10);

        assertTrue(respuesta);



        LOG.info("La prueba crearVehiculoBlindadoTest ha iniciado.");
    }

}