package Zumbis;

public class zumbi {
    String nome;
    int idade;
    int dentes;

    void cambalhota(zumbi cabra){
        System.out.printf("%s deu uma cambalhota!%n%n", cabra.nome);
    }
    void mordida(zumbi cabra){
        System.out.printf("%s te deu uma mordida com seus %d dentes!%n%n", cabra.nome, cabra.dentes);
    }
    void perguntar_idade(zumbi cabra){
        System.out.printf("%s diz: 'eU tEnHo %d AnOs bleeergh!'%n%n", cabra.nome, cabra.idade);
    }
    int matar(zumbi cabra, int n){
        System.out.printf("%s morreu :(", cabra.nome);
        return 5;
    }
}
