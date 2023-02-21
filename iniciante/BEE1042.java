package iniciante;

import java.util.Scanner;

public class BEE1042 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int inicialA, inicialB, inicialC, a, b, c, controle = 0;

        inicialA = leia.nextInt();
        inicialB = leia.nextInt();
        inicialC = leia.nextInt();

        a = inicialA;
        b = inicialB;
        c = inicialC;

        if (a > b) {
            controle = a;
            a = b;
            b = controle;
        }

        if (b > c) {
            controle = c;
            c = b;
            b = controle;
        }

        if (a > b) {
            controle = a;
            a = b;
            b = controle;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c + "\n");
        System.out.println(inicialA);
        System.out.println(inicialB);
        System.out.println(inicialC);

    }
}
