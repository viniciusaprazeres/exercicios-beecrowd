package iniciante;

import java.util.Scanner;

public class BEE1043 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float a, b, c;

        a = leia.nextFloat();
        b = leia.nextFloat();
        c = leia.nextFloat();

        if ((Math.abs(b - c) < a && a < b + c) && ((Math.abs(a - c) < b && a < a + c)) && (Math.abs(a - b) < c && c < a + b)) {
            float perimetroTriangulo = a + b + c;
            System.out.println("Perimetro = " + perimetroTriangulo);
        } else {
            float areaTrapezio = ((a + b) * c) / 2;
            System.out.println("Area = " + areaTrapezio);
        }
    }
}
