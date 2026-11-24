import java.util.Scanner;

public class Fixação {
        public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[]numeros = new int[10];
        int pares = 0, impares = 0, soma = 0;

        for(int i =0; i < numeros.length;i++){//1º laço: ler
            System.out.print("Número "+(i + 1)+ ":");
            numeros[i] = leia.nextInt();

        }
        for(int i = 0;i <numeros.length; i++){
            System.out.print(numeros[i]+ " ");
                if (numeros[i] % 2 == 0)pares++;
                else impares++;
                soma +=numeros[i];
        }
                 
        System.out.println("\nPares: "+ pares+ " | Ímpares: "+impares);
        System.out.println("Soma: "+soma);
        leia.close();            
                
            
        }
    }

