/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.*/
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
		
		for (int i = 0; i < pessoas.length; i++) {
			sc.nextLine();
			int posicao = i+1;
			System.out.printf("Altura da %da pessoa: ", posicao);
			double altura = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", posicao);
			char sexo = sc.next().charAt(0);
			pessoas[i] = new Pessoa(altura, sexo);
		}
		
		double menorAltura = pessoas[0].getAltura();
		for (int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getAltura() < menorAltura) {
				menorAltura = pessoas[i].getAltura();
			}
		}
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		
		double maiorAltura = pessoas[0].getAltura();
		for (int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getAltura() > maiorAltura) {
				maiorAltura = pessoas[i].getAltura();
			}
		}
		
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		
		double somaMulheres = 0.0;
		int contadorMulheres = 0, contadorHomens = 0;
		for (int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getSexo() == 'F') {
				contadorMulheres++;
				somaMulheres += pessoas[i].getAltura();
			} else {
				contadorHomens++;
			}
		}
		
		double mediaMulheres = somaMulheres / contadorMulheres;
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaMulheres);
		System.out.println("Numero de homens = " + contadorHomens);
		
		sc.close();

	}

}
