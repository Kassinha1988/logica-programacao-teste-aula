
public class Exercicio03 {
    public static void main(String[] args) {

   
        double[] salarios = {1500,2500,1999.99,3000,1000};

        for (int i =0; i < 5; i++){
            if(salarios[i] < 2000){
                salarios[i]= salarios[i] + salarios[i] * 0.10;
            }

        System.out.println("O salário do funcionário " + (i + 1) + " é: " + salarios[i]);


    }
}
}