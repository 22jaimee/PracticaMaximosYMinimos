package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestMaximos {

	private static ArrayList<Float> numerosValidos;
    private static ArrayList<Float> numerosInvalidos;

    @BeforeAll
    static void setUp() {
    	numerosValidos = new ArrayList<>(Arrays.asList(5.0f, 7.5f, 8.0f));
        numerosInvalidos = new ArrayList<>(Arrays.asList(-5.0f, -12.0f, -18.0f));
    }

    @Test
    void testNumeroMinimoValido() {
        assertEquals(5.0f, minimo.MinimoDe2EnterosPositivos(numerosValidos));
    }

    @Test
    void testNumeroMinimoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            MisArrays.minimaNota(numerosInvalidos);
        });
    }

}
