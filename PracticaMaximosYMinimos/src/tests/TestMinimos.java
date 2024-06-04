package tests;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.Minimos;

class TestMinimos {
	


	@Test void testMinimoDe2EnterosPositivos() {
		int  esperado=3;
		int obtenido=(int)Minimos.MinimoDe2EnterosPositivos(2, 1);
		assertEquals(esperado,obtenido);
	}
	
	@Test void testMinimoDe3EnterosPositivos() {
		int  esperado=3;
		int obtenido=(int)Minimos.MinimoDe3EnterosPositivos(2, 1, 3);
		assertEquals(esperado,obtenido);
	}
}
