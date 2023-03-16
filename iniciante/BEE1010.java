package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE1010 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int codigo1, numero1, codigo2, numero2;
        double valor1, valor2, total;

        codigo1 = leia.nextInt();
        numero1 = leia.nextInt();
        valor1 = leia.nextDouble();
        codigo2 = leia.nextInt();
        numero2 = leia.nextInt();
        valor2 = leia.nextDouble();

        total = (numero1 * valor1) + (numero2 * valor2);

        System.out.println("VALOR A PAGAR: R$ " + df.format(total));

    }
}
