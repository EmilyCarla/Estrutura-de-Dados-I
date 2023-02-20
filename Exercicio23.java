import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
         
        System.out.println("Digite numero de tres casas: " );
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int d = a  % 100 / 10;
        
        System.out.println("Algarismo da casa das dezenas: ");
        System.out.println(d);

        input.close();
    }
}
