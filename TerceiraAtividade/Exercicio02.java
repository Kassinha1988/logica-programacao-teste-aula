import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double[] notas = new double[5];
        double media = 0;
        int aprovados = 0, reprovados = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = leia.nextDouble();

        }
        media = (notas[0] + notas[1] + notas[2] + notas[3] + notas[4]) / 5;
        for (int i = 0; i < 5; i++) {
            if (notas[i] >= 7) {
                aprovados++;
                System.out.println("O aluno foi aprovado!");
            } else {
                reprovados++;
                System.out.println("O aluno foi reprovado");
            }

        }
        System.out.println("A média da turma foi: " + media);
        System.out.println("Alunos aprovados: " + aprovados);
        System.out.println("Alunos reprovados: " + reprovados);
        leia.close();

    }
}
