package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestMinimos {

	private static ArrayList<Float> dosnumerosValidos;
    private static ArrayList<Float> dosnumerosInvalidos;
    private static ArrayList<Float> tresnumerosValidos;
    private static ArrayList<Float> tresnumerosInvalidos;

    @BeforeAll
    static void setUp() {
    	dosnumerosValidos = new ArrayList<>(Arrays.asList(5.0f, 7.5f, 8.0f));
        dosnumerosInvalidos = new ArrayList<>(Arrays.asList(-5.0f, -12.0f, -18.0f));
        tresnumerosValidos = new ArrayList<>(Arrays.asList(5.0f, 7.5f, 8.0f));
        tresnumerosInvalidos = new ArrayList<>(Arrays.asList(-5.0f, -12.0f, -18.0f));
    }

    /*@Test
    void testNumeroMinimoValido() {
        assertEquals(5.0f, misArrays.MinimoDe2EnterosPositivos(numerosValidos));
    }

    @Test
    void testNumeroMinimoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            MisArrays.minimaNota(numerosInvalidos);
        });
    }*/
}
