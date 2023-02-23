package iniciante;

import java.util.Scanner;

public class BEE1174 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float[] a = new float[100];

        for (int i = 0; i < 100; i++) {
            a[i] = leia.nextFloat();
        }

        for (int j = 0; j < 100; j++) {
            if (a[j] <= 10)
                System.out.println("A[" + j + "] = " + a[j]);
        }

    }
}
