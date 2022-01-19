package listaExercicios01;

import java.util.Scanner;

/*
 * Problema:
 * 
 * Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
 * A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e 
 * C a temperatura em Celsius. Use o While para o Exercicio
 * 
 * @Kleryton de Souza
 * 
 * */

public class Ex07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float tempCelsius = 0;
		float tempFahrenheit = 0;

		System.out.print("Digite uma temperatura em graus Celsius: ");
		tempCelsius = sc.nextFloat();

		tempFahrenheit = (9 * tempCelsius + 160) / 5;

		System.out.printf("Temperatura convertida em Fahrenheit: %.1f", tempFahrenheit);

		sc.close();

	}

}
