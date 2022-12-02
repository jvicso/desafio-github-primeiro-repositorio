package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char repeticao;
        do{
            System.out.print("Digite a temperatura em Celsius: ");
            double grausEmC = sc.nextDouble();
            double grausEmF = 9 * grausEmC / 5 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", grausEmF);
            System.out.print("Deseja repetir (s/n)? ");
            repeticao = sc.next().charAt(0);
        } while(repeticao == 's');

        sc.close();
    }
}
