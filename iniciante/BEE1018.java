package iniciante;

import java.util.Scanner;

public class BEE1018 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        // int N, notasCem, notasCinquenta, notasVinte, notasDez, notasCinco, notasDois, notasUm;

        int N = leia.nextInt();

//        notasCem = (N / 100);
//        notasCinquenta = ((N % 100)/50);
//        notasVinte = (((N % 100) % 50) / 20);
//        notasDez = ((((N % 100) % 50) % 20) / 10);
//        notasCinco = (((((N % 100) % 50) % 20) % 10) / 5);
//        notasDois = ((((((N % 100) % 50) % 20) % 10) % 5) / 2);
//        notasUm = (((((((N % 100)) % 50) % 20) % 10) % 5) % 2);

        System.out.println(N);
        System.out.println((N / 100) + " nota(s) de R$ 100,00");
        System.out.println(((N % 100)/50) + " nota(s) de R$ 50,00");
        System.out.println((((N % 100) % 50) / 20) + " nota(s) de R$ 20,00");
        System.out.println(((((N % 100) % 50) % 20) / 10) + " nota(s) de R$ 10,00");
        System.out.println((((((N % 100) % 50) % 20) % 10) / 5) + " nota(s) de R$ 5,00");
        System.out.println(((((((N % 100) % 50) % 20) % 10) % 5) / 2) + " nota(s) de R$ 2,00");
        System.out.println((((((((N % 100)) % 50) % 20) % 10) % 5) % 2) + " nota(s) de R$ 1,00");

    }
}
