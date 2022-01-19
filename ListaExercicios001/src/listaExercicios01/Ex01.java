package listaExercicios01;

import java.util.Scanner;

/*
 * Problema:
 * 
 * Escrever um Programa que receba dois valores númericos 
 * e exiba o maior entre os 2 numeros, use Scanner, validar 
 * caso os numeros forem iguais também.
 * 
 * @Kleryton de souza
 * 
 */

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num01 = 0;
		int num02 = 0;
		
		System.out.print("Digite o numero 01: ");
		num01 = sc.nextInt();
		System.out.print("Digite o numero 02: ");
		num02 = sc.nextInt();

		if (num01 > num02) {
			System.out.print("Numero " + num01 + " é MAIOR que o numero " + num02);
		} else if (num01 == num02) {
			System.out.print("Numero " + num01 + " é IGUAL ao numero " + num02);
		} else {
			System.out.println("Numero " + num01 + " é MENOR que o numero " + num02);
		}

		sc.close();

	}

}
