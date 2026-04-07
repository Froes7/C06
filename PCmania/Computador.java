public class Computador {
    
    // Declaração de variáveis
    private String marca;
    private float preco;
    private HardwareBasico[] hardwares = new HardwareBasico[3];
    private SistemaOperacional sistema;
    private MemoriaUSB musb;
    private boolean acompanha = false;
    
    // Construtor da classe Computador
    public Computador(String marca, float preco){
        this.marca = marca;
        this.preco = preco;
    }

    // Setter dos Hardwares Básicos
    public void setHardwareBasico(HardwareBasico hardware, int i){
        this.hardwares[i] = hardware;
    }

    // Setter do Sistema Operacional
    public void setSistemaOperacional(SistemaOperacional so){
        this.sistema = so;
    }

    // Setter/Método da memória USB opcional
    public void addMemoriaUSB(MemoriaUSB musb){
        this.musb = musb;
        acompanha = true;
    }

    // Getter do Preço do Computador
    public float getPreco(){
        return this.preco;
    }

    // Método de impressão das informações da classe Computador e suas classes dependentes e agregadas
    public void mostraPcConfigs(){
        System.out.printf("%n%s%n", marca);
        for (int i = 0; i < 3; i++) {
            hardwares[i].mostraHardwareBasico();
        }
        sistema.mostraSistemaOperacional();
        if (acompanha == true) musb.mostraMemoriaUSB();
        System.out.printf("R$%.2f%n", preco);
    }
}
