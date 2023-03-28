package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE1017 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        int tempo, velocidade;
        double litros;

        tempo = leia.nextInt();
        velocidade = leia.nextInt();

        litros = (velocidade * tempo) / 12f;

        System.out.println(df.format(litros));

    }
}
