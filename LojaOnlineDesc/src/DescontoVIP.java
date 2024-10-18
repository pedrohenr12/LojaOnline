public class DescontoVIP implements Desconto {
    @Override
    public double calcularDesconto(double preco) {
        return preco * 0.8;
    }
}
