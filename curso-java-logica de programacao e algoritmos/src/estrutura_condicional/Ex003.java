package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();
        double valorAPagar = 50.0;

        if(minutos <= 100) {
            System.out.printf("Valor a pagar: R$ %.2f%n", valorAPagar);
        } else {
            minutos += - 100;
            valorAPagar += (minutos * 2);
            System.out.printf("Valor a pagar: R$ %.2f%n", valorAPagar);
        }
    }
}
