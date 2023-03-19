package iniciante;

import java.util.Scanner;

public class BEE1013 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int a, b, c, maior1, maior2;

        a = leia.nextInt();
        b = leia.nextInt();
        c = leia.nextInt();

        maior1 = (a + b + Math.abs(a - b)) / 2;
        maior2 = (maior1 + c + Math.abs(maior1 - c)) / 2;

        System.out.println(maior2 + " eh o maior");

    }
}
