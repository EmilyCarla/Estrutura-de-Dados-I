import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {

        int quociente, resto, valor1, valor2;

        System.out.println("\nentre com o dividendo");
        Scanner input = new Scanner(System.in);
        valor1 = input.nextInt();
        System.out.println("\nentre com o divisor");
        valor2 = input.nextInt();

        quociente = (valor1 / valor2);
        resto = (valor1 % valor2);

        System.out.println("\n\n\n");
        System.out.println("\ndividendo : " + valor1);
        System.out.println("\ndivisor : " + valor2);
        System.out.println("\nquociente : " + quociente);
        System.out.println("\nresto : " + resto);
        System.out.println("\n");

        input.close();
        
    }
}
