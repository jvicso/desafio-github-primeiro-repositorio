package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double total = n1 + n2;

        System.out.printf("NOTA FINAL = %.1f%n", total);

        if(total < 60.0) {
            System.out.println("REPROVADO");
        }

        sc.close();
    }
}
