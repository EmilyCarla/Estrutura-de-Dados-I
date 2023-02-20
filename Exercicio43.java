import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        
        double numero, logaritmo;

        System.out.println("\nentre com o logaritmo: ");
        Scanner input = new Scanner(System.in);
        numero = input.nextDouble();

        logaritmo = Math.log(numero) / Math.log(10);

        System.out.println("\nlogaritmo: " + logaritmo);
        System.out.println("\n");

        input.close();

    }
}
