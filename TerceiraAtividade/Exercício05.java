import java.util.Scanner;

public class Exercício05 {
    public static void main(String[] args) {
        String nomes[] = new String[6];
        String pesquisarNome;
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Escreva um nome: ");
            nomes[i] = leia.nextLine();

        }
        System.out.print("Qual nome você quer procurar? ");
        pesquisarNome = leia.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(pesquisarNome)) {
                System.out.println("O nome " + pesquisarNome + " está na(s) posição(ões): " + (i + 1));
                encontrado = true;
            }

        }
        if (encontrado ==false) {
            System.out.println("O nome procurado não consta no sistema!");
        }leia.close();
    }
}
