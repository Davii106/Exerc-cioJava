import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite uma distância em metros:");
        double distancia = ler.nextDouble();
        double distancia2 = (distancia*100);

        System.out.println("A sua distância de metros convertida é igual a "+ distancia2+" Cm");

        ler.close();
    }
}
