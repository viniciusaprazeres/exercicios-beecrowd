package iniciante;

import java.util.Scanner;

public class BEE1067 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero;

        numero = leia.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i %  2 != 0)
                System.out.println(i);
        }
    }
}
