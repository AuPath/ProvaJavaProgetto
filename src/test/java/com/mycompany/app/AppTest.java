package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AppTests {

	@DisplayName("BOH")
	@Test
	void prova() {
		assertEquals(2, 1 + 1, "prova");
	}

	@DisplayName("BOH2")
	@Test
	void prova2() {
		assertEquals(3, 3);
	}

	@Test
	public void ll() {
	    

	}

}
