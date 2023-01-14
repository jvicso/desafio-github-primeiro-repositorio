/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.*/
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		Pessoa[] pessoas = new Pessoa[n];
		for(int i = 0; i < pessoas.length; i++) {
			int numero = i+1;
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:%n", numero);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			pessoas[i] = new Pessoa(nome, idade);
		}
		
		int maisVelho = pessoas[0].getIdade();
		String nome = pessoas[0].getNome();
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getIdade() > maisVelho) {
				maisVelho = pessoas[i].getIdade();
				nome = pessoas[i].getNome();
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nome);
		
		sc.close();

	}

}
