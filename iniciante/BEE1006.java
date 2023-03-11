package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE1006 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double a, b, c, media;

        a = leia.nextDouble();
        b = leia.nextDouble();
        c = leia.nextDouble();

        media = (2 * a + 3 * b + 5 * c) / 10;

        System.out.println("MEDIA = " + df.format(media));

    }
}
