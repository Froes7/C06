package Slide_09;

public class Main {
    public static void main(String[] args){

        BrownieDoceDeLeite bwdocedeleite = new BrownieDoceDeLeite("BrownieDoceDeLeite", 100, "DoceDeLeite");
        BrownieNutella bwnutella = new BrownieNutella("BrownieNutella", 125, "Nutella");
        BrownieCafe bwcafe = new BrownieCafe("BrownieCafe", 100, "Cafe");

        bwdocedeleite.addCarrinhoDeCompras();
        bwdocedeleite.calculaValorTotalCompra();
        bwdocedeleite.mostraInfo();
        bwdocedeleite.adicionaDoceDeLeite();

        bwcafe.addCarrinhoDeCompras();
        bwcafe.calculaValorTotalCompra();
        bwcafe.mostraInfo();
        bwcafe.adicionaCafe();

        bwnutella.addCarrinhoDeCompras();
        bwnutella.calculaValorTotalCompra();
        bwnutella.mostraInfo();
        bwnutella.adicionaNutella();
        
    }
}