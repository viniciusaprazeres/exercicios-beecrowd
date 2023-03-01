package iniciante;

import java.util.Scanner;

public class BEE1020 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int idade, anos, meses, dias;

        idade = leia.nextInt();

        anos = idade / 365;
        meses = (idade % 365) / 30;
        dias = ((idade % 365) % 30);

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

    }
}
