package listaExercicios01;

import java.util.Scanner;

/*
 * Problema:
 * 
 * Escrever um Programa que receba dois valores númericos e ao final 
 * mostre a soma, subtração, multiplicação e a divisão dos valores lidos.
 * 
 * @Kleryton de Souza
 * 
 * */

public class Ex02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num01 = 0;
		int num02 = 0;

		System.out.print("Entre com o primeiro numero: ");
		num01 = sc.nextInt();

		System.out.print("Entre com o segundo numero: ");
		num02 = sc.nextInt();

		System.out.println("Resultado da soma(+) dos numeros: " + (num01 + num02));
		System.out.println("Resultado da subtração(-) dos numeros: " + (num01 - num02));
		System.out.println("Resultado da multiplicação(*) dos numeros: " + (num01 * num02));
		System.out.println("Resultado da divisão(/) dos numeros: " + (num01 / num02));

		sc.close();
	}
}
