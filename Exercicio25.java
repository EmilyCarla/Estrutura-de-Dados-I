import java.util.Scanner;       

public class Exercicio25 {
    public static void main(String[] args) {
        
        int data;
        int dia;
        int mes;
        int ano;

        System.out.println("Digite data no formato ddmmaa: ");
        Scanner input = new Scanner(System.in);
        data = input.nextInt();

        dia = (data / 10000);
        mes = (data % 10000 / 100);
        ano = (data % 100);

        System.out.println("\nDIA:" + dia);
        System.out.println("MES:" + mes);
        System.out.println("ANO:" + ano);
        
        input.close();

    }
}