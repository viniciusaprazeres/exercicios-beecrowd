package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE1008 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int numero, horas;
        double valorHora, salario;

        numero = leia.nextInt();
        horas = leia.nextInt();
        valorHora = leia.nextDouble();
        salario = horas * valorHora;

        System.out.println("NUMBER = " + numero);
        System.out.println("SALARY = U$ " + df.format(salario));

    }
}
