import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        
        Double numero, base, logaritmo;

        System.out.println("\nentre com o logaritmando: ");
        Scanner input = new Scanner(System.in);
        numero = input.nextDouble();
        System.out.println("\nentre com a base");
        base = input.nextDouble();

        logaritmo = Math.log(numero) / Math.log(base);

        System.out.println("\no logaritmo de " + numero + " na base " + base + "é: " + logaritmo );

        input.close();
    }
}
