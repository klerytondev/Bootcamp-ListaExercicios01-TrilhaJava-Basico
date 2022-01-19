package listaExercicios01;

import java.util.Scanner;

/*
 * Problema:
 * 
 * Escrever um Programa que leia o nome de um vendedor, o seu sal�rio fixo e o 
 * total de vendas efetuadas por ele no m�s (em dinheiro). Sabendo que este 
 * vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar o seu nome, 
 * o sal�rio fixo e sal�rio no final do m�s.
 * 
 * @Kleryton de Souza
 * 
 * */

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome;
		double salFixo = 0;
		double totVendas = 0;
		double totSalario = 0;

		System.out.print("Digite o nome do vendedor: ");
		nome = sc.nextLine();
		System.out.print("Digite o sal�rio fixo do vendedor: ");
		salFixo = sc.nextFloat();
		System.out.print("Qual o total de vendas em R$ do vendedor no m�s: ");
		totVendas = sc.nextFloat();
		totSalario = salFixo + (totVendas * 0.15);

		System.out.println("------------------------------------------------------");

		System.out.println("Nome do vendedor: " + nome);
		System.out.printf("Salario fixo do vendedor: R$%.2f \n", salFixo);
		System.out.printf("Salario a ser pago ao vendedor + comiss�es: R$%.2f", totSalario);

		sc.close();
	}

}
