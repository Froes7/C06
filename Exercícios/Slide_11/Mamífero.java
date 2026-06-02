package Slide_11;

public abstract class Mamífero {
    protected String nome;
    protected double vida;

    public Mamífero(String nome, double vida){
        this.nome = nome;
        this.vida = vida;
    }

    public abstract void emitirSon();

    public void mostraInfo(){
        System.out.printf("%nNome: %s%nVida: %f%n", nome, vida);
    }
}
