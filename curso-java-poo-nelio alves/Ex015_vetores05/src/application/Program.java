/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.*/
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Pessoa[] pessoas = new Pessoa[n];
		
		for(int i = 0; i < pessoas.length; i++) {
			int numeroPessoa = i+1;
			sc.nextLine();
			System.out.printf("Dados da %da pessoa: ", numeroPessoa);
			System.out.print("\nNome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			pessoas[i] = new Pessoa(nome, idade, altura);
		}
		

		double soma = 0.0;
		for(int i = 0; i < pessoas.length; i++) {
			soma += pessoas[i].getAltura();
		}
		
		double media = soma / pessoas.length;
		System.out.printf("Altura média: %.2f%n", media);
		
		int contadorMenor16 = 0;
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getIdade() < 16) {
				contadorMenor16++;
			}
		}
		
		double porcentagemMenor16 = contadorMenor16 * 100.0 / pessoas.length;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagemMenor16);
		
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getIdade() < 16) {
				System.out.println(pessoas[i].getNome());
			}
		}
		
		sc.close();

	}

}
