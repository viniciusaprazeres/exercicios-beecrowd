package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE1012 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;

        a = leia.nextDouble();
        b = leia.nextDouble();
        c = leia.nextDouble();

        triangulo = (a * c) / 2;
        circulo = 3.14159 * Math.pow(c, 2);
        trapezio = ((a + b) * c) / 2;
        quadrado = Math.pow(b, 2);
        retangulo = a * b;

        System.out.println("TRIANGULO: " + df.format(triangulo));
        System.out.println("CIRCULO: " + df.format(circulo));
        System.out.println("TRAPEZIO: " + df.format(trapezio));
        System.out.println("QUADRADO: " + df.format(quadrado));
        System.out.println("RETANGULO: " + df.format(retangulo));

    }
}
