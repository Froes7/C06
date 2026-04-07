public class SistemaOperacional {
    
    // Declaração de variáveis
    private String nome;
    private int tipo;

    // Construtor da classe SistemaOperacional
    public SistemaOperacional(String nome, int tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    // Método de impressão das informações do Sistema Operacional
    public void mostraSistemaOperacional(){
        System.out.printf("%s (%d bits)%n", nome, tipo);
    }
}
