import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um valor");
        int valor1 = ler.nextInt();
        System.out.print("Digite outro valor");
        int valor2 = ler.nextInt();
        int soma = valor1 + valor2;
        System.out.print("A soma entre "+valor1+" e "+valor2+" igual a "+soma);
    }
}
