public class Exercicio09 {
    public static void main(String[] args) {
        int[][] notas = {{7, 8}, {5, 9}, {10, 6}};
        int somaAluno1 = 0, somaAluno2 = 0, somaAluno3 = 0, totalGeral = 0;

        somaAluno1 = somarNota(notas, 0);
        somaAluno2 = somarNota(notas, 1);
        somaAluno3 = somarNota(notas, 2);
        totalGeral = somaAluno1 + somaAluno2 + somaAluno3;

        System.out.printf("Soma do aluno 1: %d", somaAluno1);
        System.out.printf("\nSoma do aluno 2: %d", somaAluno2);
        System.out.printf("\nSoma do aluno 3: %d", somaAluno3);
        System.out.printf("\nTotal geral----: %d", totalGeral);
    }

    public static int somarNota(int nota[][], int linha){
        int soma = 0;
        for (int i = 0; i < nota[0].length; i++) {
            soma += nota[linha][i];
        }
        return soma;
    }
}


