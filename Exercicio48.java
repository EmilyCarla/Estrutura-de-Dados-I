import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        
        double salarioMinimo, quantidade, preco, valorPago, valorDesconto;

        System.out.println("\nentre com o salário mínimo: ");
        Scanner input = new Scanner(System.in);
        salarioMinimo = input.nextDouble();
        System.out.println("\nentre com a quantidade em quilowatt");
        quantidade = input.nextDouble();

        preco = salarioMinimo / 700;
        valorPago = preco * quantidade;
        valorDesconto = valorPago * 0.9;

        System.out.println("\n preço do quilowatt: " + preco + "\n valor a ser pago: " + valorPago + "\n valor com desconto: " + valorDesconto);
        System.out.println("\n");

        input.close();
    }
}
