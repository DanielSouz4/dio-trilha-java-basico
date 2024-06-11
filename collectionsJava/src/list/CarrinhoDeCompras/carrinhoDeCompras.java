package list.CarrinhoDeCompras;


import java.util.ArrayList;
import java.util.List;

public class carrinhoDeCompras {
    private List<Item>comprasList;

    public carrinhoDeCompras() {
        this.comprasList = new ArrayList<>();
    }

    public void adicionaCompras(String produto, double preco){
            comprasList.add(new Item(produto,preco));
    }
    public int quantidadeDeitens(){
        return comprasList.size();
    }
    public void somarValorCompras(){
        double soma = 0;
        for(Item i:comprasList){
            soma= soma+i.getPreco();
        }
        System.out.println("Soma total: "+soma);
    }
    public void removerProduto(String nome){
        List<Item>itemsParaRemover = new ArrayList<>();
        for(Item i: comprasList){
            if(i.getproduto().equalsIgnoreCase(nome)){
                itemsParaRemover.add(i);
            }
        }
        comprasList.removeAll(itemsParaRemover);
    }
    public void listarCompras(){
        System.out.println(comprasList);
    }


    //testando metodos
    public static void main(String[] args) {
        carrinhoDeCompras compra = new carrinhoDeCompras();

        compra.adicionaCompras("frango",21);
        compra.adicionaCompras("verduras",35.5);
        compra.adicionaCompras("arroz",16.5);


        System.out.println("Quantidade de itens no carrinho: "+compra.quantidadeDeitens());
        compra.listarCompras();
        compra.somarValorCompras();
        compra.removerProduto("frango");
        compra.listarCompras();
        System.out.println("Quantidade de itens no carrinho: "+compra.quantidadeDeitens());
        compra.somarValorCompras();




    }

}
