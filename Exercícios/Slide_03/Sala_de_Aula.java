import java.util.Scanner;

public class Sala_de_Aula{
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        int n;
        System.out.println("Insira o número de alunos:");
        n = entrada.nextInt();

        switch (n) {
            case 10:
            case 20:
                System.out.println("Sala I-16");
                break;
            
            case 30:
                System.out.println("Sala I-22");
                break;

                default:
                System.out.println("Nenhuma sala disponível para essa quantidade de alunos.");
        }

        entrada.close();
    }
}