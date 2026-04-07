public class ProcessarPedido {
    
    // Declaração de variáveis
    private Computador[] pedidos;
    private float total;
    private int NumeroPedidos;
    
    // Construtor da classe ProcessarPedidos
    public ProcessarPedido(Computador[] carrinho, float total, int NumeroPedidos){
        this.pedidos = carrinho;
        this.total = total;
        this.NumeroPedidos = NumeroPedidos;
    }

    // Método de processamento do carrinho e impressão de informações da compra junto do seu valor final
    public void Processar(){
        if(NumeroPedidos != 0){
            for (int i = 0; i < NumeroPedidos; i++) {
                System.out.printf("%nProduto %d:%n", i+1);
                pedidos[i].mostraPcConfigs();
            }
            System.out.printf("%nPreço total: R$%.2f%nPedido enviado...%n", total);
        
        }
        else System.err.printf("%nCarrinho vazio, terminando sessão...%n");
    }
}