import java.util.ArrayList;
import java.util.List;

public class Compras {
    private List<Product> produtos = new ArrayList<>();
    private Desconto desconto;

    public void adicionarProduto(Product produto) {
        produtos.add(produto);
    }

    public void setDesconto(Desconto desconto) {
        this.desconto = desconto;
    }

    public double calcularTotalComDesconto() {
        double total = 0;
        for (Product produto : produtos) {
            total += desconto.calcularDesconto(produto.getPreco());
        }
        return total;
    }
}
