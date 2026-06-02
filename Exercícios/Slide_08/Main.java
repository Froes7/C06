package Slide_08;
import Slide_08.Jogador.Nave;
import Slide_08.Inimigo.Asteroide;

public class Main {
    public static void main(String[] args){

        Nave nave1 = new Nave( "ZIPZIP", 5, "normal" );
        Nave nave2 = new Nave("ZOPZOP", 3, "explosivo");

        Asteroide asteroide1 = new Asteroide("BIPBIP", "pequeno");
        Asteroide asteroide2 = new Asteroide("BOPBOP", "grande");

        nave1.atirar(asteroide1);
        nave1.atirar(asteroide2);

        nave2.atirar(asteroide1);
        nave2.atirar(asteroide2);
    }
}
