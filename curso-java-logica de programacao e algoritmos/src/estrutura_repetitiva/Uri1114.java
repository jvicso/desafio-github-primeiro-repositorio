package estrutura_repetitiva;

import java.util.Scanner;

public class Uri1114 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String senha = sc.next();

            while(!senha.equals("2002")) {
                System.out.println("Senha Invalida");
                senha = sc.next();
            }
        System.out.println("Acesso Permitido");

        sc.close();

    }
}
