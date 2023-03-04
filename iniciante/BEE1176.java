package iniciante;

import java.util.Scanner;

public class BEE1176 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        long[] fibonacci = new long[61];
        int t, n;

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        t = leia.nextInt();

        for (int f = 2; f < fibonacci.length; f++) {
            fibonacci[f] = fibonacci[f-1] + fibonacci[f - 2];
        }

        for (int i = 0; i < t; i++) {
            n = leia.nextInt();
            System.out.println("Fib(" + n + ") = " + fibonacci[n]);
        }
    }
}
