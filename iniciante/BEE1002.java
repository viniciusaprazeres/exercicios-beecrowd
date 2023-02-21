package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE1002 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".0000");

        double raio, area, n = 3.14159;

        raio = leia.nextDouble();

        area = n * (Math.pow(raio, 2));

        System.out.println("A=" + df.format(area));

    }
}
