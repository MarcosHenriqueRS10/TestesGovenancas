package br.com.fiap.calculadora;

public class Calculadora {
	

	public int soma(int num1, int num2) {
		int resultado;
		resultado = num1 + num2;
		return resultado;
	}
	
	public int subtracao(int num1, int num2) {
		int resultado;
		resultado = num1 - num2;
		return resultado;
	}
	
	public int multiplicacao(int num1, int num2) {
		int resultado;
		resultado = num1 * num2;
		return resultado;
	}
	
	public double divisao(int num1, int num2) {
		double resultado;
		resultado = num2 / num1;
		return resultado;
	}
}
