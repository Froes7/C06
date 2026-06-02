package Slide_09;

public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }
    
    public void addCarrinhoDeCompras(){
        System.out.printf("%nBrownie adicionado no carrinho de compras.%n");
    }

    public void calculaValorTotalCompra(){  
        System.out.printf("%nProduto: %s%nPreço: %f%n",nome,preco);
    }

    public void mostraInfo(){
        System.out.printf("%nNome do produto: %s%nPreço: %f%nSabor: %s%n",nome,preco,sabor);
    }
}
