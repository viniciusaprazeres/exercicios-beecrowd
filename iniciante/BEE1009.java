package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE1009 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        String nome;
        double salarioFixo, vendasMes, total;

        nome = leia.nextLine();
        salarioFixo = leia.nextDouble();
        vendasMes = leia.nextDouble();

        total = salarioFixo + (0.15 * vendasMes);

        System.out.println("TOTAL = R$ " + df.format(total));

    }
}
