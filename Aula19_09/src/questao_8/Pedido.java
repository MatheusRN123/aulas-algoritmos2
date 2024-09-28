package questao_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

class Pedido {
    private int numero;
    private Date data;
    private List<Produto> produtos;

    public Pedido(int numero) {
        this.numero = numero;
        this.data = new Date();
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido Número: ").append(numero).append("\n");
        sb.append("Data: ").append(data).append("\n");
        sb.append("Produtos: \n");
        for (Produto produto : produtos) {
            sb.append(produto).append("\n");
        }
        sb.append("Valor Total: R$ ").append(String.format("%.2f", calcularValorTotal()));
        return sb.toString();
    }
}