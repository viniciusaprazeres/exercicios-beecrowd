package iniciante;

import java.util.Scanner;

public class BEE1182 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double[][] m = new double[12][12];

        int c;
        double soma = 0, media;
        String  t;

        c = leia.nextInt();
        leia.skip("\\R?");
        t = leia.nextLine();

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                m[i][j] = leia.nextDouble();
            }
        }

        for (int k = 0; k < 12; k++) {
            soma += m[k][c];
        }

        media = (soma/12);

        if (t.equalsIgnoreCase("S"))
            System.out.printf("%.1f", soma);
        else if (t.equalsIgnoreCase("M"))
            System.out.println(String.format("%.1f", media));

    }
}
