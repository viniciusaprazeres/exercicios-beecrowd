package iniciante;

import java.util.Scanner;

public class BEE1172 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int vetor[] = new int[10];

        for (int i = 0; i < 10; i++) {
            vetor[i] = leia.nextInt();
        }

        for (int j = 0; j < 10; j++) {
            if (vetor[j] == 0 || vetor[j] < 0)
                vetor[j] = 1;
        }

        for (int k = 0; k < 10; k++) {
            System.out.println("X[" + k + "] = " + vetor[k]);
        }
    }
}
