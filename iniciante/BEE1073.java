package iniciante;

import java.util.Scanner;

public class BEE1073 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0){
                System.out.println(i + "^2 = " + (i*i));
            }
        }

    }
}
