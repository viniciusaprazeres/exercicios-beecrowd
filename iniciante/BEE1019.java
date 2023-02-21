package iniciante;

import java.util.Scanner;

public class BEE1019 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int N, segundos, minutos, horas;

        N = leia.nextInt();

        segundos = N % 60;
        minutos = (N / 60) % 60;
        horas = (N / 3600) % 60;


        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
