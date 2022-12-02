package estrutura_repetitiva;

import java.util.Scanner;

public class Uri1074 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidade = sc.nextInt();

        for(int i = 0; i < quantidade; i++) {

            int n = sc.nextInt();

            if(n == 0) {
                System.out.println("NULL");
            } else if (n %2 == 0) {
                System.out.print("EVEN ");
            } else {
                System.out.print("ODD ");
            }

            if(n < 0) {
                System.out.println("NEGATIVE");
            } else if (n > 0){
                System.out.println("POSITIVE");
            }

        }

        sc.close();
    }
}
