package Slide_11;

public class Lontra extends Mamífero implements Aquático {
    
    public Lontra(String nome, double vida){
        super(nome, vida);
    }

    public void emitirSon(){
        System.out.printf("%nLontra diz: *sniff* *sniff* %n");
    } 

    @Override
    public void nadar(){
        System.out.printf("%nLontra está nadando!%n");
    }
}
