import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte tam = 10;
        int[] vetEntrada = new int[tam];

        for (int i = 0; i < vetEntrada.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vetEntrada[i] = scan.nextInt();
        }
        scan.close();

        System.out.print("\nOriginal----------: ");
        imprimiVetor(vetEntrada);

        System.out.print("Sem repetidos-----: ");
        removeRepetidos(vetEntrada);
    }

    public static void imprimiVetor(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void removeRepetidos(int[] vetEntrada) {
        int[] vetProcessado = new int[vetEntrada.length];

        for (int i = 0; i < vetProcessado.length; i++) {
            vetProcessado[i] = vetEntrada[i];
        }

        for (int i = 0; i < vetEntrada.length; i++) {
            for (int j = i + 1; j < vetEntrada.length; j++) {
                if (vetProcessado[i] == vetProcessado[j]) {
                    vetProcessado[j] = 0;
                }
            }
        }

        int cont = 0;
        for (int i = 0; i < vetProcessado.length; i++) {
            if (vetProcessado[i] != 0) {
                System.out.print(vetProcessado[i] + " ");
            } else {
                cont++;
            }
        }
        System.out.printf("\nValores removidos-: %d", cont);
    }
}
