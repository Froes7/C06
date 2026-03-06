import java.util.Random;
import java.util.Scanner;

public class Adivinhação_aprimorado{
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int n=0;
        int x = rand.nextInt(10) + 1;

        System.out.println("Adivinhe o número!");

        while(n!=x){
            n = entrada.nextInt();

            if(n>x){
                System.out.println("O número é menor");
            }
            else if (n<x){
                System.out.println("O número é maior");
            }
        }

        System.out.println("Parabéns! Você acertou!");

        entrada.close();
    }
}