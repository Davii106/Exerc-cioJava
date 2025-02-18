import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite quantos Km você percorreu com o carro:");
        double kms = ler.nextDouble();
        System.out.print("Digite a quantidade de dias que você alugou o carro:");
        double dias= ler.nextDouble();
        double preço_total = (90*dias)+(0.20*kms);

        System.out.print("Você pagará um total de R$"+preço_total+" por ter usado o carro por "+dias+" dias e percorrido "+kms+" Km");

        ler.close();
    }
}
