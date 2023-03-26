package iniciante;

import java.util.Scanner;

public class BEE1044 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int a, b;

        a = leia.nextInt();
        b = leia.nextInt();

        if (a % b == 0 || b % a == 0)
            System.out.println("Sao Multiplos");
        else
            System.out.println("Nao sao Multiplos");

    }
}
