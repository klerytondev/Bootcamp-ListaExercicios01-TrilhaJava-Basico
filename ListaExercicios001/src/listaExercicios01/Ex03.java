package listaExercicios01;

import java.util.Scanner;

/*
 * Problema:
 * 
 * Escrever um Programa para determinar o consumo m�dio de um autom�vel sendo fornecida 
 * a dist�ncia total percorrida pelo autom�vel e o total de combust�vel gasto.
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

		System.out.print("Digite a distancia total percorrida pelo ve�culo: ");
		distPercorrida = sc.nextInt();
		System.out.print("Digite o total de combust�vel: ");
		totCombustivel = sc.nextInt();

		if (distPercorrida > totCombustivel) {
			consumoMedio = distPercorrida / totCombustivel;
			System.out.println("O consumo m�dio do ve�culo foi " + consumoMedio);
		} else {
			System.out.println("Distancia percorrida maior que o total de combust�vel");
		}

		sc.close();
	}

}
