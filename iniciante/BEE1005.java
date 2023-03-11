package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE1005 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");

        double a, b, media;

        a = leia.nextDouble();
        b = leia.nextDouble();
        media = (3.5 * a + 7.5 * b) / 11;

        System.out.println("MEDIA = " + df.format(media));

    }
}
