import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        
        Double saldo, nsaldo;
        
        System.out.println("\ndigite saldo: ");
        Scanner input = new Scanner(System.in);
        saldo = input.nextDouble();

        nsaldo = saldo * 1.01;

        System.out.println("\nnovo saldo: " + nsaldo);
        System.out.println("\n");

        input.close();

    }
}
