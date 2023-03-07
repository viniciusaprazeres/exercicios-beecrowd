package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE1040 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double n1, n2, n3, n4, media, exame;

        n1 = leia.nextDouble();
        n2 = leia.nextDouble();
        n3 = leia.nextDouble();
        n4 = leia.nextDouble();

        media = (2 * n1 + 3 * n2 + 4 * n3 + 1 * n4) / (2 + 3 + 4 + 1);

        System.out.println("Media: " + df.format(media));

        if (media >= 7.0)
            System.out.println("Aluno aprovado.");
        else if (media < 5.0)
            System.out.println("Aluno reprovado.");
        else {
            System.out.println("Aluno em exame.");
            exame = leia.nextDouble();
            System.out.println("Nota do exame: " + df.format(exame));
            media = (media + exame) / 2;

            if (media >= 5.0)
                System.out.println("Aluno aprovado.");
            else
                System.out.println("Aluno reprovado.");

            System.out.println("Media final: " + df.format(media));
        }

    }
}
