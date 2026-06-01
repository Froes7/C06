package Slide_07.Conta_e_cliente;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        float quantia;
        Conta conta = new Conta();

        while(numero != 3){

            System.out.printf("%nBem vindo ao banco Fróes! (BF)%n%nOque você quer fazer hoje?%n1_Sacar%n2_Depositar%n3_Sair%n");
            numero = scan.nextInt();
            
            switch(numero){
                case 1:
                    // System.out.println("Insira sua conta:");
                    // cliente = scan.nextInt();
                    
                    System.out.println("Insira a quantia:");
                    quantia = scan.nextInt();
                    conta.sacar(quantia);
                    break;

                case 2:
                    System.out.println("Insira a quantia:");
                    quantia = scan.nextInt();
                    conta.deposita(quantia);
                    break;

                case 3: 
                    break;

                default:
                    System.out.println("Insira uma opção válida.");
                    break;
            }
        }

        scan.close();
    }
}
