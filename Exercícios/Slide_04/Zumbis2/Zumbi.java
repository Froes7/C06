package Zumbis2;

public class Zumbi {
    
    double vida;
    String nome;

    double mostraVida(){
        return vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia){
        vida -= quantia;
        zumbiAlvo.vida += quantia;
        System.out.printf("%nVida transferida!%n%n");
    }
}
