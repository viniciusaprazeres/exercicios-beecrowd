package iniciante;

import java.util.Scanner;

public class BEE1004 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int a, b, prod;

        a = leia.nextInt();
        b = leia.nextInt();
        prod = a * b;

        System.out.println("PROD = " + prod);
        
    }
}
