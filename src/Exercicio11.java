import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor de A:");
        float a = ler.nextFloat();
        System.out.print("Digite o valor de B:");
        float b = ler.nextFloat();
        System.out.print("Digite o valor de C:");
        float c = ler.nextFloat();

        float Delta = (b*b)-4*(a)*(c);
        System.out.print("Seu Delta Δ é igual a "+Delta);
    }
}
