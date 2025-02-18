import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a sua primeira nota:");
        float nota1 = ler.nextFloat();
        System.out.println("Digite a sua segunda nota:");
        float nota2 = ler.nextFloat();

        float media = (nota1 + nota2)/2;
        System.out.println("A média entre "+ nota1+" e "+ nota2+" é igual a "+media);

        ler.close();
    }
}
