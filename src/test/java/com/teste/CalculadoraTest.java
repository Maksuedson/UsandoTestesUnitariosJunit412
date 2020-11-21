package com.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		int soma =  calc.somar("1+3+3");
		assertEquals(7, soma);
	}

}
