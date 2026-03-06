package Zumbis3;
import java.util.Random;

public class Main{
    public static void main(String[] args){

        Random rand = new Random();

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();
        z1.vida = 100;
        z2.vida = 100;
        
        System.out.println("Vida do primeiro Zumbi:");
        System.out.println(z1.mostraVida());

        System.out.println("Vida do segundo Zumbi:");
        System.out.println(z2.mostraVida());
        System.out.println();

        System.out.println("Modificando vidas individualmente...");
        double x = rand.nextInt(100) + 1;
        System.out.println("Primeiro: " + z1.vida + " - " + x + " = " + z1.tiraVida(x));
        x = rand.nextInt(100) + 1;
        System.out.println("Segundo:" + z2.vida + " - " + x + " = " + z2.tiraVida(x));
        System.out.println();

        System.out.println("Agora com z1 = z2");
        z1 = z2;
        
        z1.vida = 100;
        
        System.out.println("Vida do primeiro Zumbi:");
        System.out.println(z1.mostraVida());

        System.out.println("Vida do segundo Zumbi:");
        System.out.println(z2.mostraVida());
        System.out.println();

        System.out.println("Modificando vidas simultaneamente...");
        x = rand.nextInt(100) + 1;
        System.out.println("Primeiro(e consequentemente segundo): " + z1.vida + " - " + x + " = " + z1.tiraVida(x));
        System.out.println();

        System.out.println("Vida do primeiro Zumbi:");
        System.out.println(z1.mostraVida());

        System.out.println("Vida do segundo Zumbi:");
        System.out.println(z2.mostraVida());
        System.out.println();
    }

}