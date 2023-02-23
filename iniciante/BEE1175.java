package iniciante;

import java.util.Scanner;

public class BEE1175 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int[] vetor = new int[20];

        for (int i = 0; i < 20; i++) {
            vetor[i] = leia.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("N[" + i + "] = " + vetor[(19-i)]);
        }

    }
}
