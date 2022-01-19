package listaExercicios01;

import java.util.Scanner;

/*
 * Problema:
 * 
 * Faça um Programa que receba um valor que foi depositado e exiba o valor com rendimento
 *  após um mês. Considere fixo o juro da poupança em 0,70% a. a.
 * 
 * @Kleryton de Souza
 * 
 * */

public class Ex09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final double jurosPoup = 0.007 / 12; // juros da poupança ao mês.
		double deposito = 0;

		System.out.print("Digite o valor depositado: ");
		deposito = sc.nextDouble();

		System.out.printf("Valor do rendimento ao mês para R$%.2f, corresponde"
				+ " a R$%.2f ao mês.",deposito, deposito * jurosPoup);

		sc.close();

	}

}
