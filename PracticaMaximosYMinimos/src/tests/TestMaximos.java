package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.Maximos;

class TestMaximos {


	@Test void testMaximoDe2EnterosPositivos() {
		int  esperado=3;
		int obtenido=(int) Maximos.MaximoDe2EnterosPositivos(2, 1);
		assertEquals(esperado,obtenido);
	}
	
	@Test void testMaximoDe3EnterosPositivos() {
		int  esperado=3;
		int obtenido=(int) Maximos.MaximoDe3EnterosPositivos(2, 1, 4);
		assertEquals(esperado,obtenido);
	}

}
