public class DescontoRegular implements Desconto {
    @Override
    public double calcularDesconto(double preco) {
        return preco * 0.9;
    }
}
