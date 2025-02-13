import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = ler.nextLine();
        System.out.print("Digite seu salário: ");
        float salario = ler.nextFloat();
        System.out.print("O funcionário "+ nome+" tem um salário de "+ salario+" em junho.");
    }
}
