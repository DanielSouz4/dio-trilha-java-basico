package list.CarrinhoDeCompras;

public class Item{
    private String produto;
    private double preco;


    public Item(String produto, double preco) {
        this.produto = produto;
        this.preco = preco;
    }

    public String getproduto() {
        return produto;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Item{" +
                "produto='" + produto + '\'' +
                ", preco=" + preco +
                '}';
    }
}
