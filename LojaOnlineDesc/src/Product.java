public class Product {
    private String nome;
    private double preco;

    public Product(String nome, double precoBase) {
        this.nome = nome;
        this.preco = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
