package Slide_11;

public class Cachorro extends Mamífero {
        
    public Cachorro(String nome, double vida){
        super(nome, vida);
    }

    public void emitirSon(){
        System.out.printf("%nCachorro diz: Au Au Au %n");
    } 
}
