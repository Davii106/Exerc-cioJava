import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite a quantidade de cigarros que você fuma no dia:");
        double cigarros = ler.nextDouble();
        System.out.print("Digite a quantos anos você já fuma:");
        double anos_de_fumo = ler.nextDouble();
        double perca_de_vida = (cigarros*10)/24;

        System.out.print("Você perderá "+perca_de_vida+" minutos de vida a cada "+cigarros+" cigarro que fumar");
    }
}
