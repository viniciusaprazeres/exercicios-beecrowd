package iniciante;

import java.util.Scanner;

public class BEE1065 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float numero;
        int pares = 0;

        for (int i = 0; i < 5; i++) {
            numero = leia.nextFloat();

            if (numero % 2 == 0)
                pares += 1;
        }

        System.out.println(pares + " valores pares");
    }
}
