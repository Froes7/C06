package Jogo;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        //scanner e variável randômica
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        
        //personagens
        Personagem p1 = new Personagem();
        p1.nome = "Clayton";
        p1.pontos = 50;

        //arma
        Arma a1 = new Arma();
        p1.arma = a1;
        a1.nome = "Muramasa";
        a1.poder = 10;
        a1.resistencia = 10;
        a1.descricao = "Muramasa é uma lâmina forjada na própria essência da noite. Seu aço escuro reflete apenas sombras, e seu fio corta com a frieza de um eclipse. Dizem que cada golpe da Muramasa não fere apenas o corpo, mas também o destino de quem a enfrenta. Nas mãos de um verdadeiro mestre como Clayton, ela se torna a própria noite em movimento, silenciosa, inevitável e mortal.";
        
        //introdução
        System.out.printf("%nApós uma longa e confusa caminhada na floresta sombria, você chega em um campo aberto no meio da floresta, com a luz da lua iluminando adiante. %nEntre a névoa e o luar você enxerga na distância um guerreiro, ele percebe sua presença.%n");
        System.out.println("Guerreiro desconhecido: Eu sou Clayton! O cavalheiro da lua! Se você pretende me desafiar, saque sua espada e veremos se você é digno de sair desta floresta!");
        System.out.println();
        System.out.println("O que você pretende fazer?");
        
        int n=0;
        boolean w=false;
        while (n!=4) {
            
            System.out.printf("%n1_ Analisar arma de Clayton%n2_ Atacar Clayton%n3_ Defender um ataque de Clayton%n4_ Sair%n");
            n = entrada.nextInt();
            int x;

            switch (n) {
                case 1:
                    System.out.printf("%nVocê analisa a arma de Clayton e nota algumas coisas%n");
                    a1.MostrarInfoArma();
                    break;
                
                case 2:
                    x = rand.nextInt(10) + 1;
                    if(x>=5){
                        System.out.printf("%nVocê ataca Clayton e acerta!%nClayton sofreu 5 de dano!%n");
                        p1.tomarDano();
                    }
                    else{
                        System.out.printf("%nVocê ataca Clayton e erra!%nClayton saiu ileso.%n");
                    }
                    break;
                case 3:
                    x = rand.nextInt();
                    if(x>5){
                        System.out.printf("%nVocê sofre um ataque de Clayton e ele acerta.%nPorém você defende com seu escudo e armadura.%n");
                        p1.usarArma();
                    }
                    else{
                        System.out.printf("%nVocê sofre um ataque de Clayton mas ele erra.%nVocê saiu ileso dessa vez%n");
                    }
                    break;
                case 4:
                    w = false;
                    System.out.println("Você sente que chegou ao seu limite e cai no chão.");
                    System.out.println("Clayton: Hahaha! Como esperado! Você não é páreo para mim e minha lâmina, diga adeus viajante. Você não verá mais nada além desta floresta!");
                    break;
                default:
                    System.out.println("Escoha uma opção válida.");
                    break;
            }

            if(a1.resistencia<=0){
                n = 4;
                w = true;
                System.out.println("Você vê a lendária espada de Clayton, agora desgastada, quebrar com o ataque que você sofreu.");
                System.out.println("Clayton: NÃO! MINHA MURAMASA! ...ok viajante, você venceu, apenas me deixe em paz, sem minha arma eu sou um qualquer.");
            }
            if(p1.pontos<=0){
                n = 4;
                w = true;
                System.out.println("Você vê Clayton já gravemente ferido, ele se ajoelha em sua frente e começa a murmurar.");
                System.out.println("Clayton: Não... Não pode ser... como... como eu fui derrotado? Ok viajante, você venceu, vá embora e apenas me deixe morrer em paz.");
            }
        }

        if(w==true){
            System.out.println("Você Venceu! Parabéns.");
        }
        else{
            System.out.println("Você está morto. Game over...");
        }
        
        entrada.close();
    }
}
