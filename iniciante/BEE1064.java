package iniciante;

import java.util.Scanner;

public class BEE1064 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float numero, positivos = 0;
        int quantidade = 0;

        for (int i = 0; i < 6; i++) {
            numero = leia.nextFloat();

            if (numero > 0) {
                quantidade += 1;
                positivos += numero;
            }
        }

        System.out.println(quantidade + " valores positivos");
        System.out.printf("%.1f\n", (positivos / quantidade));
    }
}
