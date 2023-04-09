package iniciante;

    import java.util.Scanner;

public class BEE1173 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int valor;
        int vetor[] = new int[10];

        valor = leia.nextInt();

        for (int i = 0; i < 10; i++) {
            if (i == 0)
                vetor[i] = valor;
            else
                vetor[i] = vetor[i - 1] * 2;
        }

        for (int j = 0; j < 10; j++) {
            System.out.println("N[" + j + "] = " + vetor[j]);
        }
    }
}
