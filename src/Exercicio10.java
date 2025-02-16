import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite a altura em metros:");
        double altura = ler.nextDouble();
        System.out.print("Digite a comprimento metros:");
        double comprimento = ler.nextDouble();
        double area = altura*comprimento;
        double litros_de_tinta = area*2;

        System.out.print("Você precisará de "+litros_de_tinta+" litros para pintar uma area "+area+" metros");
    }
}
