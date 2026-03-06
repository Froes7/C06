import java.util.Scanner;

public class Zé_do_lanche_2{
    public static void main(String[] args){
        
        Scanner valorTeclado = new Scanner(System.in);
        int h1, h2, h3;

        System.out.println("Quantos lanches foram consumimdos na primeira hora?");
        h1 = valorTeclado.nextInt();

        System.out.println("Quantos lanches foram consumimdos na segunda hora?");
        h2 = valorTeclado.nextInt();

        System.out.println("Quantos lanches foram consumimdos na terceira hora?");
        h3 = valorTeclado.nextInt();

        int t = h1 + h2 + h3;
        double m = (double) t/3;
        
        System.out.println("Total de lanches consumidos: " + t);
        System.out.printf("Media de lanches consumidos por hora: %.1f%n",m);

        valorTeclado.close();
    }
}