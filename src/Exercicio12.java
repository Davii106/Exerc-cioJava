import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite o valor de seu produto:");
        float produto = ler.nextFloat();
        double desconto = produto - (produto*(0.05));

        System.out.print("Com o desconto de 5% seu "+produto+" ficará a "+desconto);

        ler.close();
    }
}
