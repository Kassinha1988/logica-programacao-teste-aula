
public class Execicio04 {
    public static void main(String[] args) {
        double[] temperaturas = { 22.5, 25, 27.5, 19.5, 21, 24, 28 };
        String[] Dias = { "domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado" };
        double media, soma = 0;
        int diaMaisQuente = 0;
        double maiorTemperatura = temperaturas[0];

        for (int i = 0; i < temperaturas.length; i++) {
            soma =soma + temperaturas[i]; 
            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
                diaMaisQuente = i; 
            }
        }

        media = soma / temperaturas.length; 

        System.out.println("A média da semana é: " + media);

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > media) {
                System.out.println("A temperatura do dia " + Dias[i] + " foi maior que a média: " + temperaturas[i]);
            }
        }

        System.out.println("O dia mais quente foi: " + Dias[diaMaisQuente] + " com a temperatura de " + maiorTemperatura);
    }
}

