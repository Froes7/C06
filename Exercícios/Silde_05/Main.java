package Silde_05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Declarando variáveis;
        Scanner scan = new Scanner(System.in);
        Matriz campo = new Matriz();
        int c, d = 0;
        boolean m = false;
        int pontuacao = 0;

        // Título
        System.out.println();
        System.out.println("M I N E S W E E P E R");
        System.out.println();

        // Seleção de dificuldade
        while(d<1 || d>5){
            System.out.printf("%nSelecione a quantidade de bombas:%n1_10 (X1)%n2_20 (X2)%n3_30 (X3)%n4_40 (X4)%n5_50 (x5)%n");
            d = scan.nextInt();

            if(d<1 || d>5){
                System.out.printf("%nSeleciona uma opção válida%n");
            }
        }
        campo.gerarBombas(d*10);
        
        // do while do jogo funcionando
        do {
            System.out.printf("%nSua posição atual é: x -> %d, y -> %d%n", campo.jorge.posx+1, campo.jorge.posy+1);
            if(m){
                pontuacao++;
            }
            
            System.out.printf("Para onde você quer se mover?%n1_Cima%n2_Baixo%n3_Esquerda%n4_Direita%n");
            System.out.println();
            c = scan.nextInt();
            m = campo.Mover(c);
            campo.CheckMorto();

        } while(campo.jorge.morto == false);

        // Cálculo da pontuação para imprimi-la
        pontuacao = pontuacao*d;
        System.out.printf("Sua pontuação: %d%n%n",pontuacao);
        scan.close();
    }
}
