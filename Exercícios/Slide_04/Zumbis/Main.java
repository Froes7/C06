package Zumbis;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        zumbi z = new zumbi();

        System.out.printf("Crie seu zumbi!%nQual o nome dele?%n");
        z.nome = entrada.next();

        System.out.println("Quantos anos ele tem?");
        z.idade = entrada.nextInt();

        System.out.println("Quantos dentes ele tem?");
        z.dentes = entrada.nextInt();

        System.out.printf("Perfeito! %s está pronto!%n%n", z.nome);
        int n = 0;

        while(n!=5){
            System.out.printf("O que você quer fazer?%n1_Cambalhota%n2_Levar uma mordida%n3_Perguntar sua idade%n4_matá-lo%n5_sair%n");
            n = entrada.nextInt();
            
            switch(n){
                case 1:
                    z.cambalhota(z);
                    break;
                case 2:
                    z.mordida(z);
                    break;
                case 3:
                    z.perguntar_idade(z);
                    break;
                case 4:
                    n = z.matar(z,n);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");
            }
        }

        entrada.close();
    }
}
