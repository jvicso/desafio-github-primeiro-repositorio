/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.*/
package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vect1 = new int[n];
		int[] vect2 = new int[n];
		int[] vectSoma = new int[n];
		
		
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i < vect1.length; i++) {
			vect1[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i < vect1.length; i++) {
			vect2[i] = sc.nextInt();
		}
		
		
		for(int i = 0; i < vectSoma.length; i++) {
			vectSoma[i] = vect1[i] + vect2[i];
		}
		
		System.out.println("VETOR RESULTANTE:");
		for(int i = 0; i < vectSoma.length; i++) {
			System.out.println(vectSoma[i]);
		}
		
		
		
		
		
		
		sc.close();

	}

}
