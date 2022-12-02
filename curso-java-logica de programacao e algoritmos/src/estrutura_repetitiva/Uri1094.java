package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Uri1094 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int total = 0, totalRato = 0, totalSapo = 0, totalCoelho = 0;
        for(int i = 0; i < n; i++) {

            int quantia = sc.nextInt();
            char tipo = sc.next().charAt(0);
            total = total + quantia;

            if(tipo == 'R') {
                totalRato = totalRato + quantia;
            } else if (tipo == 'S') {
                totalSapo = totalSapo + quantia;
            } else if(tipo == 'C') {
                totalCoelho = totalCoelho + quantia;
            }

        }

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelho);
        System.out.println("Total de ratos: " + totalRato);
        System.out.println("Total de sapos: " + totalSapo);
        double mediaCoelho = (double) totalCoelho / total * 100;
        System.out.printf("Percentual de coelhos: %.2f %%%n", mediaCoelho);
        double mediaRato = (double) totalRato / total * 100;
        System.out.printf("Percentual de ratos: %.2f %%%n", mediaRato);
        double mediaSapo = (double) totalSapo / total * 100;
        System.out.printf("Percentual de sapos: %.2f %%%n", mediaSapo);


        sc.close();
    }
}
