package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetor008 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] altura = new double[n];
        char[] sexo = new char[n];

        for(int i = 0; i < n; i++) {
            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);
        }

        double menorAltura = altura[0];
        for(int i = 0; i < n; i++) {
            if(altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }

        System.out.printf("Menor altura = %.2f%n", menorAltura);

        double maiorAltura = altura[0];
        for(int i = 0; i < n; i++) {
            if(altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
        }

        System.out.printf("Maior altura = %.2f%n", maiorAltura);

        double somaAlturaF = 0.0;
        double somaAlturaM = 0.0;
        int contadorF = 0;
        int contadorM = 0;

        for (int i = 0; i < n; i ++) {
            if(sexo[i] == 'F') {
                somaAlturaF += altura[i];
                contadorF++;
            } else if (sexo[i] == 'M') {
                contadorM++;
            }
        }

        double mediaAlturaF = somaAlturaF / contadorF;
        System.out.printf("Média das alturas das mulheres = %.2f%n", mediaAlturaF);
        System.out.println("Número de homens = " + contadorM);


        sc.close();
    }
}
