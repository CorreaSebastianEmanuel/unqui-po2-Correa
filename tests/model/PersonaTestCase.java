package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {
	
	public Persona persona;

	@BeforeEach
	void setUp() throws Exception {
		this.persona= new Persona("Sebo");
	}

	@Test
	void test() {
		assertEquals("Sebo", persona.getNombre());
	}

}
