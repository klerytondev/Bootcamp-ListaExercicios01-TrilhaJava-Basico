package listaExercicios01;

import java.util.Scanner;

/*
 * Problema:
 * 
 * A Loja Quitanda do seu João mercado pequeno está vendendo seus produtos em até 5 (cinco) prestações sem juros.
 *Faça um Programa que receba cadastros de clientes(codigo,nome, sobrenome, ), um valor de uma compra e escolha em 
 *até quantas prestações deve fazer e mostre o valor das prestações, exemplo o total deu 500,00 se o cliente solicitar 
 *fazer em 4 vezes o valor da prestação deve ser 125,00, se for em 5 vezes 105,00 (mais acrescimo de 5% do total 
 *da compra) se o funcionario quiser fazer em 6 vezes deve informar que a opção esta invalida, somente em até 5 vezes 
 *a compra deve ser parcelada.No final pegar um cliente do array e mostrar o nome, sobrenome e o valor da parcela da 
 *compra realizada.
 *“Não usar orientação Objeto” pode ser( While, for, if-else,switch, array)
 * 
 * @Kleryton de Souza
 * 
 * */

public class Ex10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qtdeClientes = 0;
		int qtdeParcelas = 0;

		System.out.print("Quantos clientes deseja cadastrar: ");
		qtdeClientes = sc.nextInt();

		int[] codigo = new int[qtdeClientes];
		String[] nome = new String[qtdeClientes];
		String[] sobrenome = new String[qtdeClientes];
		float[] valorParcela = new float[qtdeClientes];
		float[] valorCompra = new float[qtdeClientes];

		for (int i = 0; i < qtdeClientes; i++) {
			System.out.print("Digite o codigo do cliente " + (i + 1) + ": ");
			codigo[i] = sc.nextInt();
			System.out.print("Digite o nome do cliente " + (i + 1) + ": ");
			nome[i] = sc.next();
			System.out.print("Digite o sobrenome do cliente " + (i + 1) + ": ");
			sobrenome[i] = sc.next();
			System.out.print("Digite o valor da compra: ");
			valorCompra[i] = sc.nextFloat();
			System.out.print("Em quantas vezes deseja dividir: ");
			qtdeParcelas = sc.nextInt();

			System.out.println("--------------------------------------------------");

			if (qtdeParcelas >= 1 && qtdeParcelas <= 4) {

				switch (qtdeParcelas) {
				case 1:
					valorParcela[i] = valorCompra[i] / 1;
					break;
				case 2:
					valorParcela[i] = valorCompra[i] / 2;
					break;
				case 3:
					valorParcela[i] = valorCompra[i] / 3;
					break;
				case 4:
					valorParcela[i] = valorCompra[i] / 4;
					break;
				}
			} else {
				System.out.println("Opção esta invalida, somente em até 5 vezes a compra deve ser parcelada.");
			}
		}

		System.out.print("Digite um cliente para exibição: ");
		int cliente = sc.nextInt() - 1;

		for (int j = 0; j < qtdeClientes; j++) {
			if (cliente == j) {
				System.out.println("Nome do cliente: " + nome[j] + " " + sobrenome[j]);
				System.out.println("Valor da compra realizada: R$" + valorCompra[j]);
				System.out.println("Valor das parcelas: R$" + valorParcela[j]);
			}
		}
		sc.close();
	}
}
