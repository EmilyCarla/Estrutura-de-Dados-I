import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {

        int data, dia, mes, ano, ndata;
        
        System.out.println("Digite data no formato DDMMAA: ");
        Scanner input = new Scanner(System.in);
        data = input.nextInt();

        dia = (data / 10000);
        mes = (data % 10000 / 100);
        ano = (data % 100);
        ndata = ( mes * 10000 + dia * 100 + ano);

        System.out.println("\nDIA:" + dia);
        System.out.println("MES:" + mes);
        System.out.println("ANO:" + ano);
        System.out.println("\nDATA NO FORMATO MMDDAA:" + ndata);
        
        input.close();
    }
}
