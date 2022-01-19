package listaExercicios01;

import java.util.Scanner;

/*
 * 
 * Elaborar um Programa que efetue a apresenta��o do valor da convers�o em real (R$) 
 * de um valor lido em d�lar (US$). O Programa dever� solicitar o valor da cota��o do
 *  d�lar e tamb�m a quantidade de d�lares dispon�veis com o usu�rio. Use o do-while.
 * 
 * @Kleryton de Souza
 * 
 * */

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float dolar = 0;
		float real = 0;
		String op;
		
		System.out.print("Digite o valor da cota��o do dolar(US$): ");
		dolar = sc.nextFloat();
		
			do {
				System.out.print("Digite o valor em real(R$) para convers�o: ");
				real = sc.nextFloat();
				
				System.out.printf("Valor da convers�o de dolar(US$) em real(R$) %.2f\n", real * dolar);
				
				System.out.println("Deseja comtinuar a convers�o: S(sim) | N(n�o) ");
				op = sc.next();
			} while(op.equalsIgnoreCase("s"));

		sc.close();
	}
		

}
