/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).*/
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		Aluno[] alunos = new Aluno[n];
		
		for(int i = 0; i < alunos.length; i++) {
			sc.nextLine();
			int numero = i + 1;
			System.out.printf("Digite o nome, primeira e segunda nota do %do aluno%n", numero);
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			alunos[i] = new Aluno(nome, nota1, nota2);
		}
		
		System.out.println("Alunos aprovados:");
		for(int i = 0; i < alunos.length; i++) {
			double media = (alunos[i].getNota1() + alunos[i].getNota2()) / 2; 
			if(media >= 6.0) {
				System.out.println(alunos[i].getNome());
			}
		}
		
		sc.close();

	}

}
