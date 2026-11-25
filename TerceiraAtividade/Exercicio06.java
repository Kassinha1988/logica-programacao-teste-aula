import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = new int[5];
        int[] soma = new int[5];
        int[] intercala = new int[10];

        Scanner leia = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite numeros[" + i + "]: ");
            numeros[i] = leia.nextInt();

        }

        for (int j = 0; j < 5; j++) {
            System.out.print("Digite numeros2[" + j + "]: ");
            numeros2[j] = leia.nextInt();

        }

        for (int i = 0; i < 5; i++) {
            soma[i] = numeros[i] + numeros2[i];
            intercala[i * 2] = numeros[i];
            intercala[i * 2 + 1] = numeros2[i];
        }

        System.out.print("soma[]: ");
        for (int i = 0; i < soma.length; i++) {
            System.out.print(soma[i] + " ");
        }
        System.out.println();

        System.out.print("intercala[]: ");
        for (int i = 0; i < intercala.length; i++) {
            System.out.print(intercala[i] + " ");
        }
        System.out.println();
        leia.close();
    }
}
