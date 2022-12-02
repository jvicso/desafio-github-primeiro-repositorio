package vetores;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] nomes = new String[n];

        for (int i = 0; i < n; i++) {
            nomes[i] = sc.next();
        }

        System.out.println("Nomes lidos:");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        sc.close();
    }
}
