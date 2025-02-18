import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite quanto você possui na carteira em R$:");
        double real = ler.nextDouble();
        double dolar = real/6.09;

        System.out.println("Você tem "+ real+" e pode comprar "+dolar);

        ler.close();
    }
}
