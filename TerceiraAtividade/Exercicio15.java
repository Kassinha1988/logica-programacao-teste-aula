import java.util.Scanner;

public class FixaçãoRetorno {
    static double calcularMedia(double nota01, double nota02) {
        double media = (nota01 + nota02) / 2;
        return media;
    }

    public static String situacao(double media) {
        if (media >= 7) {
            return "Aprovado";

        } else {
            return "Em recuperação";

        }

    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota01 = leia.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota02 = leia.nextDouble();

        double media = calcularMedia(nota01, nota02);
        System.out.println("Média: " + media);
        leia.close();

        System.out.println("Situação: " + situacao(media));

    }
}
