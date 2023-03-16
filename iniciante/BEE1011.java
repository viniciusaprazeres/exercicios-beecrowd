package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE1011 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        int raio;
        double volume;

        raio = leia.nextInt();
        volume = (4 * 3.14159 * (Math.pow(raio, 3))) / 3;

        System.out.println("VOLUME = " + df.format(volume));

    }
}
