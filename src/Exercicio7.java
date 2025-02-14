import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite um número:");
        double numero = ler.nextDouble();
        double numero2 = numero*2;
        double numero3 = numero/3;

        System.out.println("O dobro de "+numero+" é "+numero2);
        System.out.println("A terça parte de "+numero+" é "+numero3);
    }
}
