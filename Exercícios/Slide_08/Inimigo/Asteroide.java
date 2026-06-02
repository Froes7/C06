package Slide_08.Inimigo;

public class Asteroide {
        
    private String nome;
    private String tipoAsteroide;

    public Asteroide(String nome, String tipoAsteroide){
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }

    public void Destruir(){
        System.out.printf("%nBOOM!%n%s destruído.%n", nome);
    }

    public String gettipoAsteroide(){
        return tipoAsteroide;
    }
}
