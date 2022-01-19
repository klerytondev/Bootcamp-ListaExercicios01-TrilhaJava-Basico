package listaExercicios01;

import java.util.Scanner;

/*
 * 
 * Elaborar um Programa que efetue a apresentação do valor da conversão em real (R$) 
 * de um valor lido em dólar (US$). O Programa deverá solicitar o valor da cotação do
 *  dólar e também a quantidade de dólares disponíveis com o usuário. Use o do-while.
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
		
		System.out.print("Digite o valor da cotação do dolar(US$): ");
		dolar = sc.nextFloat();
		
			do {
				System.out.print("Digite o valor em real(R$) para conversão: ");
				real = sc.nextFloat();
				
				System.out.printf("Valor da conversão de dolar(US$) em real(R$) %.2f\n", real * dolar);
				
				System.out.println("Deseja comtinuar a conversão: S(sim) | N(não) ");
				op = sc.next();
			} while(op.equalsIgnoreCase("s"));

		sc.close();
	}
		

}
