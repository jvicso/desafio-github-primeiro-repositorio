package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetor009 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] produto = new String[n];
        double[] valorCompra = new double[n];
        double[] valorVenda = new double[n];

        for(int i = 0; i < n; i++) {
            produto[i] = sc.next();
            valorCompra[i] = sc.nextDouble();
            valorVenda[i] = sc.nextDouble();
        }


        int somaAbaixo10 = 0;
        int somaEntre10e20 = 0;
        int somaAcimaDe20 = 0;
        for(int i = 0; i < n; i++) {
            double lucroPorProduto = (valorVenda[i] - valorCompra[i]) * 100 / valorCompra[i];

            if(lucroPorProduto < 10.0) {
                somaAbaixo10++;
            } else if(lucroPorProduto >= 10.0 && lucroPorProduto <= 20.0) {
                somaEntre10e20++;
            } else {
                somaAcimaDe20++;
            }
        }

        System.out.println("Lucro abaixo de 10%: " + somaAbaixo10);
        System.out.println("Lucro entre 10% e 20%: " + somaEntre10e20);
        System.out.println("Lucro acima de 20%: " + somaAcimaDe20);

        double valorTotalCompra = 0.0;
        for(int i = 0; i < n; i++) {
            valorTotalCompra += valorCompra[i];
        }

        double valorTotalVenda = 0.0;
        for(int i = 0; i < n; i++) {
            valorTotalVenda += valorVenda[i];
        }

        System.out.printf("Valor total de compra: %.2f%n", valorTotalCompra);
        System.out.printf("Valor total de venda: %.2f%n", valorTotalVenda);
        double lucroTotal = valorTotalVenda - valorTotalCompra;
        System.out.printf("Valor total de venda: %.2f%n", lucroTotal);

        sc.close();
    }
}
