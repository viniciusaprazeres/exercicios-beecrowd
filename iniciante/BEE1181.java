import java.util.Scanner;

public class BEE1181 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        int l;
        float soma = 0, media = 0;
        String t;

        float[][] m = new float[12][12];

        l = leia.nextInt();
        leia.skip("\\R?");
        t = leia.nextLine();


        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                m[i][j] = leia.nextFloat();
            }
        }

        for (int k = 0; k < 12; k++) {
            soma += m[l][k];
        }

        media = soma / 12;            

        if (t.equalsIgnoreCase("s")){
            System.out.println(soma);
        } else if (t.equalsIgnoreCase("m")){
            System.out.println(media);
        }


    }
}
