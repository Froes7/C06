package Zumbis2;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        System.out.println("Insira a vida do primeiro zumbi:");
        zumbi1.vida = entrada.nextDouble();
        System.out.println();
        
        System.out.println("Insira a vida do segundo zumbi:");
        zumbi2.vida = entrada.nextDouble();
        System.out.println();

        int n=0;

        while(n!=3){

            System.out.printf("%nO que você quer fazer?%n%n1_Ver vida%n2_Transferir vida%n3_ Sair%n");
            n = entrada.nextInt();
            int x;
            
            switch(n){
                case 1:
                    System.out.printf("%nVer vida de qual zumbi?%n%n1_ Primeiro%n2_ Segundo%n");
                    x = entrada.nextInt();
                    if(x==1){
                        System.out.println();
                        System.out.println(zumbi1.mostraVida());
                    }
                    else if (x==2){
                        System.out.println();
                        System.out.println(zumbi2.mostraVida());
                    }
                    break;
                
                case 2:
                    System.out.printf("%nTransferir vida de quem?%n%n1_ Primeiro pro segundo%n2_ Segundo pro primeiro%n");
                    x = entrada.nextInt();
                    int q;
                    System.out.printf("%nQuanto?%n");
                    q = entrada.nextInt();
                    if(x==1){
                        zumbi1.transfereVida(zumbi2, q);
                    }
                    else if(x==2){
                        zumbi2.transfereVida(zumbi1, q);
                    }
                case 3:
                    break;
                default:
                    System.out.println("Insira uma opção válida!");
            }
        }

        entrada.close();
    }
}
