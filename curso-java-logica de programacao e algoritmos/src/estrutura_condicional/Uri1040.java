package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1040 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        float n4 = sc.nextFloat();

        float media = (n1 * 2.0f + n2 * 3.0f + n3 * 4.0f + n4 * 1.0f) / 10.0f;

        System.out.printf("Media: %.1f%n" , media);
        if(media >= 7.0f) {
            System.out.println("Aluno aprovado.");
        } else if(media < 5.0f) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            float notaExame = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f%n" , notaExame);
            media = (media + notaExame) / 2.0f;
            if(media >= 5.0f) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n" , media);
        }

        sc.close();
    }
}
