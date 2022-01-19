package listaExercicios01;

import java.util.Scanner;

/*
 * Problema:
 * 
 * Fa�a um Programa que receba um valor que foi depositado e exiba o valor com rendimento
 *  ap�s um m�s. Considere fixo o juro da poupan�a em 0,70% a. a.
 * 
 * @Kleryton de Souza
 * 
 * */

public class Ex09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final double jurosPoup = 0.007 / 12; // juros da poupan�a ao m�s.
		double deposito = 0;

		System.out.print("Digite o valor depositado: ");
		deposito = sc.nextDouble();

		System.out.printf("Valor do rendimento ao m�s para R$%.2f, corresponde"
				+ " a R$%.2f ao m�s.",deposito, deposito * jurosPoup);

		sc.close();

	}

}
