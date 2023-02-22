package iniciante;

import java.util.Scanner;

public class BEE1143 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int n;

        n =leia.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + (i * i) + " " + (i * i * i));
        }

    }
}
