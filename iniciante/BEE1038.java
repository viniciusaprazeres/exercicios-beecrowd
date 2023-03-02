package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE1038 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        int codigo, quantidade;

        codigo = leia.nextInt();
        quantidade = leia.nextInt();

        switch (codigo){
            case 1 -> System.out.println("Total: R$ " + df.format(quantidade * 4.00f));
            case 2 -> System.out.println("Total: R$ " + df.format(quantidade * 4.50f));
            case 3 -> System.out.println("Total: R$ " + df.format(quantidade * 5.00f));
            case 4 -> System.out.println("Total: R$ " + df.format(quantidade * 2.00f));
            case 5 -> System.out.println("Total: R$ " + df.format(quantidade * 1.50f));
        }

    }
}
