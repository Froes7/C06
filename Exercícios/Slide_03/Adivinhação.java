import java.util.Random;
import java.util.Scanner;

public class Adivinhação{
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int n=0;
        int x = rand.nextInt(10) + 1;

        System.out.println("Adivinhe o número!");

        while(n!=x){
            n = entrada.nextInt();

            if(n == x){
                break;
            }
            
            System.out.println("ERRADO! tente de novo.");
        }

        System.out.println("Parabéns! Você acertou!");

        entrada.close();
    }
}