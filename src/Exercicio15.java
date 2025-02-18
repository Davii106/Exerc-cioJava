import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite o número de dias que você trabalhou neste mês:");
        double dias = ler.nextDouble();
        System.out.print("Digite a quantidade de horas que você trabalha em um dia:");
        double horas = ler.nextDouble();
        double salario = horas*25*dias;

        System.out.print("O seu salário deste mês é R$"+salario+" por ter trabalhado "+horas+" horas e "+dias+" dias no mês");

        ler.close();
    }
}
