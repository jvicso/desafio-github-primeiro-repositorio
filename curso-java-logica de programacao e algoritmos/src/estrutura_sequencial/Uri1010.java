package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codPecaUm = sc.nextInt();
        int numPecaUm = sc.nextInt();
        double valorUnitarioPecaUm = sc.nextDouble();

        int codPecaDois = sc.nextInt();
        int numPecaDois = sc.nextInt();
        double valorUnitarioPecaDois = sc.nextDouble();

        double total = (numPecaUm * valorUnitarioPecaUm) + (numPecaDois * valorUnitarioPecaDois);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();;
    }
}
