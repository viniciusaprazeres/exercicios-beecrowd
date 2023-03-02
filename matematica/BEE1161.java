package matematica;

import java.util.Scanner;

public class BEE1161 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        long m, n, fatorialM = 0, fatorialN = 0;

        do {
            m = leia.nextLong();
            n = leia.nextLong();
            fatorialM = m;
            fatorialN = n;

            if (m == 0 || m == 1)
                fatorialM = 1;
            else {
                for (long i = m - 1; i > 0; i--) {
                    fatorialM *= i;
                }
            }


            if (n == 0 || n == 1)
                fatorialN = 1;
            else {
                for (long j = n - 1; j > 0; j--) {
                    fatorialN *= j;
                }
            }

            System.out.println(fatorialM + fatorialN);
        } while (leia.hasNext());
    }
}
