import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite seu salário:");
        double salario = ler.nextDouble();
        double novo_salario = salario+(salario*(0.15));

        System.out.print("Seu antigo salário era "+salario+" e com o aumento de 15% ficará "+novo_salario);

        ler.close();
    }
}
