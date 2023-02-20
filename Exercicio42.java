import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        
        double angulo, radiano;

        System.out.println("\ndigite um angulo em graus: ");
        Scanner input = new Scanner(System.in);
        angulo = input.nextDouble();

        radiano = (angulo * Math.PI) / 180;

        System.out.println("\nseno: " + Math.sin(radiano));
        System.out.println("\nco-seno: " + Math.cos(radiano));
        System.out.println("\ntangente: " + Math.tan(radiano));
        System.out.println("\nco-secante: " + (1/Math.sin(radiano)));
        System.out.println("\nsecante: " + (1/Math.cos(radiano)));
        System.out.println("\ncotangente: " + (1/Math.tan(radiano)));
        System.out.println("\n");

        input.close();
    }
}
