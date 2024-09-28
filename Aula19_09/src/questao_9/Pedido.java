package questao_9;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	private int numero;
    private Date data;
    private List<Produto> produtos;
    private Cliente cliente;

    public Pedido(int numero, Cliente cliente) {
        this.numero = numero;
        this.data = new Date();
        this.produtos = new ArrayList<>();
        this.cliente = cliente;
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
        sb.append(cliente).append("\n");
        sb.append("Produtos: \n");
        for (Produto produto : produtos) {
            sb.append(produto).append("\n");
        }
        sb.append("Valor Total: R$ ").append(String.format("%.2f", calcularValorTotal()));
        return sb.toString();
    }
}
