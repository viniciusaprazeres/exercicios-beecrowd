package iniciante;

import java.util.Scanner;

public class BEE1177 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int[] n = new int[1000];

        int t, contador = 0;

        t = leia.nextInt();

        for (int i = 0; i < 1000; i++) {
            n[i] = contador;
            contador += 1;
            if (contador == t)
                contador = 0;
        }

        for (int j = 0; j < 1000; j++) {
            System.out.println("N[" + j + "] = " + n[j]);
        }

    }
}
