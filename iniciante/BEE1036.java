package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE1036 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#####");

        double a, b, c, delta, r1, r2;

        a = leia.nextDouble();
        b = leia.nextDouble();
        c = leia.nextDouble();

        delta = (Math.pow(b, 2)) - 4 * a * c;

        if (a == 0 || delta < 0)
            System.out.println("Impossivel calcular");
        else {
            r1 = (- b + Math.sqrt(delta)) / (2 * a);
            r2 = (- b - Math.sqrt(delta)) / (2 * a);
            System.out.println("R1 = " + df.format(r1));
            System.out.println("R2 = " + df.format(r2));
        }

    }
}
