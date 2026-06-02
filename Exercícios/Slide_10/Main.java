package Slide_10;

public class Main {
    public static void main(String[] args){

        Mamífero boi = new Boi("Bobo", 50);    
        Mamífero lontra = new Lontra("Squeek", 5);
        Mamífero cachorro = new Cachorro("Tobby", 15);

        boi.emitirSon();
        boi.mostraInfo();

        lontra.emitirSon();
        lontra.mostraInfo();

        cachorro.emitirSon();
        cachorro.mostraInfo();
    }
}
