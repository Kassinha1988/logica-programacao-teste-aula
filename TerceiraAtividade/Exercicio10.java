public class ControleVendas_10 {
    public static void main(String[] args) {
        int[][] venda = {
            {200, 400, 450, 100 },
            {600, 200, 450, 400},
            {160, 240, 800, 200 }
        };
        int total = 0, maiorVenda = 0, funcionario_1 = 0, funcionario_2 = 0, funcionario_3 = 0;

        funcionario_1 = somarVenda(venda, 0);
        funcionario_2 = somarVenda(venda, 1);
        funcionario_3 = somarVenda(venda, 2);
        total = funcionario_1 + funcionario_2 + funcionario_3;
        maiorVenda = maiorVenda(venda);

        System.out.println("Funcionario 1: " + funcionario_1);
        System.out.println("Funcionario 2: " + funcionario_2);
        System.out.println("Funcionario 3: " + funcionario_3);
        System.out.println("Total geral--: " + total);
        System.out.println("Maior venda--: " + maiorVenda);
    }

    public static int somarVenda(int venda[][], int linha){
        int soma = 0;
        for (int i = 0; i < venda[0].length; i++) {
            soma += venda[linha][i];
        }
        return soma;
    }

    public static int maiorVenda(int venda[][]){
        int maior = 0;

        for (int i = 0; i < venda.length; i++) {
            for (int j = 0; j < venda[0].length; j++) {
                if(venda[i][j] > maior){
                    maior = venda[i][j];
                }
            }
        }
        return maior;
    }
}


