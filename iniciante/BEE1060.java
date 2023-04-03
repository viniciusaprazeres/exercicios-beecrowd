package iniciante;

import java.util.Scanner;

public class BEE1060 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float numero, media;
        int positivos = 0;

        for (int i = 0; i < 6; i++) {
            numero = leia.nextFloat();

            if (numero > 0)
                positivos += 1;
        }

        System.out.println(positivos + " valores positivos");
    }
}
