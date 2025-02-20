package br.com.fiap.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTeste {

	@Test
	public void testesoma1com1() {		
		
		//variaveis de comparação
		int nro1 = 2;
		int nro2 = 2;	
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 4;
		int resultadoReal = calc.soma(2, 2);
		assertEquals(resultadoReal, resultadoEsperado);	
	}
	@Test
	public void testesoma10com5() {
		int nro1 = 2;
		int nro2 = 2;	
		Calculadora calc1 = new Calculadora();
		int resultadoEsperado1 = 15;
		int resultadoReal1 = calc1.soma(10, 5);
		assertEquals(resultadoReal1, resultadoEsperado1);	
	}	
	@Test
	public void testeDivisao3com2() {
		int nro1 = 3;
		int nro2 = 2;
		int resultadoEsperado2 = 6;
		Calculadora calc2 = new Calculadora();
		double resultadoReal = 0;
		double resultadoReal = calc2.soma(nro1, nro2);
		assertEquals(resultadoEsperado2, resultadoReal, 0.6);
	}
	@Test
	public void testesoma4com4() {
		int resultadoReal3 = 0;
		int resultadoEsperado3 = 8;
		Calculadora calc3 = new Calculadora();
		resultadoReal3 = calc3.soma(4, 4);
		assertEquals(resultadoReal3, resultadoEsperado3);
}


}
