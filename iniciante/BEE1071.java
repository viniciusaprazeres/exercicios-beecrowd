package iniciante;

import java.util.Scanner;

public class BEE1071 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int x, y, soma = 0;

        x = leia.nextInt();
        y = leia.nextInt();

        if (x < y) {
            for (int i = x; i < y; i++) {
                if (i % 2 != 0 && i > x)
                    soma += i;
            }
        } else if (x > y) {
            for (int i = x; i > y; i--) {
                if (i % 2 != 0 && i < x)
                    soma += i;
            }
        }

        System.out.println(soma);

    }
}
