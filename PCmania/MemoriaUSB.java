
public class MemoriaUSB {

    // Declaração de variáveis
    private String nome;
    private int capacidade;
    private String unidade;

    // Construtor da classe MemoriaUSB
    public MemoriaUSB(String nome, int capacidade, String unidade){
        this.nome = nome;
        this.capacidade = capacidade;
        this.unidade = unidade;
    }

    // Método de impressão das informações da Memória USB
    public void mostraMemoriaUSB(){
        System.out.printf("%s %d %s%n", nome, capacidade, unidade);
    }
}