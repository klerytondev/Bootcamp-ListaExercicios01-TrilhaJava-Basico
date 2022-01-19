package listaExercicios01;

import java.util.Scanner;

public class Ex05 {

	/*
	 * Problema:
	 * 
	 * Escrever um Programa que leia 10 alunos nome e matricula do aluno e as notas
	 * das 4 provas que ele obteve no semestre. No final informar matricula,o nome
	 * do aluno da media (PASSOU, REPROVADO) mais alta e matricula,o nome do aluno
	 * da media (PASSOU, REPROVADO) mais baixa da lista cadastrada.Calculo da média
	 * (aritmética) e informar se ele passou (media >=7), ficou de recuperação(media
	 * >=4 ou < 7) ou reprovou (media < 4).
	 * 
	 * @Kleryton de Souza
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qtdeAlunos = 2;

		String[] nome = new String[qtdeAlunos];
		int[] matricula = new int[qtdeAlunos];
		float[] nota = new float[3];
		float somaNotas = 0;
		float maiorMedia = 0;
		float menorMedia = 11;
		float mediaAluno = 0;

		for (int i = 0; i < nome.length; i++) {
			System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
			nome[i] = sc.next();
			System.out.print("Digite a matricula do aluno: ");
			matricula[i] = sc.nextInt();
			for (int j = 0; j < 3; j++) {
				System.out.println("Digite a nota " + (j + 1) + " do aluno: ");
				nota[j] = sc.nextFloat();
			}
			System.out.println("Nome do aluno: " + nome[i]);
			System.out.println("Matricula do aluno: " + matricula[i]);

			for (float notas : nota) {
				somaNotas += notas;
			}

			mediaAluno = somaNotas / nota.length;
			somaNotas = 0;

			if (mediaAluno > maiorMedia) {
				maiorMedia = mediaAluno;
			}
			if (mediaAluno < menorMedia) {
				menorMedia = mediaAluno;
			}

			System.out.println("Media do aluno: " + mediaAluno);

			if (mediaAluno >= 7) {
				System.out.println("O aluno está APROVADO");
			} else if (mediaAluno >= 4 && mediaAluno < 7) {
				System.out.println("O aluno está em RECUPERAÇÃO");
			} else if (mediaAluno < 4) {
				System.out.println("O aluno está REPROVADO");
			}
			System.out.println("-----------------------------------------------");

		}

		System.out.println("MAIOR média entre os alunos cadastrados: " + maiorMedia);
		System.out.println("MENOR média entre os alunos cadastrados: " + menorMedia);

		sc.close();
	}

}
