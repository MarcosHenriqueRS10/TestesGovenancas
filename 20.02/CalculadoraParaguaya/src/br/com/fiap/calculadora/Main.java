package br.com.fiap.calculadora;

public class Main {

	public static void main(String[] args) {

	Calculadora calculadora = new Calculadora();
	
	System.out.println("O resultado da soma é: " + calculadora.soma(1, 2));
	System.out.println("O resultado da subtracao é: " + calculadora.subtracao(4, 2));
	System.out.println("O resultado da multiplicacao é: " + calculadora.multiplicacao(3, 3));
	System.out.println("O resultado da divisao é: " + calculadora.divisao(5, 2));
	}
}
