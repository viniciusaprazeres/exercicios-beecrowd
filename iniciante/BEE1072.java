package iniciante;

import java.util.Scanner;

public class BEE1072 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int n, in = 0, out = 0;

        n = leia.nextInt();

        for (int i = 0; i < n; i++) {
            int x = leia.nextInt();
            if (x >= 10 && x <= 20)
                in += 1;
            else
                out += 1;
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
