package listaExercicios01;

import java.util.Scanner;

/*
 * Problema:
 * 
 * Escrever um Programa que leia o nome de um vendedor, o seu salário fixo e o 
 * total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este 
 * vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, 
 * o salário fixo e salário no final do mês.
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
		System.out.print("Digite o salário fixo do vendedor: ");
		salFixo = sc.nextFloat();
		System.out.print("Qual o total de vendas em R$ do vendedor no mês: ");
		totVendas = sc.nextFloat();
		totSalario = salFixo + (totVendas * 0.15);

		System.out.println("------------------------------------------------------");

		System.out.println("Nome do vendedor: " + nome);
		System.out.printf("Salario fixo do vendedor: R$%.2f \n", salFixo);
		System.out.printf("Salario a ser pago ao vendedor + comissões: R$%.2f", totSalario);

		sc.close();
	}

}
