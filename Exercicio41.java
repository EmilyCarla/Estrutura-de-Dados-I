import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        
        int a, b, c, d, mediaPonderada;

        System.out.println("\nentre com 1 numero");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("\nentre com 2 numero: ");
        b = input.nextInt();
        System.out.println("\nentre com 3 numero: ");
        c = input.nextInt();
        System.out.println("\nentre com 4 numero: ");
        d = input.nextInt();

        mediaPonderada = (a*1 + b*2 + c*3 + d*4) / 10;

        System.out.println("\nmedia ponderada: " + mediaPonderada);
        System.out.println("\n");

        input.close();
        
    }
}
