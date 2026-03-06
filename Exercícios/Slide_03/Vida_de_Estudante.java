import java.util.Scanner;

public class Vida_de_Estudante{
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua NPA:");
        float NPA;
        NPA = entrada.nextFloat();

        if (NPA >= 60){
            System.out.printf("Parabéns! Você passou! NFA = %.1f%n", NPA);
        }
        else if(30 <= NPA && NPA <= 60){
            System.out.println("Informe sua NP3:");
            float NP3 = entrada.nextFloat();
            float NFA = (NP3 + NPA)/2;
            if(NFA >= 50){
                System.out.printf("Parabéns! Você passou! NFA = %.1f%n", NFA);
            }
            else{
                System.out.printf("Infelizmente, você não passou. Nos vemos no próximo semestre! NFA = %.1f%n", NFA);
            }
        }
        else{
            System.out.printf("Infelizmente, você não passou. Nos vemos no próximo semestre! NFA = %.1f%n", NPA);
        }

        entrada.close();
    }
}