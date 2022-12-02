package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1038 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoLanche = sc.nextInt();
        int quantidadeLanche = sc.nextInt();
        double total = 0.00;

        switch (codigoLanche){
            case 1:
                total = quantidadeLanche * 4.00;
                break;
            case 2:
                total = quantidadeLanche * 4.50;
                break;
            case 3:
                total = quantidadeLanche * 5.00;
                break;
            case 4:
                total = quantidadeLanche * 2.00;
                break;
            case 5:
                total = quantidadeLanche * 1.50;
                break;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}
