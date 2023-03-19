package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE1014 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        int x;
        double y, consumoMedio;

        x = leia.nextInt();
        y = leia.nextDouble();

        consumoMedio = x / y;

        System.out.println(df.format(consumoMedio) + " km/l");

    }
}
