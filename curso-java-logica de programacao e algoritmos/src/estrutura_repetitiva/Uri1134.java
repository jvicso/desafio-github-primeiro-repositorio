package estrutura_repetitiva;

import java.util.Scanner;

public class Uri1134 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int alcool = 0, gasolina = 0, diesel = 0;

        while(numero != 4) {
            switch (numero){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
            numero = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();

    }
}
