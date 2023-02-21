import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE1048 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".00");
        
        float salario, reajuste;

        salario = leia.nextFloat();

        if (0 < salario && salario <= 400.00) {
            reajuste = 0.15f * salario;
            System.out.println("Novo salario: " + df.format(salario + reajuste));
            System.out.println("Reajuste ganho: " + df.format(reajuste));        
            System.out.println("Em percentual: 15 %");
        } else if (400.00 < salario && salario <= 800.00){
            reajuste = 0.12f * salario;
            System.out.println("Novo salario: " + df.format(salario + reajuste));
            System.out.println("Reajuste ganho: " + df.format(reajuste));        
            System.out.println("Em percentual: 12 %");
        } else if (800.00 < salario && salario <= 1200.00) {
            reajuste = 0.1f * salario;
            System.out.println("Novo salario: " + df.format(salario + reajuste));
            System.out.println("Reajuste ganho: " + df.format(reajuste));        
            System.out.println("Em percentual: 10 %");
        } else if (1200.00 < salario && salario <= 2000.00) {
            reajuste = 0.07f * salario;
            System.out.println("Novo salario: " + df.format(salario + reajuste));
            System.out.println("Reajuste ganho: " + df.format(reajuste));        
            System.out.println("Em percentual: 7 %");
        } else {
            reajuste = 0.04f * salario;
            System.out.println("Novo salario: " + df.format(salario + reajuste));
            System.out.println("Reajuste ganho: " + df.format(reajuste));        
            System.out.println("Em percentual: 4 %");
        }
        
    }
}