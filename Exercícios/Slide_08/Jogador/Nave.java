package Slide_08.Jogador;
import Slide_08.Inimigo.Asteroide;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro){
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast){

        if(ast.gettipoAsteroide() == "grande"){
            if(tipoTiro == "normal") tomarDano();
            else ast.Destruir();
        }
        else ast.Destruir();
    }

    private void tomarDano(){
        vida--;
        System.out.printf("%nBAM!%n%s tomou dano! vida: %f%n",nome,vida);
    }
}
