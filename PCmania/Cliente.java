import java.util.Scanner;

public class Cliente {

    // Declaração de variáveis
    private String nome;
    private String cpf;
    private int NumeroPedidos = 0;
    private Scanner scan = new Scanner(System.in);
    private Computador[] computadores = new Computador[100];
    
    // Construtor da classe Cliente
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    // Getter do carrinho de pedidos
    public Computador[] getPedidos(){
        return computadores;
    }

    // Metódo para calcular o valor total do carrinho
    public float calculaTotalCompra(){
        float total = 0;
        for (int i = 0; i < NumeroPedidos; i++) total += computadores[i].getPreco();
        return total;
    }

    // Método de impressão das informações do cliente
    public void mostraCliente(){
        if(NumeroPedidos != 0){
            System.out.printf("%nInformações da compra:%n");
            System.out.printf("%nCliente: %s%nCPF: %s%n", nome, cpf);
        }
    }

    // Método de impressão do carrinho
    private void mostraCarrinho(){
        if(NumeroPedidos != 0){
            for (int i = 0; i < NumeroPedidos; i++) {
                computadores[i].mostraPcConfigs();
            }

            System.out.printf("%nTotal: R$%.2f%n", calculaTotalCompra());
        }
        else System.out.printf("%nSeu carrinho está vazio.%n");
    }

    // Getter da quantidade de objetos adicionados ao carrinho
    public int getNumeroPedidos(){
        return NumeroPedidos;
    }

    // Menu principal do programa
    public void menu(){
        int n = 1;
        int o;
        System.out.printf("%nBem vindo %s. Aproveite a promoção de queima de estoque! selecione pelo menos duas opções:%n", nome);

        while(n!=0){

            System.out.printf("%n0_Terminar compra%n1_Apple, R$2194.00%n2_Samsung, R$3428.00%n3_Dell, R$ 7872.00%n4_Mostrar carrinho%n5_Cancelar%n");
            n = scan.nextInt();
            o = 0;

            switch (n) {
                case 0:
                    System.out.printf("%nDeseja encerrar sua compra?%n1_Confirmar%n2_Cancelar%n");
                    o = scan.nextInt();
                    if (o != 1) n = -1;
                    else if (NumeroPedidos == 1) {
                        System.out.printf("%nPor favor selecione mais pedidos:%n");
                        n = -1; 
                    }
                    break;
                case 1:
                    MostraPromocao(n);
                    System.out.printf("%nDeseja adicionar essa promoção ao seu carrinho?%n1_Confirmar%n2_Cancelar%n");
                    o = scan.nextInt();
                    if (o != 1) n = -1;
                    else {
                        MontaComputador(n,NumeroPedidos);
                        NumeroPedidos++;
                    }
                    break;
                case 2:
                    MostraPromocao(n);
                    System.out.printf("%nDeseja adicionar essa promoção ao seu carrinho?%n1_Confirmar%n2_Cancelar%n");
                    o = scan.nextInt();
                    if (o != 1) n = -1;
                    else {
                        MontaComputador(n,NumeroPedidos);
                        NumeroPedidos++;
                    }
                    break;
                case 3:
                    MostraPromocao(n);
                    System.out.printf("%nDeseja adicionar essa promoção ao seu carrinho?%n1_Confirmar%n2_Cancelar%n");
                    o = scan.nextInt();
                    if (o != 1) n = -1;
                    else {
                        MontaComputador(n,NumeroPedidos);
                        NumeroPedidos++;
                    }
                    break;
                case 4:
                    mostraCarrinho();
                    break;
                case 5:
                    System.out.printf("%nDeseja cancelar sua compra e limpar o carrinho?%n1_Confirmar%n2_Cancelar%n");
                    o = scan.nextInt();
                    if (o != 1) n = -1;
                    else{
                        n = 0;
                        NumeroPedidos = 0;
                    }
                    break;
                case -1:
                    break;
                default:
                    System.out.printf("%nSelecione uma opção válida!%n");
                    break;
            }
        }
    }

    // Método de impressão das promoções disponíveis antes de adicioná-las ao carrinho
    private void MostraPromocao(int n){
        
        switch (n) {
            case 1:
                System.out.printf("%nApple%nPentium Core i3 (2200Mhz)%n8Gb de Memória RAM%n500Gb de HD%nSistema Operacional MacOS Sequoia (64 bits)%nAcompanha Pen-drive de 16Gb%n");    
                break;
            case 2:
                System.out.printf("%nSamsung%nPentium Core i5 (3370Mhz)%n16Gb de Memória RAM%n1Tb de HD%nSistema Operacional Windows 8 (64 bits)%nAcompanha Pen-Drive de 32gb%n");
                break;
            case 3:
                System.out.printf("%nDell%nPentium Core i7 (4500Mhz)%n32Gb de Memória RAM%n2Tb de HD%nSistema Operacional Windows 10 (64 bits)%nAcompanha HD Externo de 1Tb%n");
            default:
                break;
        }
            
    }

    // Método que monta um computador e o adiciona ao carrinho com base na promoção selecionada 
    private void MontaComputador(int n, int i){
        
        HardwareBasico cpu;
        HardwareBasico ram;
        HardwareBasico hd;
        SistemaOperacional OS;
        MemoriaUSB musb;
        int m = 0;

        switch (n) {
            case 1:
                computadores[i] = new Computador("Apple", 2194);
                
                cpu = new HardwareBasico("Pentium Core i3", 2200, "Mhz");
                ram = new HardwareBasico("Memória RAM", 8, "Gb");
                hd = new HardwareBasico("HD", 500, "Gb");
                computadores[i].setHardwareBasico(cpu, 0);
                computadores[i].setHardwareBasico(ram, 1);
                computadores[i].setHardwareBasico(hd, 2);
                
                OS = new SistemaOperacional("macOS Sequoia", 64);
                computadores[i].setSistemaOperacional(OS);

                m=0;
                System.out.printf("%nDeseja adicionar memória USB?%n1_Confirmar%n2_Cancelar%n");
                m = scan.nextInt();
                if (m == 1){
                    musb = new MemoriaUSB("Pen-Drive", 16, "Gb");
                    computadores[i].addMemoriaUSB(musb);
                }

                System.out.printf("%nPedido adicionado ao carrinho.%n");
                break;

            case 2:
                computadores[i] = new Computador("Samsung", 3428);
                
                cpu = new HardwareBasico("Pentium Core i5", 3370, "Mhz");
                ram = new HardwareBasico("Memória RAM", 16, "Gb");
                hd = new HardwareBasico("HD", 1, "Tb");
                computadores[i].setHardwareBasico(cpu, 0);
                computadores[i].setHardwareBasico(ram, 1);
                computadores[i].setHardwareBasico(hd, 2);
                
                OS = new SistemaOperacional("Windows 8", 64);
                computadores[i].setSistemaOperacional(OS);

                m=0;
                System.out.printf("%nDeseja adicionar memória USB?%n1_Confirmar%n2_Cancelar%n");
                m = scan.nextInt();
                if (m == 1){
                    musb = new MemoriaUSB("Pen-Drive", 32, "Gb");
                    computadores[i].addMemoriaUSB(musb);
                }

                System.out.printf("%nPedido adicionado ao carrinho.%n");
                break;
            case 3:
                computadores[i] = new Computador("Dell", 7872);
                
                cpu = new HardwareBasico("Pentium Core i7", 4500, "Mhz");
                ram = new HardwareBasico("Memória RAM", 32, "Gb");
                hd = new HardwareBasico("HD", 2, "Tb");
                computadores[i].setHardwareBasico(cpu, 0);
                computadores[i].setHardwareBasico(ram, 1);
                computadores[i].setHardwareBasico(hd, 2);
                
                OS = new SistemaOperacional("Windows 10", 64);
                computadores[i].setSistemaOperacional(OS);

                m=0;
                System.out.printf("%nDeseja adicionar memória USB?%n1_Confirmar%n2_Cancelar%n");
                m = scan.nextInt();
                if (m == 1){
                    musb = new MemoriaUSB("HD externo", 1, "Tb");
                    computadores[i].addMemoriaUSB(musb);
                }

                System.out.printf("%nPedido adicionado ao carrinho.%n");
                break;
            
            default:
                break;
            
        }
    }
}
