package iniciante;

import java.util.Scanner;

public class BEE1074 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int n;

        n = leia.nextInt();

        for (int i = 0; i < n; i++) {
            int valor = leia.nextInt();
            if (valor % 2 == 0 && valor > 0)
                System.out.println("EVEN POSITIVE");
            else if (valor % 2 == 0 && valor < 0)
                System.out.println("EVEN NEGATIVE");
            else if (valor % 2 != 0 && valor > 0)
                System.out.println("ODD POSITIVE");
            else if (valor % 2 != 0 && valor < 0)
                System.out.println("ODD NEGATIVE");
            else
                System.out.println("NULL");

        }
    }
}
