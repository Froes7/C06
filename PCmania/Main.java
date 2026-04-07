public class Main {
    public static void main(String[] args){

        // Declaração de um novo cliente e chamada do método inicial do programa
        Cliente cliente = new Cliente("Chistopher de Souza Lima Francisco", "000.000.001-00");
        cliente.menu();

        // Declaração de um pedido e chamada de métodos para finalização da compra
        ProcessarPedido pedido = new ProcessarPedido(cliente.getPedidos(), cliente.calculaTotalCompra(), cliente.getNumeroPedidos());
        cliente.mostraCliente();
        pedido.Processar();
    }
}
