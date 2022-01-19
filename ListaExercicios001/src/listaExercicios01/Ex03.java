package listaExercicios01;

import java.util.Scanner;

/*
 * Problema:
 * 
 * Escrever um Programa para determinar o consumo médio de um automóvel sendo fornecida 
 * a distância total percorrida pelo automóvel e o total de combustível gasto.
 * 
 * @Kleryton de Souza
 * 
 */

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int distPercorrida = 0;
		int totCombustivel = 0;
		float consumoMedio = 0;

		System.out.print("Digite a distancia total percorrida pelo veículo: ");
		distPercorrida = sc.nextInt();
		System.out.print("Digite o total de combustível: ");
		totCombustivel = sc.nextInt();

		if (distPercorrida > totCombustivel) {
			consumoMedio = distPercorrida / totCombustivel;
			System.out.println("O consumo médio do veículo foi " + consumoMedio);
		} else {
			System.out.println("Distancia percorrida maior que o total de combustível");
		}

		sc.close();
	}

}
