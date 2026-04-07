public class HardwareBasico {
    
    // Declaração de variáveis
    private String nome;
    private float capacidade;
    private String unidade;

    // Construtor da classe HardwareBasico
    public HardwareBasico(String nome, float capacidade, String unidade){
        this.nome = nome;
        this.capacidade = capacidade;
        this.unidade = unidade;
    }

    // Método de impressão das informações do Hardware básico
    public void mostraHardwareBasico(){
        System.out.printf("%s %.0f %s%n", nome, capacidade, unidade);
    }
}
