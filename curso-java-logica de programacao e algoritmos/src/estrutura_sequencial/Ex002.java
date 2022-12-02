package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;


public class Ex002 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura do terreno: ");
        double largura = sc.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();
        System.out.print("Digite o valor do metro quadrado do terreno: " );
        double valorMetroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * valorMetroQuadrado;

        System.out.printf("AREA TOTAL DO TERRENO = %.2f%n", area);
        System.out.printf("PRECO TOTAL DOS METROS QUADRADOS = %.2f%n", preco);

        sc.close();

    }

}
