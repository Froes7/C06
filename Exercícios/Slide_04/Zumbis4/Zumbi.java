package Zumbis4;

public class Zumbi {
    
    double vida;
    String nome;

    double mostraVida(){
        return vida;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia){
        
        boolean x;
        
        if(vida >= quantia)
        {
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            x = true;
        }
        else{
            x = false;
        }
        
        return x;
    }
}
