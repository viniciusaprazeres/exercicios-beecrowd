import java.lang.Math;
import java.util.Scanner;

public class BEE1045{

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        double a, b, c, controle;

        a = leia.nextDouble();
        b = leia.nextDouble();
        c = leia.nextDouble();

        if (a < b){
            controle = a;
            a = b;
            b = controle;
        }

        if (b < c){
            controle = b;
            b = c;
            c = controle;
        }

        if (a < b){
            controle = a;
            a = b;
            b = controle;
        }


        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2))
                System.out.println("TRIANGULO RETANGULO");
            if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2))
                System.out.println("TRIANGULO OBTUSANGULO");
            if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2))
                System.out.println("TRIANGULO ACUTANGULO");
            if (a == b && b == c)
                System.out.println("TRIANGULO EQUILATERO");
            if ((a == b && b != c) || (b == c && c != a) || (a == c && c != b))
                System.out.println("TRIANGULO ISOSCELES");
        }

    }
}