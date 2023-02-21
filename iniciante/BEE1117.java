package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE1117 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".00");

        float nota, soma = 0f;
        boolean continua = true;
        int contador = 0;

        while (continua){
            nota = leia.nextFloat();
            if (nota >= 0 && nota <= 10){
                soma += nota;
                contador += 1;
            } else {
                System.out.println("nota invalida");
            }

            if (contador == 2)
                continua = false;
        }

        System.out.println("media = " + df.format(soma/2));

    }
}
