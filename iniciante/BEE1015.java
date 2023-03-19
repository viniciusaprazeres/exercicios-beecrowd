package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE1015 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");

        double x1, y1, x2, y2, distancia;

        x1 = leia.nextDouble();
        y1 = leia.nextDouble();
        x2 = leia.nextDouble();
        y2 = leia.nextDouble();

        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println(df.format(distancia));

    }
}
