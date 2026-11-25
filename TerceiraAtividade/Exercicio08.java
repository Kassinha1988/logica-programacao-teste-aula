import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int linha=4, coluna=3;
        int cont=1;
        int[][] matriz = new int[linha][coluna];
        //int[][] matriz = {{5, -2, 9}, {4, 0, 12}, {7, 3, 1}, {8, 6, -5}};
        
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
            System.out.printf("Digite o %dº de %d valores da matriz: ", cont, linha*coluna);
                matriz[i][j] = scan.nextInt();
                cont++;
            }
        }
        scan.close();

        maiorMenor(matriz, linha, coluna);
    }

    public static void maiorMenor(int[][] matriz, int linha, int coluna) {
        int maior=0, menor=99999;

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if(matriz[i][j] < menor){
                    menor = matriz[i][j];
                }
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        System.out.print("----------------");
        System.out.printf("\nMaior: %d", maior);
        System.out.printf("\nMenor: %d", menor);
    }
}

