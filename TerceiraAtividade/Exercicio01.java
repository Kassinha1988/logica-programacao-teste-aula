import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int[] numeros = new int[10];
        int pares = 0, impares = 0, soma = 0, i;

        for (i = 0; i < 10; i++) {
            System.out.print("Digite um número " + (i + 1) + ": ");
            numeros[i] = leia.nextInt();

        }
                for (i = 0; i < 10; i++) {
        
                    if (numeros[i] % 2 == 0) {
                        pares++;
                        System.out.println(numeros[i] + " é um número par!");
                    } else {
                        impares++;
                        System.out.println(numeros[i] + " é um número ímpar!");

                       
                       
                    }leia.close();
                      soma =soma + numeros[i];
                }
                System.out.println("Quantidade de números pares: "+pares);
                System.out.println("Quantidade de números ímpares:"+impares);
                System.out.println("A soma dos números digitados é:"+soma);


            }
    }
