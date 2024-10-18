public class LojaOnline {
    public static void main(String[] args) {

        Product produto1 = new Product("Camisa", 1000);
        Product produto2 = new Product("Calça", 1500);
        Product produto3 = new Product("Sapato", 2000);

        Compras carrinho = new Compras();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        carrinho.setDesconto(new DescontoNovo());
        System.out.println("Cliente Novo: R$ "+ carrinho.calcularTotalComDesconto());

        carrinho.setDesconto(new DescontoRegular());
        System.out.println("Cliente Regular: R$ "+ carrinho.calcularTotalComDesconto());

        carrinho.setDesconto(new DescontoVIP());
        System.out.println("Cliente Vip: R$ "+ carrinho.calcularTotalComDesconto());
    }
}