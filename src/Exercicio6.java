import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu número:");
        int numero = ler.nextInt();
        int numero1 = numero-1;
        int numero2 = numero+1;

        System.out.println("O antecessor de "+ numero+" é "+ numero1);
        System.out.println("O sucessor de "+numero+" é "+ numero2);

    }
}
