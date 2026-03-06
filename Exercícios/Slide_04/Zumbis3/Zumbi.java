package Zumbis3;

public class Zumbi {
    
    double vida;

    double mostraVida(){
        return vida;
    }

    double tiraVida(double q){
        vida -= q;
        return vida;
    }
}
