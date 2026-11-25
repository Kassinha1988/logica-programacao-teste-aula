
import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
       
        System.out.print("Digite o primeiro número: ");
        double numero01 = leia.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero02 = leia.nextDouble();
        
        System.out.println("Soma: "+soma(numero01, numero02));
        System.out.println("Subtração: "+subtrair(numero01, numero02));
        System.out.println("Multiplicação: "+ multiplicar(numero01, numero02));

        if (numero02==0) {
            System.out.println("Não é possível dividir por zero!");
            
        }else{
            System.out.println("Divisão: "+dividir(numero01, numero02));
        }leia.close();
        

    }
    

        
    static double soma( double numero01,double numero02){
        return numero01 + numero02;
    }
    static double subtrair(double numero01,double numero02){
        return numero01 - numero02;
    }
    static double multiplicar( double numero01,double numero02){
        return numero01*numero02;
    
    }
    static double dividir(double numero01,double numero02){
        return numero01/numero02;
        
    }
}
