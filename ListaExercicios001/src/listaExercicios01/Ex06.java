package listaExercicios01;

import java.util.Scanner;

/*
 * Problema:
 * 
 * Escrever um Programa que vc informa o valor a ser gasto dentro de um supermercado, 
 * depois que leia valores dos produtos, o programa deve ir decrementando o valor saldo 
 * até não ter mais a possibilidade de compra, isso pode ser saindo do programa ou até não 
 * ter mais dinheiro suficiente para compra - mostrar o valor total e troco(resto do dinheiro), 
 * usar o While e outros operadores que achar necessario.
 * 
 * @Kleryton de Souza
 * 
 * */

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double carteira = 0;
		String op;
		int codigoProduto = 0;
		final double margarina = 3.50;
		final double cafe = 5.60;
		final double feijao = 6.80;
		final double arroz = 8.60;
		final double macarrao = 2.65;
		final double oleo = 9.50;

		System.out.print("Digite o valor da sua carteira em R$: ");
		carteira = sc.nextDouble();
		System.out.print("Deseja iniciar as compras: S(sim) | N(não) ");
		op = sc.next();

		if (op.equalsIgnoreCase("s")) {

			do {
				System.out.println("----------------------------------");
				System.out.println("1 - margarina = 3.50 \n2 - cafe = 5.60\n3 - feijao = 6.80\n"
						+ "4 - arroz = 8.60\n5 - macarrao = 2.65 \n6 - oleo = 9.50");
				System.out.println("----------------------------------");
				System.out.print("Digite o produto que deseja comprar: ");
				codigoProduto = sc.nextInt();
				switch (codigoProduto) {
				case 1:
					if (carteira >= margarina) {
						carteira -= margarina;
						break;
					} else {
						System.out.println("Saldo em carteira insuficiente!");
						break;
					}
				case 2:
					if (carteira >= cafe) {
						carteira -= cafe;
						break;
					} else {
						System.out.println("Saldo em carteira insuficiente!");
						break;
					}
				case 3:
					if (carteira >= feijao) {
						carteira -= feijao;
						break;
					} else {
						System.out.println("Saldo em carteira insuficiente!");
						break;
					}
				case 4:
					if (carteira >= arroz) {
						carteira -= arroz;
						break;
					} else {
						System.out.println("Saldo em carteira insuficiente!");
						break;
					}
				case 5:
					if (carteira >= macarrao) {
						carteira -= macarrao;
						break;
					} else {
						System.out.println("Saldo em carteira insuficiente!");
						break;
					}
				case 6:
					if (carteira >= oleo) {
						carteira -= oleo;
						break;
					} else {
						System.out.println("Saldo em carteira insuficiente!");
						break;
					}
				}
				System.out.printf("Saldao restante R$%.2f \n", carteira);
				System.out.println("Deseja comtinuar as compras: S(sim) | N(não) ");
				op = sc.next();
			} while (op.equalsIgnoreCase("s"));
			
		}
		System.out.printf("Saldo restante em carteira R$%.2f\n", carteira);
		System.out.println("Volte sempre!");

		sc.close();
	}

}
