package iniciante;

import java.util.Scanner;

public class BEE1078 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int n;
        
        n = leia.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + n + " = " + (i * n));
        }
    }
}
